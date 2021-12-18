/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclo4.g20.repositorio.crud;

import Ciclo4.g20.modelo.Product;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Juan Manuel Naranjo
 */
public interface ProductCrudRepositorio extends MongoRepository<Product, Integer>{
    public List<Product> findByPriceLessThanEqual(double precio);
    //Reto 5

    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Product> findByDescriptionLike(String description);    
}
