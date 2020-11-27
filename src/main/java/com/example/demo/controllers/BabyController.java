package com.example.demo.controllers;

import com.example.demo.models.Baby;
import com.example.demo.services.BabyService;
import com.example.demo.services.FeedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BabyController {
    @Autowired
    private BabyService babyService;
    @Autowired
    private FeedingService feedingService;

    @GetMapping("/")
    public String getIndex(Model model) {

        return "index";
    }

    @GetMapping("/process")
    public String getProcessPage(Model model) {

        return "baby-processing";
    }

    @GetMapping("/babies")
    public String getAllBabies(Model model) {
        model.addAttribute("babies", babyService.getAllBabies());
        model.addAttribute("feedings", feedingService.getAllFeeding());
        return "babies";
    }

    @GetMapping("/baby/{id}")
    private String getBaby(@PathVariable("id") Long id, Model model) {
        model.addAttribute("baby", babyService.getBabyById(id));
        model.addAttribute("feedings", feedingService.getAllFeeding());
        return "/baby";
    }

    @PostMapping("/addbaby")
    public String addbaby(Baby baby, Model model) {  // pries Baby baby pridejus @RequestBody nenukreipia atgal i "babies" url'a
        babyService.addBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "babies";
    }

    @GetMapping("/addform")
    public String addBabyForm(Baby baby) {
        return "baby_add";
    }

    @GetMapping("/deletebaby/{id}")
    public String deleteBaby(@PathVariable("id") Long id, Model model) {
        Baby baby = babyService.getBabyById(id);
        babyService.removeBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "redirect:/babies";
    }

    @PostMapping("/updatebaby/{id}")
    public String updateBaby(@PathVariable("id") Long id, Baby baby, Model model) {
        babyService.updateBaby(baby);
        model.addAttribute("babies", babyService.getAllBabies());
        return "redirect:/babies";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Baby baby = babyService.getBabyById(id);
        model.addAttribute("baby", baby);
        return "baby-edit";
    }
}