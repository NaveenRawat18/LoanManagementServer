package com.loanmanagement.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loanmanagement.server.entities.ItemMaster;
import com.loanmanagement.server.repositories.ItemMasterRepository;

import org.springframework.http.HttpStatus;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMasterRepository itemMasterRepository;
	
	public ItemMaster addItem(ItemMaster Item) {
		
		 itemMasterRepository.save(Item);
		 return Item;
		
	}
	
	public List<ItemMaster> getAll() {
		// TODO Auto-generated method stub
		return itemMasterRepository.findAll();
	}

}