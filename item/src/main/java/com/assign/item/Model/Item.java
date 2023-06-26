package com.assign.item.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//item ID, name, description, quantity, etc.

@Entity
@Table(name="Item")

public class Item {
//	
//	@ManyToMany(mappedBy = "items")
//    private List<Employee> employees;
//	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Item_id;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String itemName;
	private Long empId;
	
	@Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
	private Boolean status;
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Item(long item_id, String Name, boolean itemStatus) {
		super();
		Item_id = item_id;
		itemName = Name;
		status = itemStatus;
	}
	public long getItem_id() {
		return Item_id;
	}
	public void setItem_id(long item_id) {
		Item_id = item_id;
	}
	public String getName() {
		return itemName;
	}
	public void setName(String name) {
		itemName = name;
	}
}