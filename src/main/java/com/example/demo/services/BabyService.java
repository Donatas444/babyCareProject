package com.example.demo.services;

import com.example.demo.models.Baby;
import com.example.demo.repositories.BabyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabyService {
    @Autowired
    private BabyRepository babyRepository;



    public List<Baby> getAllBabies() {
        return (List<Baby>) babyRepository.findAll();
    }



    public Baby getBabyById(Long id) {
        return babyRepository.findById(id).get();
    }

    public List<Baby> getBabyByName(String name){
        return babyRepository.findBabyByName(name);
    }

    public void addBaby(Baby baby) {
        babyRepository.save(baby);
    }


    public void removeBaby(Baby baby){
        babyRepository.delete(baby);
    }


    public void updateBaby(Baby baby) {
       // babyRepository.findById(id).get();
        babyRepository.save(baby);
    }


}

