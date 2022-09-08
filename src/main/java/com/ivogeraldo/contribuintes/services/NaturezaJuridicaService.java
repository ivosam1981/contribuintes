package com.ivogeraldo.contribuintes.services;

import com.ivogeraldo.contribuintes.domains.NaturezaJuridica;
import com.ivogeraldo.contribuintes.hibernate.utils.HibernateUtil;
import com.ivogeraldo.contribuintes.repositories.NaturezaJuridicaRepository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class NaturezaJuridicaService implements NaturezaJuridicaRepository {

    Session session;

    @Override
    public NaturezaJuridica getNaturezaJuridicaById(Integer id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(NaturezaJuridica.class);
        crit.add(Restrictions.eq("id", id));
        NaturezaJuridica naturezaJuridica = (NaturezaJuridica) crit.list().get(0);
        session.clear();
        session.close();
        return naturezaJuridica;
    }

    @Override
    public void saveNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(naturezaJuridica);
        t.commit();
        session.clear();
        session.close();
    }

    @Override
    public List<NaturezaJuridica> getAllNaturezaJuridica() {
        session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(NaturezaJuridica.class);
        List<NaturezaJuridica> naturezaJuridicaList = crit.list();
        session.clear();
        session.close();
        return naturezaJuridicaList;
    }

}
