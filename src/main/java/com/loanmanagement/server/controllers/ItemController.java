package com.loanmanagement.server.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanmanagement.server.entities.ItemMaster;
import com.loanmanagement.server.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Items")
public class ItemController{
	private ItemService itemservice;
	
	public ItemController(ItemService itemservice) {
		this.itemservice = itemservice;
	}
	
	@PostMapping
	public ResponseEntity<ItemMaster> addItem(@Valid @RequestBody ItemMaster Item)
	{
		ItemMaster item = new ItemMaster(213,"Af","dafs","35","67","Aet");
		System.out.println("==================================================");
	System.out.print(item);	
		System.out.println("==================================================");
		itemservice.addItem(item);
		return new ResponseEntity<ItemMaster>(Item, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<ItemMaster> getAllItems(){
		return itemservice.getAll();
		
	}
}