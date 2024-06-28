package com.pedro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.pedidos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
