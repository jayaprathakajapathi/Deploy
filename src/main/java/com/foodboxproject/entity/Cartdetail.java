package com.foodboxproject.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Cartdetail implements Serializable{
	@Id
	@GeneratedValue
    private int id;
	private String item_name;
	private String category_name;
	private String editopt;
	private Date date_added;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getEditopt() {
		return editopt;
	}
	public void setEditopt(String editopt) {
		this.editopt = editopt;
	}
	public Date getDate_added() {
		return date_added;
	}
	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}
	
	
	
}
