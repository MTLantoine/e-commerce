package project.ecommerce.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(path="clients")
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
