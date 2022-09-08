package com.ivogeraldo.contribuintes.repositories;

import com.ivogeraldo.contribuintes.domains.Pessoa;

import java.util.List;

public interface PessoaRepository {
    
    Pessoa getPessoaById(Integer id);
    Pessoa getPessoaByCnpjCpf(String cnpjCpf);
    List<Pessoa> getAllPessoa();
     List<Pessoa> getFilterAllPessoa(String type, String arg);
    void savePessoa(Pessoa p);
    void updatePessoa(Pessoa p);
    String deletePessoa(Pessoa p);

}
