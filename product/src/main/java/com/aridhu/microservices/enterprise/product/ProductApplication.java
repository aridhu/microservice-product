package com.aridhu.microservices.enterprise.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import com.aridhu.microservices.enterprise.product.service.ItemService;
import com.aridhu.microservices.enterprise.product.service.domain.Item;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner{

	final private ItemService itemService;

	public ProductApplication(ItemService itemService) {
		this.itemService = itemService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\nAridhu Product Microservices...");
		// insert item table
		Item item = new Item();
		item.setItemNumber("DELL-1001");
		item.setDescription("DELL Laptop");
		item.setEosDate(new Date());
		item.setCreatedBy(4104L);
		item.setTenantId(8087L);
		item.setCreationDate(new Date());
		item.setLastUpdatedBy(9328L);
		item.setLastUpdatedDate(new Date());
		//this.itemService.saveItem(item);
		
		// query the item table
		List<Item> itemlist = this.itemService.findAll(); 
		System.out.println(itemlist.get(0).getDescription());
	}

}
