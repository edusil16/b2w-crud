package com.eduardo.b2wcrud.demo.service;


import com.eduardo.b2wcrud.demo.model.Planeta;
import com.eduardo.b2wcrud.demo.repository.IPlanetaRepository;
import com.eduardo.b2wcrud.demo.repository.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PlanetaService {

    @Autowired
    private IPlanetaRepository planetaRepository;

    @Autowired
    PlanetaRepository repository;

    public List<Planeta> listarTodos(){
        return planetaRepository.findAll();
    }

    public Optional<Planeta> listarPorId(String id){
        return planetaRepository.findById(id);
    }

    public List<Planeta> listarPorNome(String nome){
        return repository.encontraPlanetaPorNome(nome);
    }

    public Planeta cadastrar(Planeta planeta){
        return planetaRepository.save(planeta);
    }

    public Planeta atualizar(Planeta planeta){
        return planetaRepository.save(planeta);
    }

    public void remover(String id){
        planetaRepository.deleteById(id);
    }

}
