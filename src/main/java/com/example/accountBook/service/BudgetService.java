package com.example.accountBook.service;

import com.example.accountBook.dto.BudgetRequestDto;
import com.example.accountBook.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public void save(BudgetRequestDto requestDto) {
        budgetRepository.save(requestDto.toEntity());
    }
}
