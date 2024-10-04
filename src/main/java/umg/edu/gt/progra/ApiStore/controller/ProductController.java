/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.edu.gt.progra.ApiStore.model.Product;
import umg.edu.gt.progra.ApiStore.service.ProductService;

/**
 *
 * @author wcordova
 */
@RestController 
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    
    @GetMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable Long productId) {
        return productService.findById(productId);
    }
    
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }
    
    @PutMapping("/{productId}")
    public Optional<Product> updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        return productService.update(productId, product);
    }
    
    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable Long productId) {
        boolean deleted = productService.deleteById(productId);        
        return deleted ? "Producto eliminado" : "Producto no eliminado";
    }
    
}
