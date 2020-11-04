package com.example.demo.services;

import com.example.demo.models.Diapers;
import com.example.demo.models.FoodType;
import com.example.demo.repositories.DiapersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiapersService {

    @Autowired
    private DiapersRepository diapersRepository;

    public List<Diapers> getAllDiapers() {
        return (List<Diapers>) diapersRepository.findAll();
    }
}
