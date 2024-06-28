package com.pedro.vendas.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.pedro.vendas.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Pedro", "pedro@pedro", "9999999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
