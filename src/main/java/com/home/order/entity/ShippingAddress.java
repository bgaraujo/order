package com.home.order.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String postalCode;
    private String street;
    private Long number;
    private String state;
    private String city;
    private String complement;

    @OneToOne
    private Location location;
}
