package com.example.demo.controllers;

import com.example.demo.models.Baby;
import com.example.demo.services.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BabyController {
    @Autowired
    private BabyService babyService;

    @GetMapping("/babies")
    public String getAllBabies(Model model) {
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }
    @PostMapping("/addbaby")
    public String addbaby(@RequestBody Baby baby, Model model) {
        babyService.addBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";

    }
}
