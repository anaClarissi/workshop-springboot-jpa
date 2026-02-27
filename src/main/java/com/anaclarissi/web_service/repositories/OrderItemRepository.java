package com.anaclarissi.web_service.repositories;

import com.anaclarissi.web_service.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
