package com.eduardo.b2wcrud.demo.controller;

import com.eduardo.b2wcrud.demo.model.Planeta;
import com.eduardo.b2wcrud.demo.service.PlanetaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
public class PlanetaController {

    @Autowired
    private PlanetaService planetaService;

    @ApiOperation(value="Retorna uma lista de Planetas")
    @GetMapping("/planetas")
    public ResponseEntity<List<Planeta>> listarTodos(){
        return ResponseEntity.ok(planetaService.listarTodos());
    }

    @PostMapping(path = "planeta/{id}")
    @ApiOperation(value="Retorna um Planeta por ID")
    public HttpEntity<Planeta> listarPorId(@PathVariable(name = "id") String id){
        Optional<Planeta> planeta = planetaService.listarPorId(id);
        planeta.orElseThrow(()-> new RuntimeException("Planeta não encontrado"));
        return ResponseEntity.ok(planeta.get());
    }

    @PostMapping(path = "planeta/searchNome/{nome}")
    @ApiOperation(value="Retorna um planeta por Nome")
    public HttpEntity<List<Planeta>> listarPorNome(@PathVariable(name = "nome") String nome){
        return ResponseEntity.ok(planetaService.listarPorNome(nome));
    }

    @PostMapping("/planeta")
    @ApiOperation(value="Salva um planeta")
    public ResponseEntity<Planeta> cadastrar(@RequestBody Planeta planeta){
        return ResponseEntity.ok(planetaService.cadastrar(planeta));
    }

    @PutMapping(path = "planeta/{id}")
    @ApiOperation(value="Atualiza um planeta")
    public ResponseEntity<Planeta> atualizar(@RequestBody Planeta planeta){
        return ResponseEntity.ok(planetaService.atualizar(planeta));
    }

    @DeleteMapping(path = "planeta/{id}")
    @ApiOperation(value="Remove um planeta")
    public ResponseEntity<Integer> remover(@PathVariable(name = "id") String id){
        planetaService.remover(id);
        return ResponseEntity.ok(1);
    }

}
