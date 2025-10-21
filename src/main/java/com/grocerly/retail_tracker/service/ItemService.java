package com.grocerly.retail_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerly.retail_tracker.model.ItemModel;
import com.grocerly.retail_tracker.repository.ItemRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
	
	@Autowired
	private final ItemRepository itemRepo;
	
	public ItemService(ItemRepository itemRepo) {
		this.itemRepo = itemRepo;
	}
	
	public List<ItemModel> getAllItems(){
		return itemRepo.findAll();
	}
	
	public void addItem(ItemModel item) {
		itemRepo.save(item);
	}
	
	public void deleteItem(int id) {
		itemRepo.deleteById(id);
	}
	
	public ItemModel getItem(int id) {
		Optional<ItemModel> item = itemRepo.findById(id);
		
		if(item.isPresent()) {
			return item.get();
		}else {
			System.out.println("This item could not be found!");
			return null;
		}

	}
}
