package com.pedro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.pedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
