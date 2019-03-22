package funcBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import funcBlog.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}