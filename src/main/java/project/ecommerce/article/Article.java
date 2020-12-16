package project.ecommerce.article;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Article {

    @Id
    private int id;
    private String name;
    private int price;
}
