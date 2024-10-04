/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import umg.edu.gt.progra.ApiStore.model.Product;

/**
 *
 * @author wcordova
 */
@Service
public class ProductService {
    
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;
    
    public List<Product> findAll() {
        return products;
    }
    
    public Optional<Product> findById(Long productId) {
        return products.stream().filter(p -> p.getProductId().equals(productId)).findFirst();
    }
    
    public Product save(Product product) {
        product.setProductId(nextId++);
        products.add(product);
        return product;
    }
    
    public boolean deleteById(Long productId) {
        return products.removeIf(p -> p.getProductId().equals(productId));
    }
    
    public Optional<Product> update(Long productId, Product product) {
        Optional<Product> existingProduct = findById(productId);
        if(existingProduct.isPresent()) {
            Product p = existingProduct.get();
            p.setName(product.getName());
            p.setDescription(product.getDescription());
            p.setPrice(product.getPrice());
            return Optional.of(p);
        }
        return Optional.empty();
    }
    
    
    
}
