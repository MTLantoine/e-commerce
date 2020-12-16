package project.ecommerce.commande;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="commande")
public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
