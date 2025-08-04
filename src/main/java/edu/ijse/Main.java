package edu.ijse;

import Entity.Customer;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session=FactoryConfiguration.getInstance().getSession();
        Customer customer=new Customer();
        customer.setName("Ahmad");
        Transaction transaction=session.beginTransaction();
        session.persist(customer);
        transaction.commit();
        session.close();
    }
}