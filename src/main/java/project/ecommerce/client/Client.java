package project.ecommerce.client;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Data
public class Client {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private int money;
}
