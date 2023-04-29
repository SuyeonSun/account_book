package com.example.accountBook.service;

import com.example.accountBook.domain.OrderHistory;
import com.example.accountBook.dto.OrderHistoryItemResponseDto;
import com.example.accountBook.dto.OrderHistorySaveRequestDto;
import com.example.accountBook.dto.OrderHistoryUpdateRequestDto;
import com.example.accountBook.repository.OrderHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderHistoryService {
    private final OrderHistoryRepository orderHistoryRepository;

    @Transactional(readOnly = false)
    public void save(OrderHistorySaveRequestDto requestDto) {
        orderHistoryRepository.save(requestDto.toEntity());
    }

    @Transactional(readOnly = true)
    public List<OrderHistoryItemResponseDto> findAllItems() {
        // List<OrderHistoryItemResponseDto> list = new ArrayList<>();
        // orderHistoryRepository.findAll().forEach(item -> list.add(new OrderHistoryItemResponseDto(item)));
        // return list;
        return orderHistoryRepository.findAll().stream().map(history -> new OrderHistoryItemResponseDto(history)).collect(Collectors.toList());
    }

    @Transactional(readOnly = false)
    public void update(Long id, OrderHistoryUpdateRequestDto requestDto) {
        OrderHistory orderHistory = orderHistoryRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다. id="+ id));
        orderHistory.update(requestDto.getOrderDate(), requestDto.getOrderPrice());
    }
}
