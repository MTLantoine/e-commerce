package project.ecommerce.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.ecommerce.commande.Commande;
import project.ecommerce.commande.CommandeRepository;
import project.ecommerce.exception.NoExistingCommandException;
import project.ecommerce.exception.NotEnoughMoneyException;
import project.ecommerce.stock.Stock;
import project.ecommerce.stock.StockRepository;

import java.util.Optional;

@RestController
@RequestMapping(path="/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CommandeRepository commandeRepository;

    @PostMapping("{clientId}/buy-command")
    public ResponseEntity<Client> clientBuyProduct(@PathVariable("clientId") int clientId) throws NoExistingCommandException, NotEnoughMoneyException {
        Client client = clientRepository.findById(clientId).get();
        Boolean isThereCommande = commandeRepository.findById(1).isPresent();
        if (!isThereCommande || commandeRepository.findById(1).get().getArticles().isEmpty()) {
            throw new NoExistingCommandException("Aucune commande n'a encore été créée.");
        }
        Commande commande = commandeRepository.findById(1).get();
        int totalPrice = commande.getTotalPrice();
        if (client.getMoney() >= totalPrice) {
            client.setMoney(client.getMoney() - totalPrice);
            commande.setTotalPrice(0);
            commande.resetMap();
        } else {
            throw new NotEnoughMoneyException("Le client n'a pas assez d'argent pour payer la commande.");
        }
        commandeRepository.save(commande);

        final Client updatedClient = clientRepository.save(client);
        return ResponseEntity.ok(updatedClient);
    }

}
