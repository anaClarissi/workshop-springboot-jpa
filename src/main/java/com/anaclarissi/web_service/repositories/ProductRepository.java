package com.anaclarissi.web_service.repositories;

import com.anaclarissi.web_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
