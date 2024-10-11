/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.service;

import org.apache.log4j.Logger;

/**
 *
 * @author wcordova
 */
public class NotificationService {
    
    private static final Logger logger = Logger.getLogger(ProductService.class);
    
    public void sendNotification(String message) {
        logger.info("Send notification: " + message);
    }
    
}
