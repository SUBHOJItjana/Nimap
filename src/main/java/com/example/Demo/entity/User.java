package com.example.Demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uid;
    private String name;
    private String logid;
    private String password;
    private List<Product> productList;
    private List<Category> categoryList;
}
