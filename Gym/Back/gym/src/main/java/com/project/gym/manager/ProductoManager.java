package com.project.gym.manager;

import com.project.gym.entity.ProductoEntity;

import java.util.List;

public interface ProductoManager {

    ProductoEntity save(ProductoEntity productoEntity);
    List<ProductoEntity> findAll();
    ProductoEntity findById(Long id);
    void deleteById(Long id);
    ProductoEntity update(ProductoEntity productoEntity);

}
