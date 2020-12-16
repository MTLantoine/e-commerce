package project.ecommerce.stock;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Stock {

    @Id
    private int id;
    private int quantity;
}
