package project.ecommerce.catalogue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ecommerce.stock.Stock;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path="/catalogue")
public class CatalogueController {

    @Autowired
    private CatalogueRepository catalogueRepository;

    @GetMapping("not-empty")
    public Set<Stock> getNotEmptyStock() {
        return catalogueRepository.findById(1).get().getStock();
    }
}
