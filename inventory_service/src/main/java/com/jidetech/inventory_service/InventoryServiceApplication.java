package com.jidetech.inventory_service;

import com.jidetech.inventory_service.model.Inventory;
import com.jidetech.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){

		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("iphone_13_red");
			inventory.setQuantity(0);

			Inventory inventory2 = new Inventory();
			inventory.setSkuCode("iphone_13_blue");
			inventory.setQuantity(3);
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}
}
