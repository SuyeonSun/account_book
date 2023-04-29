package com.example.accountBook.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class OrderHistoryUpdateRequestDto {
    private LocalDate orderDate;

    private int orderPrice;

    @Builder
    public OrderHistoryUpdateRequestDto(LocalDate orderDate, int orderPrice) {
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
    }
}
