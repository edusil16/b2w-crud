package com.eduardo.b2wcrud.demo.repositories;

import com.eduardo.b2wcrud.demo.documents.Planeta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {


}
