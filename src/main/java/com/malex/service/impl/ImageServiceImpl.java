package com.malex.service.impl;

import com.malex.model.entity.ImageEntity;
import com.malex.repository.ImageRepository;
import com.malex.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository repository;

    @Override
    public ImageEntity save(ImageEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public ImageEntity update(ImageEntity entity) {
        return repository.saveAndFlush(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public ImageEntity findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<ImageEntity> findAll() {
        return repository.findAll();
    }
}
