/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ciclo4.g20.interfaces;

import Ciclo4.g20.modelo.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author johnpaulvanegas
 */
public interface InterfaceProduct extends MongoRepository<Product, Integer> {
    
}
