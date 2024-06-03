package org.example.testspringproject.service;

import org.example.testspringproject.model.Pessoa;
import org.example.testspringproject.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;
    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }
    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }
    public Pessoa findById(Long id) {
            return pessoaRepository.findById(id).get();
    }
    public void deleteById(long id) {
        pessoaRepository.deleteById(id);
    }
}
