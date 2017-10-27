package com.malex.repository;

import com.malex.model.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}
