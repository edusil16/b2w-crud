package com.eduardo.b2wcrud.demo.service;


import com.eduardo.b2wcrud.demo.documents.Planeta;
import com.eduardo.b2wcrud.demo.repositories.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlanetaService {

    @Autowired
    private PlanetaRepository planetaRepository;

    public List<Planeta> listarTodos(){
        return planetaRepository.findAll();
    }

    public Optional<Planeta> listarPorId(String id){
        return planetaRepository.findById(id);
    }

    public Optional<Planeta> listarPorNome(String nome){
        return planetaRepository.findById(nome);
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
