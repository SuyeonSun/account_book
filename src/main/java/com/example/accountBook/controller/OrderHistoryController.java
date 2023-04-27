package com.example.accountBook.controller;

import com.example.accountBook.dto.OrderHistoryRequestDto;
import com.example.accountBook.service.OrderHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderHistoryController {
    private final OrderHistoryService orderHistoryService;

    @PostMapping("/")
    public void save(@RequestBody OrderHistoryRequestDto requestDto) {
        orderHistoryService.save(requestDto);
    }
}
