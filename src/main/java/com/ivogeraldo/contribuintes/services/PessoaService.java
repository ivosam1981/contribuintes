package com.ivogeraldo.contribuintes.services;

import com.ivogeraldo.contribuintes.domains.Pessoa;
import com.ivogeraldo.contribuintes.exceptions.ContribuinteException;
import com.ivogeraldo.contribuintes.hibernate.utils.HibernateUtil;
import com.ivogeraldo.contribuintes.repositories.PessoaRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class PessoaService implements PessoaRepository {

    Session session;
    @Override
    public Pessoa getPessoaById(Integer id) {

        session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        crit.add(Restrictions.eq("id", id));
        Pessoa pessoa = (Pessoa) crit.list().get(0);
        session.clear();
        session.close();
        if (pessoa != null) {
            return pessoa;

        } else {
            return null;
        }
    }

    @Override
    public List<Pessoa> getAllPessoa() {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        List<Pessoa> pessoaList = crit.list();
        session.clear();
        session.close();
        if (pessoaList.size() > 0) {
            return pessoaList;

        } else {
            return null;
        }
    }

    @Override
    public void savePessoa(Pessoa p) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(p);
        t.commit();
        session.clear();
        session.close();
    }

    @Override
    public void updatePessoa(Pessoa p) {
        if (p != null) {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            session.update(p);
            t.commit();
            session.clear();
            session.close();
        }
    }

    @Override
    public String deletePessoa(Pessoa p) {
        try {
            if (p != null) {
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction t = session.beginTransaction();
                session.delete(p);
                t.commit();
                session.clear();
                session.close();
                return "Registro Deletado com Sucesso!";
            }
        } catch (ContribuinteException e) {
            return "Erro ao apagar registro!";
        } finally {
            session.clear();
            session.close();
        }
        return null;
    }

    @Override
    public Pessoa getPessoaByCnpjCpf(String cnpjCpf) {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        crit.add(Restrictions.ilike("cnpjCpf", cnpjCpf, MatchMode.ANYWHERE));
        List<Pessoa> pessoaList = crit.list();
        Pessoa pessoa = null;
        if(pessoaList.size() > 0){
            pessoa = pessoaList.get(0);
        }
        session.clear();
        session.close();
        if (pessoa != null) {
            return pessoa;
        } else {
            return null;
        }
    }


    @Override
    public List<Pessoa> getFilterAllPessoa(String type, String arg) {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        crit.add(Restrictions.ilike(type, arg, MatchMode.ANYWHERE));
        List<Pessoa> pessoaList = crit.list();
        session.clear();
        session.close();
        if (pessoaList.size() > 0) {
            return pessoaList;

        } else {
            return null;
        }
    }

}
