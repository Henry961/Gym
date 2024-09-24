package com.project.gym.service;

import com.project.gym.entity.ProductoEntity;
import com.project.gym.manager.ProductoManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoService {

    private final ProductoManager productoManager;

    public ProductoService(ProductoManager productoManager) {
        this.productoManager = productoManager;
    }

    @PostMapping("/create")
    public ProductoEntity save(@RequestBody ProductoEntity productoEntity) {
        return productoManager.save(productoEntity);
    }

    @GetMapping("/find")
    public List<ProductoEntity> findAll() {
        return productoManager.findAll();
    }

    @GetMapping("/{idProducto}")
    public ProductoEntity findById(@PathVariable("idProducto") Long id) {
        return productoManager.findById(id);
    }

    @DeleteMapping("/{idProducto}")
    public void deleteById(@PathVariable("idProducto") Long id) {
        productoManager.deleteById(id);
    }

    @PutMapping("/update")
    public ProductoEntity update(@RequestBody ProductoEntity productoEntity) {

        ProductoEntity productoEntityDB = productoManager.findById(productoEntity.getIdProducto());
        productoEntityDB.setNombre(productoEntity.getNombre());
        productoEntityDB.setPrecio(productoEntity.getPrecio());

        return productoManager.update(productoEntityDB);
    }

}
