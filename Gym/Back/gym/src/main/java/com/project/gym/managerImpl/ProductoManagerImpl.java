package com.project.gym.managerImpl;

import com.project.gym.entity.ProductoEntity;
import com.project.gym.exception.ResourceNotFoundException;
import com.project.gym.repository.ProductoRepository;
import com.project.gym.manager.ProductoManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoManagerImpl implements ProductoManager {

    private final ProductoRepository productoRepository;

    public ProductoManagerImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public ProductoEntity save(ProductoEntity productoEntity) {
        return productoRepository.save(productoEntity);
    }

    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public ProductoEntity findById(Long id) {

        ProductoEntity productoEntity = productoRepository.findById(id).orElseThrow(
                () ->{
                    throw new ResourceNotFoundException("Producto con id " + id + " no se encuentra");
                }
        );

        return productoEntity;
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public ProductoEntity update(ProductoEntity productoEntity) {
        return productoRepository.save(productoEntity);
    }
}
