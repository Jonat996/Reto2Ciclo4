/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceSupplements;
import Reto2_Web.modelo.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class ProductRepository {
    @Autowired
    private InterfaceSupplements repository;

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Optional<Product> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Product create(Product product) {
        return repository.save(product);
    }

    public void update(Product product) {
        repository.save(product);
    }
    
    public void delete(Product product) {
        repository.delete(product);
    }
}
