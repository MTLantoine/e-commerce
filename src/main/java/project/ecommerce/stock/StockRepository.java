package project.ecommerce.stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="stock")
public interface StockRepository extends JpaRepository<Stock, Integer> {
}
