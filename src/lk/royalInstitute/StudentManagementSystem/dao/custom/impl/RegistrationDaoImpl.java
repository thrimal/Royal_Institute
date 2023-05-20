package lk.royalInstitute.StudentManagementSystem.dao.custom.impl;

import lk.royalInstitute.StudentManagementSystem.dao.custom.RegistrationDAO;
import lk.royalInstitute.StudentManagementSystem.entity.Registration;
import lk.royalInstitute.StudentManagementSystem.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class RegistrationDaoImpl implements RegistrationDAO {
    @Override
    public boolean save(Registration registration) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(registration);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Registration registration) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Registration registration = session.get(Registration.class, s);
        session.delete(registration);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public Registration get(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Registration> getAll() throws Exception {
        return null;
    }
}
