package project.ecommerce.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="article")
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
