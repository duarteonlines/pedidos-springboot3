package com.pedro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.pedidos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
