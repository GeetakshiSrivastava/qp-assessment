package com.example.qpassessment.Entity;


import javax.persistence.GenerationType;

@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int inventory;
}
