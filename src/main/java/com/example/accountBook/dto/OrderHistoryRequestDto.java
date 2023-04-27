package com.example.accountBook.dto;

import com.example.accountBook.domain.OrderHistory;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderHistoryRequestDto {
    private int orderPrice;

    public OrderHistory toEntity() {
        return OrderHistory.builder()
                .orderPrice(this.orderPrice)
                .build();
    }
}
