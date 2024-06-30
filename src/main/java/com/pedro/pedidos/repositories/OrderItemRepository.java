package com.pedro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.pedidos.entities.OrderItem;
import com.pedro.pedidos.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
