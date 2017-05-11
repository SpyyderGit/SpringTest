package ua.com.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.com.dao.DeveloperDao;
import ua.com.model.Developer;

import javax.security.auth.login.Configuration;
import java.util.List;

/**
 * Created by oleg on 06.05.17.
 */
public class DeveloperDaoImpl implements DeveloperDao {
    Session session;

    public DeveloperDaoImpl(Session session) {
        this.session = session;
    }

    public void addDev(Developer developer) {
        Transaction transaction = session.beginTransaction();
        session.save(developer);
        transaction.commit();
        session.close();
    }

    public void removeDev(Developer developer) {

    }

    public void updateDev(Developer developer) {

    }

    public List<Developer> listDev() {
        return session.createQuery("from  Developer ").list();
    }
}
