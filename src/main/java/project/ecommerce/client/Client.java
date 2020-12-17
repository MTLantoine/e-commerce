package project.ecommerce.client;

import lombok.Data;
import project.ecommerce.reduction.Reduction;

import javax.persistence.*;

@Entity
@Data
public class Client {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private int money;

    @OneToOne
    @JoinColumn(name = "reduction_id")
    private Reduction reduction;
}
