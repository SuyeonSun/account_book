package com.example.accountBook.service;

import com.example.accountBook.domain.OrderHistory;
import com.example.accountBook.dto.OrderHistoryItemResponseDto;
import com.example.accountBook.dto.OrderHistoryRequestDto;
import com.example.accountBook.repository.OrderHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderHistoryService {
    private final OrderHistoryRepository orderHistoryRepository;

    public void save(OrderHistoryRequestDto requestDto) {
        orderHistoryRepository.save(requestDto.toEntity());
    }

    @Transactional(readOnly = true)
    public List<OrderHistoryItemResponseDto> findAllItems() {
        // List<OrderHistoryItemResponseDto> list = new ArrayList<>();
        // orderHistoryRepository.findAll().forEach(item -> list.add(new OrderHistoryItemResponseDto(item)));
        // return list;
        return orderHistoryRepository.findAll().stream().map(history -> new OrderHistoryItemResponseDto(history)).collect(Collectors.toList());
    }
}
