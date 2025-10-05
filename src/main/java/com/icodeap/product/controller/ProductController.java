package com.icodeap.product.controller;

import com.icodeap.product.entity.Product;
import com.icodeap.product.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    //GET
    //http://localhost:8080/api/products
    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }

    //POST
    //http://localhost:8080/api/products
    @PostMapping
    public Product save(@RequestBody Product product) {
        return repository.save(product);
    }

    //GET por ID
    //http://localhost:8080/api/products/{id}
    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }


    //PUT
    //http://localhost:8080/api/products/{id}
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        Product existingProduct = repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

    //DELETE
    //http://localhost:8080/api/products/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
