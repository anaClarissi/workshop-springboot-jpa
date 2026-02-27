package com.anaclarissi.web_service.services;

import com.anaclarissi.web_service.entities.Product;
import com.anaclarissi.web_service.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {

        List<Product> list = productRepository.findAll();

        return list;

    }

    public Product findById(Long id) {

        Optional<Product> product = productRepository.findById(id);

        return product.get();

    }

}
