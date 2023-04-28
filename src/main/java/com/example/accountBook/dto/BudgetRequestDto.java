package com.example.accountBook.dto;
import com.example.accountBook.domain.Budget;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class BudgetRequestDto {
    private int budget;

    private LocalDate startDate;

    private LocalDate endDate;

    public Budget toEntity() {
        return Budget.builder()
                .budget(budget)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
