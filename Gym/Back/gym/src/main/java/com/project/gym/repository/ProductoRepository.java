package com.project.gym.repository;

import com.project.gym.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <ProductoEntity, Long> {
}
