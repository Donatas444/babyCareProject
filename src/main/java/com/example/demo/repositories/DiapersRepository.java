package com.example.demo.repositories;

import com.example.demo.models.Diapers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiapersRepository extends CrudRepository<Diapers, Long> {
}
