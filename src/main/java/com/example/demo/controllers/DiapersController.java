package com.example.demo.controllers;

import com.example.demo.models.Baby;
import com.example.demo.models.Diapers;
import com.example.demo.services.DiapersService;
import com.example.demo.services.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DiapersController {

    @Autowired
    private DiapersService diapersService;

    @GetMapping("/diapers")
    public String getAllDiapers(Model model) {
        model.addAttribute("diapers", diapersService.getAllDiapers());
        return "diapers";
    }
    @GetMapping("/diaper/{diaperId}")
    private String getDiaper(@PathVariable("diaperId") Long diaperId, Model model) {
        model.addAttribute("diaper", diapersService.getDiaperById(diaperId));
        return "/diaper";
    }


    @PostMapping("/adddiaper")
    public String adddiaper(Diapers diapers, Model model) {
       diapersService.addDiaper(diapers);
        model.addAttribute("diapers", diapersService.getAllDiapers());
        return "diapers";
    }

    @GetMapping("/deletediaper/{diaperId}")
    public String deleteDiaper(@PathVariable("diaperId") Long diaperId, Model model) {
        Diapers diapers = diapersService.getDiaperById(diaperId);
        diapersService.removeDiaper(diapers);
        model.addAttribute("diapers", diapersService.getAllDiapers());
        return "redirect:/diapers";
    }

    @PostMapping("/updatediaper/{diaperId}")
    public String updateDiaper(@PathVariable("diaperId") Long diaperId, Diapers diapers, Model model) {
        diapersService.updateDiaper(diapers);
        model.addAttribute("diapers", diapersService.getAllDiapers());
        return "redirect:/diapers";
    }

}
