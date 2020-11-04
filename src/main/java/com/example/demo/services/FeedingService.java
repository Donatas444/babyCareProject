package com.example.demo.services;

import com.example.demo.models.Baby;
import com.example.demo.models.Feeding;
import com.example.demo.repositories.BabyRepository;
import com.example.demo.repositories.FeedingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedingService {


    @Autowired
    private FeedingRepository feedingRepository;

    public List<Feeding> getAllFeeding() {
        return (List<Feeding>) feedingRepository.findAll();
    }
}
