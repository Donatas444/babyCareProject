package com.example.demo.controllers;

import com.example.demo.services.DiapersService;
import com.example.demo.services.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiapersController {

    @Autowired
    private DiapersService diapersService;

    @GetMapping("/diapers")
    public String getAllDiapers(Model model) {
        model.addAttribute("diapers", diapersService.getAllDiapers());
        return "diapers";
    }
}
