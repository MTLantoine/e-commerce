package project.ecommerce.stock;

import lombok.Data;
import project.ecommerce.article.Article;

import javax.persistence.*;

@Entity
@Data
public class Stock {

    @Id
    private int id;
    private int quantity;
    @OneToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
