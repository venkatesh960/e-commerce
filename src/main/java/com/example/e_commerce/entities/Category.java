package com.example.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name="category")
@Getter @Setter
public class Category extends BaseEntity {

    @Column(name="category")
    private String category;

    @Column(name="description")
    private String description;

}
