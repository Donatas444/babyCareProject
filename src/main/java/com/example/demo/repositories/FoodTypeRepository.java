package com.example.demo.repositories;

import com.example.demo.models.Feeding;
import com.example.demo.models.FoodType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTypeRepository extends CrudRepository<FoodType, Long> {
}
