package project.ecommerce.catalogue;

import lombok.Data;
import project.ecommerce.stock.Stock;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Catalogue {

    @Id
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "catalogue_id")
    private Set<Stock> stock = new HashSet<Stock>();

}
