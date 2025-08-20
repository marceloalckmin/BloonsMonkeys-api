package com.example.bloonsmonkey_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bloonsmonkey_api.repository.*;
import com.example.bloonsmonkey_api.model.*;

@RestController
public class BloonsMonkeyController {
    
    private final  BloonsMonkeyRepository repository;

    BloonsMonkeyController(BloonsMonkeyRepository repository){
        this.repository = repository;
    }

    @GetMapping("/monkeys")
    List<BloonsMonkey> all() {
        return repository.findAll();
    }

    @PostMapping("/monkeys")
    BloonsMonkey novoMacaco(@RequestBody BloonsMonkey novoMacaco) {
        return repository.save(novoMacaco);
    }

    @GetMapping("/monkeys/{id}")
    Optional<BloonsMonkey> macaco(@PathVariable Long id){
        return repository.findById(id);
    }


    @PutMapping("/monkeys/{id}")
    Optional<Object> macacoSubstituto(@RequestBody BloonsMonkey novoMacaco, @PathVariable Long id){
        return repository.findById(id)
        .map(macaco ->{
            macaco.setNome(novoMacaco.getName());
            macaco.setDescricao(novoMacaco.getDescricao());
            macaco.setTipo(novoMacaco.getTipo());
            macaco.setDano(novoMacaco.getDano());
            return repository.save(macaco);
        });
    }

    @DeleteMapping("/monkeys/{id}")
    void deleteMonkey(@PathVariable Long id){
        repository.deleteById(id);
}}