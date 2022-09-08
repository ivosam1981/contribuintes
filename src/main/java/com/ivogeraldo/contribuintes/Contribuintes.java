package com.ivogeraldo.contribuintes;

import com.ivogeraldo.contribuintes.domains.NaturezaJuridica;
import com.ivogeraldo.contribuintes.hibernate.utils.HibernateUtil;
import com.ivogeraldo.contribuintes.repositories.NaturezaJuridicaRepository;
import com.ivogeraldo.contribuintes.repositories.PessoaRepository;
import com.ivogeraldo.contribuintes.services.NaturezaJuridicaService;
import com.ivogeraldo.contribuintes.services.PessoaService;
import com.ivogeraldo.contribuintes.views.TelaPrincipal;
import java.util.Arrays;
import java.util.List;

public class Contribuintes {

    public static void main(String[] args) {

        HibernateUtil.getSessionFactory();

        PessoaRepository pessoaRepository = new PessoaService();
        NaturezaJuridicaRepository naturezaRepository = new NaturezaJuridicaService();
        List<NaturezaJuridica> listNaturezaJuridica = naturezaRepository.getAllNaturezaJuridica();

        if (listNaturezaJuridica.size() == 0) {
            NaturezaJuridica nat1 = new NaturezaJuridica(null, 1, "Pessoa Fisica");
            NaturezaJuridica nat2 = new NaturezaJuridica(null, 2, "Pessoa Juridica");
            List<NaturezaJuridica> naturezas = Arrays.asList(nat1, nat2);
            for(NaturezaJuridica nat : naturezas){
                naturezaRepository.saveNaturezaJuridica(nat);
            }

        }
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
}
