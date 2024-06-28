package com.pedro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.pedidos.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
