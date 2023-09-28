package com.home.order.entity;

import com.home.order.enums.DiscountTypeEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private DiscountTypeEnum discountType;
    private BigDecimal value;
    private LocalDateTime validFrom;
    private LocalDateTime validUntil;
    private String couponCode;

}
