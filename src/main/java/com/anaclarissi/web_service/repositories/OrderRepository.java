package com.anaclarissi.web_service.repositories;

import com.anaclarissi.web_service.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
