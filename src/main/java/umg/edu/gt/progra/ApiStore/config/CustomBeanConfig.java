/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import umg.edu.gt.progra.ApiStore.service.NotificationService;

/**
 *
 * @author wcordova
 */
@Configuration
public class CustomBeanConfig {
    
    @Bean
    public NotificationService notificationService() {
        return new NotificationService();
    }   
    

}
