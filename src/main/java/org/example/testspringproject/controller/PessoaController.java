package org.example.testspringproject.controller;

import org.example.testspringproject.model.Pessoa;
import org.example.testspringproject.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public void createPessoa(@RequestBody(required = true) Pessoa pessoa) {
        pessoaService.save(pessoa);
    }
    @GetMapping
    public List<Pessoa> findAll() {
        return pessoaService.findAll();
    }
    @GetMapping("/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return pessoaService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        pessoaService.deleteById(id);
    }
}
