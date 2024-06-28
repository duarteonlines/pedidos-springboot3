package com.pedro.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedro.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
