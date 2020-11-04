package com.example.demo.controllers;

import com.example.demo.models.Feeding;
import com.example.demo.services.BabyService;
import com.example.demo.services.FeedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedingController {
@Autowired
private BabyService babyService;
    @Autowired
    private FeedingService feedingService;

    @GetMapping("/feedings")
    public String getAllFeeding(Model model) {
        model.addAttribute("feedings", feedingService.getAllFeeding());

        return "feedings";
    }
}
