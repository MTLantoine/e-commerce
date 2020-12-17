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

    @OneToMany
    @JoinColumn(name = "reduction_id")
    private Set<Client> stock = new HashSet<Client>();;

}
