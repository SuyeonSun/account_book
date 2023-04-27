package com.example.accountBook.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class OrderHistory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate orderDate;

    private int orderPrice;

    @Builder
    public OrderHistory(LocalDate orderDate, int orderPrice) {
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
    }
}
