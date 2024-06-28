package com.pedro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.pedidos.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
