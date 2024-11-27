package com.example.Demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}

	public Object getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategory(Object category2) {
		// TODO Auto-generated method stub
		
	}

}
