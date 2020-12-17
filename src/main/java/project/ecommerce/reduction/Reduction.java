package project.ecommerce.reduction;

import lombok.Data;
import project.ecommerce.client.Client;

import javax.persistence.*;

@Entity
@Data
public class Reduction {

    @Id
    private int id;
    private int percent;
    private int numberOfUse = 2;

    @OneToOne
    private Client client;

}
