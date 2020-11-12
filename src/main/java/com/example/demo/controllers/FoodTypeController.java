package com.example.demo.controllers;

import com.example.demo.models.Baby;
import com.example.demo.models.FoodType;
import com.example.demo.services.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodTypeController {

    @Autowired
    private FoodTypeService foodTypeService;

    @GetMapping("/foodtypes")
    public String getAllFoodTypes(Model model) {
        model.addAttribute("foodtypes", foodTypeService.getAllFoodTypes());
        return "foodtypes";
    }

    @GetMapping("/foodtype/{foodTypeId}")
    private String getBaby(@PathVariable("foodTypeId") Long foodTypeId, Model model) {
        model.addAttribute("foodType", foodTypeService.getFoodTypeById(foodTypeId));
        return "/foodtype";
    }

    @PostMapping("/addfoodtype")
    public String addFoodType(FoodType foodType, Model model) {
        foodTypeService.addFoodType(foodType);
        model.addAttribute("foodtypes", foodTypeService.getAllFoodTypes());
        return "foodtypes";
    }
    @GetMapping("/deletefoodtype/{foodTypeId}")
    public String deleteFoodType(@PathVariable("foodTypeId") Long foodTypeId, Model model) {
        FoodType foodType = foodTypeService.getFoodTypeById(foodTypeId);
        foodTypeService.removeFoodType(foodType);
        model.addAttribute("foodtypes", foodTypeService.getAllFoodTypes());
        return "redirect:/foodtypes";
    }

    @PostMapping("/updatefoodtype/{foodTypeId}")
    public String updateFoodType(@PathVariable("foodTypeId") Long foodTypeId, FoodType foodType, Model model) {
        foodTypeService.updateFoodType(foodType);
        model.addAttribute("foodtypes", foodTypeService.getAllFoodTypes());
        return "redirect:/foodtypes";
    }
}
