package com.example.accountBook.controller;

import com.example.accountBook.domain.OrderHistory;
import com.example.accountBook.dto.OrderHistoryItemResponseDto;
import com.example.accountBook.dto.OrderHistoryRequestDto;
import com.example.accountBook.service.OrderHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-history")
public class OrderHistoryController {
    private final OrderHistoryService orderHistoryService;

    @PostMapping("")
    public void save(@RequestBody OrderHistoryRequestDto requestDto) {
        orderHistoryService.save(requestDto);
    }

    @GetMapping("/list")
    public List<OrderHistoryItemResponseDto> findAllItems() {
        return orderHistoryService.findAllItems();
    }
}
