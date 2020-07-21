package com.eduardo.b2wcrud.demo.controllers;

import com.eduardo.b2wcrud.demo.documents.Planeta;
import com.eduardo.b2wcrud.demo.service.PlanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "api/planetas")
public class PlanetaController {

    @Autowired
    private PlanetaService planetaService;

    @GetMapping
    public ResponseEntity<List<Planeta>> listarTodos(){
        return ResponseEntity.ok(planetaService.listarTodos());
    }

    @GetMapping(path = "/{id}")
    public HttpEntity<Planeta> listarPorId(@PathVariable(name = "id") String id){
        Optional<Planeta> planeta = planetaService.listarPorId(id);
        planeta.orElseThrow(()-> new RuntimeException("Planeta não encontrado"));
        return ResponseEntity.ok(planeta.get());
    }

    @GetMapping(path = "/{nome}")
    public HttpEntity<Planeta> listarPorNome(@PathVariable(name = "nome") String nome){
        Optional<Planeta> planeta = planetaService.listarPorNome(nome);
        planeta.orElseThrow(()-> new RuntimeException("Planeta não encontrado"));
        return ResponseEntity.ok(planeta.get());
    }

    @PostMapping
    public ResponseEntity<Planeta> cadastrar(@RequestBody Planeta planeta){
        return ResponseEntity.ok(planetaService.cadastrar(planeta));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Planeta> atualizar(@PathVariable(name = "id") String id, @RequestBody Planeta planeta){
        planeta.setId(id);
        return ResponseEntity.ok(planetaService.atualizar(planeta));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Integer> remover(@PathVariable(name = "id") String id){
        planetaService.remover(id);
        return ResponseEntity.ok(1);
    }

}
