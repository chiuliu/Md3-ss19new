package hibernate_demo.dao.impl;

import hibernate_demo.dao.IAccountDao;
import hibernate_demo.model.Account;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor

public class AccountDaoImpl implements IAccountDao {

    private final SessionFactory sessionFactory;
    @Override
    public List<Account> findAll() {

        Session session = sessionFactory.openSession();

        try
        {
            //HQL
            return session.createQuery("select a from Account as a ", Account.class).getResultList();

        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        finally {
            session.close();
        }
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public void save(Account account) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try
        {
          save(account);
          transaction.commit();

        }
        catch (Exception e)
        {
            transaction.rollback();
            throw new RuntimeException(e);
        }
        finally {
            session.close();
        }

    }

    @Override
    public void deleteById(Long id) {

    }



}
