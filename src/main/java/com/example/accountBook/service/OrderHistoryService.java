package com.example.accountBook.service;

import com.example.accountBook.dto.OrderHistoryRequestDto;
import com.example.accountBook.repository.OrderHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderHistoryService {
    private final OrderHistoryRepository orderHistoryRepository;

    public void save(OrderHistoryRequestDto requestDto) {
        orderHistoryRepository.save(requestDto.toEntity());
    }
}
