package com.motivity.springdatajpa.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator" )

    @SequenceGenerator(name = "product_generator",sequenceName = "product_sequence_generator", allocationSize = 15)
    private int id;
    @Column(name="Product_Name" ,nullable = false)
    private String name;
    @Column(name="Price")
    private double price;
    @Column(name="Quantity")
    private int quantity;
    @Column(name="isActive")
    private boolean active;
    @Column(name="Product_imgUrl")
    private String imageUrl;

    private LocalDateTime createdDate;

    private LocalDateTime lastUpdatedDate;


}
