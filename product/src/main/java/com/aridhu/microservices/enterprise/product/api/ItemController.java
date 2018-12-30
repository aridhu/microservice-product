package com.aridhu.microservices.enterprise.product.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aridhu.microservices.enterprise.product.service.ItemService;
import com.aridhu.microservices.enterprise.product.service.domain.Item;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/v1/item")
@Api
public class ItemController {
	
	private final ItemService itemService;
	
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping(path="/list")
	public ResponseEntity<List<Item>> listItem() {
		List<Item> itemlist = itemService.findAll();
		return new ResponseEntity<List<Item>>(itemlist, HttpStatus.OK);
	}
	
	@GetMapping(path="/find")
	public ResponseEntity<Item> findItem(@RequestParam ("itemNumber") String itemNumber) {
		Item item = itemService.findItem(itemNumber);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	@PostMapping(path="/save")
	public ResponseEntity<Item> saveItem(Item item) {
		try {
			item = itemService.saveItem(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Item>(item, HttpStatus.OK); 
	}
	
	

}
