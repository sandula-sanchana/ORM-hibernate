package edu.ijse;

import Entity.Customer;
import config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        getCus();
    }

    public static void  getCus(){
        Session session=FactoryConfiguration.getInstance().getSession();
        Customer customer=session.get(Customer.class,2);
        System.out.println(customer);

    }

    public static void saveCUs(){
        Session session=FactoryConfiguration.getInstance().getSession();
        Customer customer=new Customer();
        customer.setName("hime");
        Transaction transaction=session.beginTransaction();
        session.persist(customer);
        transaction.commit();
        session.close();
    }
    public static void updateCus(){
        Session session=FactoryConfiguration.getInstance().getSession();
        Customer customer=session.get(Customer.class,1);
        customer.setName("hime");
        Transaction transaction=session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
    }
}