package com.loanmanagement.server.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.loanmanagement.server.entities.ItemMaster;
import com.loanmanagement.server.repositories.ItemMasterRepository;

public interface ItemService {
	ItemMaster addItem(ItemMaster item);
	List<ItemMaster> getAll();
}
