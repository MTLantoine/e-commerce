package project.ecommerce.reduction;

import lombok.Data;
import project.ecommerce.client.Client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Reduction {

    @Id
    private int id;
    private int percent;
    private static int numberOfUse = 2;
    @OneToMany
    @JoinColumn(name = "reduction_id")
    Set<Client> clients = new HashSet<Client>();

}
