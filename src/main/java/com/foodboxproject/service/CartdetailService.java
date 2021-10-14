package com.foodboxproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.foodboxproject.entity.Cartdetail;

import com.foodboxproject.entity.repository.CartdetailRepository;

@Service
public class CartdetailService {

	@Autowired
	CartdetailRepository cartdetailRepository;

	@Autowired
	

	public List getAlldetails() {
		List details = new ArrayList();
		cartdetailRepository.findAll().forEach(foodbox -> details.add(foodbox));
		return details;
	}

	public Cartdetail getCartdetailById(int id) {
		return cartdetailRepository.findById(id).get();
	}

	
	public void saveOrUpdate(Cartdetail cartdetail) {
		
		cartdetailRepository.save(cartdetail);
	}

	public void delete(int id) {
		cartdetailRepository.deleteById(id);
	}
}