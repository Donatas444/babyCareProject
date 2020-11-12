package com.example.demo.controllers;

import com.example.demo.models.Feeding;
import com.example.demo.services.BabyService;
import com.example.demo.services.FeedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
    public void addFeeding(Feeding feeding) {
        feedingService.addFeeding(feeding);

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



    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(Model model) {
        Feeding feeding = new Feeding();
      //  feeding.setFeedingDate();

        model.addAttribute("feeding", feeding);
        return "tester";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute(value = "foo") Feeding feeding) {
return "";
    }


}