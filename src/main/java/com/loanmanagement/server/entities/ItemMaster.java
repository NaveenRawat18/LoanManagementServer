package com.loanmanagement.server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "Item_Master1")
public class ItemMaster {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	//@Column(name="item_id")
	private Integer ItemId;
	//@Column(name="item_category",nullable = false)
	private String ItemCategory;
	//@Column(name="item_description",nullable = false)
	private String ItemDescription;
	//@Column(name="item_value")
	private String ItemValue;
//	@Pattern(regexp="(Y|N)")
	//@Column(name="issue_status")
	private String issueStatus;
	//@Column(name="item_make")
	private String ItemMake;
	public ItemMaster(Integer i, String string, String string2, String j, String k, String string3) {
		// TODO Auto-generated constructor stub
		this.ItemId=i;
		this.ItemCategory=string;
		this.ItemDescription=string2;
		this.ItemValue= j;
		this.ItemMake=string3;
		this.issueStatus=k;
		
		
	}
}