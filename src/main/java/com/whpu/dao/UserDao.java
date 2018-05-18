package com.whpu.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao{
    @Autowired
    private SessionFactory sessionFactory;  
    
    private Session getCurrentSession() {  
        return sessionFactory.openSession();  
    }
    
    public void saveObject(Object obj) throws HibernateException {
        this.getCurrentSession().save(obj);  
    }

}