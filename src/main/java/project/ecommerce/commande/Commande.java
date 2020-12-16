package project.ecommerce.commande;

import lombok.Data;
import project.ecommerce.article.Article;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;

@Entity
@Data
public class Commande {

    @Id
    private int id = 1;
    private HashMap<Integer, Integer> articles = new HashMap<Integer, Integer>();
    private int totalPrice = 0;

    public void setMap(int articleId, int quantity) {
        articles.put(articleId, quantity);
    }

    public void resetMap() {
        articles = new HashMap<Integer, Integer>();
    }

}
