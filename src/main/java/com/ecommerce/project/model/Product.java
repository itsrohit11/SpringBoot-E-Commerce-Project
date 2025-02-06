package com.ecommerce.project.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long product_id;
    private String product_name;
    private String product_description;
    private Double product_price;
    private Integer quantity;
    private Double special_price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
