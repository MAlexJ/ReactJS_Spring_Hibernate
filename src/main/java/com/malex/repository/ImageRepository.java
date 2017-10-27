package com.malex.repository;

import com.malex.model.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
