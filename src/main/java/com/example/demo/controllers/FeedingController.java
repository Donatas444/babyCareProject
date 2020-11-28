package com.example.demo.controllers;

import com.example.demo.models.Baby;
import com.example.demo.models.Feeding;
import com.example.demo.services.BabyService;
import com.example.demo.services.FeedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/feeding/{feedingId}")
    private String getFeeding(@PathVariable("feedingId") Long feedingId, Model model) {
        model.addAttribute("feeding", feedingService.getFeedingById(feedingId));
        return "/feeding";
    }

    @PostMapping("/addfeeding")
    public String addFeeding(Feeding feeding, Model model) {
        feedingService.addFeeding(feeding);
        model.addAttribute("feedings", feedingService.getAllFeeding());
        return "feedings";

    }

    @GetMapping("/deletefeeding/{feedingId}")
    public void deleteBaby(@PathVariable("feedingId") Long feedingId) {
        Feeding feeding = feedingService.getFeedingById(feedingId);
        feedingService.removeFeeding(feeding);
    }

    @PostMapping("/updatefeeding/{feedingId}")
    public String updateFeeding(@PathVariable("feedingId") Long feedingId, Feeding feeding, Model model) {
        feedingService.updateFeeding(feeding);
        model.addAttribute("feedings", feedingService.getAllFeeding());
        return "redirect:/feedings";
    }

    @PostMapping("/assignfeeding/{babyId}")
    public void createBabyFeeding(@PathVariable Long id, Long babyId, Baby baby, Long feedingId, @RequestBody Feeding feeding) {
        babyService.getBabyById(id);
        feedingService.getFeedingById(feedingId);
        feeding.setBaby(baby);
        feedingService.addFeeding(feeding);
    }

    @RequestMapping("/showform")
    public String showForm() {

        return "tester";
    }

    @RequestMapping(value = "/processform", method = RequestMethod.POST)
    public String processForm(@ModelAttribute(value = "") Feeding feeding) {
        return "";
    }
}