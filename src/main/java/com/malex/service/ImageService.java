package com.malex.service;

import com.malex.model.entity.ImageEntity;

import java.util.List;

public interface ImageService {
    ImageEntity save(ImageEntity entity);

    ImageEntity update(ImageEntity entity);

    void delete(Long id);

    ImageEntity findById(Long id);

    List<ImageEntity> findAll();
}
