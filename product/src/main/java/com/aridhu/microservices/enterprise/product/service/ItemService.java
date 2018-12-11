package com.aridhu.microservices.enterprise.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aridhu.microservices.enterprise.product.service.domain.Item;
import com.aridhu.microservices.enterprise.product.service.mapper.ItemMapper;

@Service
public class ItemService {
	
	final private ItemMapper itemMapper;
	
	public ItemService(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}

	public List<Item> findAll() {
		return this.itemMapper.findAll();
	}

	public void saveItem(Item item) throws Exception{
		this.itemMapper.saveItem(item);
	}

}
