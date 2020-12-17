package project.ecommerce.article;

import lombok.Data;
import project.ecommerce.stock.Stock;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Article {

    @Id
    private int id;
    private String name;
    private int price;

    @OneToOne
    private Stock stock;
}
