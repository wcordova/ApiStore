/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.model;

import lombok.Data;

/**
 *
 * @author wcordova
 */
@Data
public class Product {
    
    private Long productId;
    private String name;
    private double price;
    private String description;
    
    @Override
    public String toString() {
        return "Product{"
                + "id =" + productId
                + ", name = '" + name + "\""
                + ", price = '" + price + "\""
                + ", description = '" + description
                ;
    }   
    

}
