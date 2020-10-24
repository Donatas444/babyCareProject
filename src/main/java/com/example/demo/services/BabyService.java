package com.example.demo.services;

import com.example.demo.models.Baby;
import com.example.demo.repositories.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BabyService {
    @Autowired
    private BabyRepository babyRepository;

    public List<Baby> getAllBabies() {
        return (List<Baby>) babyRepository.findAll();
    }

    public void addBaby(Baby baby) {
        babyRepository.save(baby);

    }


}

