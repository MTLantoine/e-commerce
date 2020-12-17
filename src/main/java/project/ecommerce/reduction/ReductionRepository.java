package project.ecommerce.reduction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="reduction")
public interface ReductionRepository extends JpaRepository<Reduction, Integer> {
}
