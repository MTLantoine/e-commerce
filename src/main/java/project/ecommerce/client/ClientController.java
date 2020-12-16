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


}
