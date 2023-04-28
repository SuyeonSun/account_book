package com.example.accountBook.dto;

import com.example.accountBook.domain.OrderHistory;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class OrderHistoryItemResponseDto {
    private Long id;

    private LocalDate orderDate;

    private int orderPrice;

    public OrderHistoryItemResponseDto(OrderHistory entity) {
        this.id = entity.getId();
        this.orderDate = entity.getOrderDate();
        this.orderPrice = entity.getOrderPrice();
    }
}
