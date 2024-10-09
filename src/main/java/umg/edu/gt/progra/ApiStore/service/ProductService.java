/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.gt.progra.ApiStore.controller.ProductController;
import umg.edu.gt.progra.ApiStore.model.Product;
import umg.edu.gt.progra.ApiStore.repository.ProductRepository;

/**
 *
 * @author wcordova
 */
@Service
public class ProductService {
    
    private static final Logger logger = Logger.getLogger(ProductService.class);
    
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> findAll() {
        //productRepository
        logger.info("prepare find All");
        return productRepository.findAll();
    }
    
    public Optional<Product> findById(Long productId) {
        //return products.stream().filter(p -> p.getProductId().equals(productId)).findFirst();
        return productRepository.findById(productId);
    }
    
    public Product save(Product product) {
//        product.setProductId(nextId++);
//        products.add(product);
//        return product;
        return productRepository.save(product);
    }
    
    public boolean deleteById(Long productId) {
        //return products.removeIf(p -> p.getProductId().equals(productId));
        if(productRepository.existsById(productId)) {            
            productRepository.deleteById(productId);
            return true;
        } 
        return false;
    }
    
    public Optional<Product> update(Long productId, Product product) {
        Optional<Product> existingProduct = findById(productId);
        if(existingProduct.isPresent()) {
            Product p = existingProduct.get();
            p.setName(product.getName());
            p.setDescription(product.getDescription());
            p.setPrice(product.getPrice());
            return Optional.of(productRepository.save(p));
        }
        return Optional.empty();

        
    }
    
    
    
}
