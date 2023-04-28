package com.example.accountBook.dto;
import com.example.accountBook.domain.OrderHistory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class OrderHistoryRequestDto {
    private LocalDate orderDate;
    private int orderPrice;

    public OrderHistory toEntity() {
        return OrderHistory.builder()
                .orderDate(orderDate)
                .orderPrice(orderPrice)
                .build();
    }
}
