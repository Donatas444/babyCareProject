package com.example.demo.services;

import com.example.demo.models.Baby;
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
    public Diapers getDiaperById(Long diaperId) {
        return diapersRepository.findById(diaperId).get();
    }

    public void addDiaper(Diapers diapers) {
        diapersRepository.save(diapers);
    }


    public void removeDiaper(Diapers diapers){
        diapersRepository.delete(diapers);
    }


    public void updateDiaper(Diapers diapers) {
        diapersRepository.save(diapers);
    }
}
