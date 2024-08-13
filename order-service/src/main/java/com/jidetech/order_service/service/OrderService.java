package com.jidetech.order_service.service;


import com.jidetech.order_service.dto.OrderRequest;
import org.springframework.stereotype.Service;


public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
