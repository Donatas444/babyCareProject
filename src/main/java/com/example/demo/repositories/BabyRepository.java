package com.example.demo.repositories;

import com.example.demo.models.Baby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BabyRepository extends CrudRepository<Baby, Long> {

    List<Baby> findBabyByName(String name);

}

