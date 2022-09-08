package com.ivogeraldo.contribuintes.repositories;

import com.ivogeraldo.contribuintes.domains.NaturezaJuridica;
import java.util.List;

public interface NaturezaJuridicaRepository {
    
    NaturezaJuridica getNaturezaJuridicaById(Integer id);
    List<NaturezaJuridica> getAllNaturezaJuridica();
    void saveNaturezaJuridica(NaturezaJuridica naturezaJuridica);

}
