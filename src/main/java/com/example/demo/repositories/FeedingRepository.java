package com.example.demo.repositories;

import com.example.demo.models.Feeding;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedingRepository extends CrudRepository<Feeding, Long> {
}
