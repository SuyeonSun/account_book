package com.example.accountBook.dto;

import com.example.accountBook.domain.OrderHistory;

import java.time.LocalDate;

public class OrderHistoryItemResponseDto {
    private Long id;

    private LocalDate orderDate;

    private int orderPrice;

    // TODO
    public OrderHistoryItemResponseDto(OrderHistory entity) {
        this.id = entity.getId();
        this.orderDate = entity.getOrderDate();
        this.orderPrice = entity.getOrderPrice();
    }
}
