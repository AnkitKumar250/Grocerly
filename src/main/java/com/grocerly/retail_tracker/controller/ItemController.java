package com.grocerly.retail_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.grocerly.retail_tracker.model.ItemModel;
import com.grocerly.retail_tracker.service.ItemService;
import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	
	@Autowired
	private final ItemService itemService;
	
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping
	public List<ItemModel> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/{id}")
	public ItemModel getItemDetails(@PathVariable("id") int id) {
		return itemService.getItem(id);
	}
	
	@PostMapping("/add")
	public String addItem(@RequestBody ItemModel item) {
		itemService.addItem(item);
		return "item added successfully: ";
		
	}
         
}
