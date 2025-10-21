package com.grocerly.retail_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocerly.retail_tracker.model.ItemModel;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Integer>{
	
}
