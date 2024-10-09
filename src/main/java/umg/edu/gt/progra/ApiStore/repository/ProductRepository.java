/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.gt.progra.ApiStore.model.Product;

/**
 *
 * @author wcordova
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
