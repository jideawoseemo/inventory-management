package com.jidetech.inventory_service.service;

import com.jidetech.inventory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;


@RequiredArgsConstructor
@Slf4j
@Service
public class InventoryServiceImpl implements InventoryService{

    private final InventoryRepository inventoryRepository;

    @Override
    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
    return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
