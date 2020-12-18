package project.ecommerce.client;

import lombok.Data;
import project.ecommerce.reduction.Reduction;

import javax.persistence.*;

@Entity
@Data
public class Client {

    @Id
    private int id;
    private String login;
    private String passwd;
    private int money;

    public String getLogin() {
        return login;
    }

    public String getPasswd() {
        return passwd;
    }
    @OneToOne
    @JoinColumn(name = "reduction_id")
    private Reduction reduction;
}
