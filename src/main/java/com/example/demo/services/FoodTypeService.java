package com.example.demo.services;

import com.example.demo.models.Baby;
import com.example.demo.models.Feeding;
import com.example.demo.models.FoodType;
import com.example.demo.repositories.FoodTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeService {

    @Autowired
    private FoodTypeRepository foodTypeRepository;

    public List<FoodType> getAllFoodTypes() {
        return (List<FoodType>) foodTypeRepository.findAll();
    }
    public FoodType getFoodTypeById(Long foodTypeId) {
        return foodTypeRepository.findById(foodTypeId).get();
    }


    public void addFoodType(FoodType foodType) {
        foodTypeRepository.save(foodType);
    }


    public void removeFoodType(FoodType foodType){
        foodTypeRepository.delete(foodType);
    }


    public void updateFoodType(FoodType foodType) {
        foodTypeRepository.save(foodType);
    }
}
