package com.foodboxproject.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.foodboxproject.entity.Foodbox;


public interface FoodboxRepository extends JpaRepository<Foodbox, Integer> {

}