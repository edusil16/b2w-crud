package com.eduardo.b2wcrud.demo.repository;

import com.eduardo.b2wcrud.demo.model.Planeta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Map;

public interface IPlanetaRepository extends MongoRepository<Planeta, String> {
}
