package com.example.demo.controllers;

import com.example.demo.services.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodTypeController {

    @Autowired
    private FoodTypeService foodTypeService;

    @GetMapping("/foodtypes")
    public String getAllFoodTypes(Model model) {
        model.addAttribute("foodtypes", foodTypeService.getAllFoodTypes());
        return "foodtypes";
    }
}
