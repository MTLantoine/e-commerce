package project.ecommerce.commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ecommerce.article.Article;
import project.ecommerce.article.ArticleRepository;
import project.ecommerce.client.Client;
import project.ecommerce.client.ClientRepository;
import project.ecommerce.stock.Stock;
import project.ecommerce.stock.StockRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path="/commande")
public class CommandeController {

    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping("add-command/{articleId}/{quantity}")
    public ResponseEntity<Commande> addCommand(@PathVariable("articleId") int articleId, @PathVariable("quantity") int quantity) {
        Commande command = commandeRepository.findById(1).isPresent() ? commandeRepository.findById(1).get() : new Commande();
        Stock stock = stockRepository.findById(articleId).get();
        int stockQuantity = stock.getQuantity();
        int quantityMax = quantity <= stockQuantity ? quantity : stockQuantity;
        command.setMap(articleId, quantityMax);
        stock.setQuantity(stock.getQuantity() - quantityMax);
        final Commande updatedCommande = commandeRepository.save(command);
        return ResponseEntity.ok(updatedCommande);
    }

}
