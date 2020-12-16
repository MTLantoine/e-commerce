package project.ecommerce.stock;

import lombok.Data;
import project.ecommerce.article.Article;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Stock {

    @Id
    private int id;
    @OneToMany
    @JoinColumn(name = "stock_id")
    private Set<Article> article;
    private int quantity;
}
