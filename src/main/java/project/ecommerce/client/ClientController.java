package project.ecommerce.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.ecommerce.stock.Stock;
import project.ecommerce.stock.StockRepository;

import java.util.Optional;

@RestController
@RequestMapping(path="/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private StockRepository stockRepository;

    @PostMapping("{clientId}/buy/{quantity}/{stockId}")
    public ResponseEntity<Client> clientBuyProduct(@PathVariable("clientId") int clientId, @PathVariable("quantity") int quantity, @PathVariable("stockId") int stockId) {
        Client client = clientRepository.findById(clientId).get();
        Stock stock = stockRepository.findById(stockId).get();
        int stockQuantity = stock.getQuantity();
        int quantityMax = quantity <= stockQuantity ? quantity : stockQuantity;
        if (quantityMax * stock.getPrice() <= client.getMoney()) {
            client.setMoney(client.getMoney() - (quantityMax * stock.getPrice()));
            stock.setQuantity(stock.getQuantity() - quantityMax);
        }
        final Client updatedClient = clientRepository.save(client);
        return ResponseEntity.ok(updatedClient);
    }

}
