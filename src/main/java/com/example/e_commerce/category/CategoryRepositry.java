package com.example.e_commerce.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_commerce.entities.Category;

@Repository
public interface CategoryRepositry extends JpaRepository<Category, Long> {

    Category findByCategory(String category);

}
