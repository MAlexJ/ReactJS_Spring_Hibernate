package com.malex.service;

import com.malex.model.entity.ArticleEntity;

import java.util.List;

public interface ArticleService {
    ArticleEntity save(ArticleEntity entity);

    ArticleEntity update(ArticleEntity entity);

    void delete(Long id);

    ArticleEntity findById(Long id);

    List<ArticleEntity> findAll();
}
