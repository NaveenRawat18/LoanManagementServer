package com.loanmanagement.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loanmanagement.server.entities.ItemMaster;

public interface ItemMasterRepository extends JpaRepository<ItemMaster,String >{
	

}
