package com.catalogue.repository;

import com.catalogue.core.entity.Client;
import com.catalogue.core.tools.HibernateUtil;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class JdbcClientDAO {

    public static void persist(Client client) {
        HibernateUtil.getSessionFactory().getCurrentSession().persist(client);
    }

    public static Client retrieve(int id) {
        Client res = (Client) HibernateUtil.getSessionFactory().getCurrentSession().get(Client.class, id);
        return res;
    }

    public static List<Client> retrieveAll() {
        List<Client> res = HibernateUtil.getSessionFactory().getCurrentSession().createQuery("from Client").list();
        return res;
    }

    public static void delete(Client client) {
        Session hibSess = HibernateUtil.getSessionFactory().getCurrentSession();
        hibSess.createQuery("DELETE FROM CLIENT WHERE CLIENT = :id")
                .setInteger("id", client.getId()).executeUpdate();
    }

    public static void merge(Client client) {
        HibernateUtil.getSessionFactory().getCurrentSession().merge(client);
    }

}