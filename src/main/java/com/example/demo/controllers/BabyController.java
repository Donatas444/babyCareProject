package com.example.demo.controllers;

import com.example.demo.models.Baby;
import com.example.demo.repositories.BabyRepository;
import com.example.demo.services.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class BabyController {
    @Autowired
    private BabyService babyService;
    private BabyRepository babyRepository;

    @GetMapping("/babies")
    public String getAllBabies(Model model) {
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }

    // @GetMapping("/baby/{id}")
    // private String getBaby(@PathVariable("id") Long id, Model model) {
    //     model.addAttribute("baby", babyService.getBabyById(id));
    //     return "baby";
    // }
    @GetMapping("/baby")
    private String getBaby(String name, Model model) {
        model.addAttribute("baby", babyService.getBabyByName(name));
        return "baby";
    }


    @PostMapping("/addbaby")
    public String addbaby(Baby baby, Model model) {
        babyService.addBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }

    @GetMapping("/addform")
    public String addBabyForm(Baby baby) {
        return "baby_add";
    }

    // @GetMapping("/removebaby/{id}")
    // public void deleteBaby(@PathVariable("id") Baby baby) {
    //     babyService.removeBaby(baby);
    // }

    @GetMapping("/deletebaby/{id}")
    public String deleteBaby(@PathVariable("id") Long id, Model model) {
        Baby baby = babyService.getBabyById(id);
        babyService.removeBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }

    @PostMapping("/updatebaby/{id}")
    public String updateBaby(@PathVariable("id") Long id, Baby baby, Model model) {
        babyService.updateBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Baby baby = babyService.getBabyById(id);
        model.addAttribute("baby", baby);
        return "baby-edit";
    }
  /*   @PostMapping("/update/{id}")
    public String updateBaby(@PathVariable("id") Long id, Model model, Baby baby, BindingResult result) {
        babyService.addBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }*/
}
