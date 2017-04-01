package com.team.domain.repository;

import com.team.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by BLACK on 2017/3/23.
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,String> {
}
