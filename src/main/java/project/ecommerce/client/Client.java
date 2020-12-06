package project.ecommerce.client;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Client {

    @Id
    private int id;
    private String name;
    private String firstname;
    private String lastname;
}
