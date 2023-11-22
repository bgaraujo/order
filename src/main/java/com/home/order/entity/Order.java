package com.home.order.entity;

import com.home.order.enums.StatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private StatusEnum status;
    private ShippingAddress deliveryAddress;
    private List<Item> itens;
    private Discount discount; //ToDO create discount service


}
