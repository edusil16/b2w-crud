package com.eduardo.b2wcrud.demo.repository;


import com.eduardo.b2wcrud.demo.model.Planeta;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanetaRepository {
    private MongoTemplate mongoTemplate;

    public PlanetaRepository (MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public List<Planeta> encontraPlanetaPorNome(String nome) {
        Query query = new Query();
        query.addCriteria(Criteria.where("nome").is(nome));
        List<Planeta> retorno = mongoTemplate.find(query, Planeta.class);
        return retorno;
    }

}
