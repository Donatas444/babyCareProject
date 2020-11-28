package com.example.demo.services;

import com.example.demo.models.Baby;
import com.example.demo.repositories.BabyRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(MockitoJUnitRunner.class)
class BabyServiceTest {
    @InjectMocks
    private BabyService babyService;
    @Mock
    private BabyRepository babyRepository;

    @Test
            void getAllBabies(){
    Baby baby = new Baby();
    baby.setName("tom");
    List<Baby> babies = Arrays.asList(baby);
    babies.add(baby);
    babyService.getAllBabies().contains(baby);
    assertEquals("tom",babies);


}}