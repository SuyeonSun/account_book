package com.example.accountBook.controller;

import com.example.accountBook.dto.BudgetRequestDto;
import com.example.accountBook.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/budget")
public class BudgetController {
    private final BudgetService budgetService;

    @PostMapping("")
    public void save(@RequestBody BudgetRequestDto requestDto) {
        budgetService.save(requestDto);
    }
}
