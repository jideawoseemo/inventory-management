package com.jidetech.product_service.service;

import com.jidetech.product_service.dto.ProductRequest;
import com.jidetech.product_service.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
