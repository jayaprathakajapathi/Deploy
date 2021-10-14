package com.foodboxproject.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Foodbox implements Serializable {
	@Id
	@GeneratedValue
	private int item_no;
	private int category_id;
	private String category_name ;

	private String item_name;
    private double price;
	private String editopt;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategoty_name(String category_name) {
		this.category_name = category_name;
	}
	public int getItem_no() {
		return item_no;
	}
	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEditopt() {
		return editopt;
	}
	public void setEditopt(String editopt) {
		this.editopt = editopt;
	}
	 
	
}
 
