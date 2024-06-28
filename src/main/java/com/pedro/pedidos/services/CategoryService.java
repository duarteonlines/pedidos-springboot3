package com.pedro.pedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pedro.pedidos.entities.Category;
import com.pedro.pedidos.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(@PathVariable Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
