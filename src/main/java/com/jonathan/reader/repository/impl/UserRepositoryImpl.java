/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.repository.impl;

import com.jonathan.reader.model.Profile;
import com.jonathan.reader.model.User;
import com.jonathan.reader.repository.UserRepository;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author jonathan
 */

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public void create(User user) {
        getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        getCurrentSession().update(user);
    }

    @Override
    public User getById(Long id) {
        User user = (User) getCurrentSession().get(User.class, id);
        return user;
    }

    @Override
    public User getByEmail(String email) {
        User user = null;        
        Query q = getCurrentSession().createQuery("SELECT u FROM User u WHERE u.email = :email", User.class);
        q.setParameter("email", email);
        try{
            user = (User) q.getSingleResult();
        } catch (NoResultException e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void delete(Long id) {
        User user = getById(id);
        if (user != null){
            getCurrentSession().delete(user);
        }
    }

    @Override
    public List<User> getAll() {
        return getCurrentSession().createQuery("from User").list();
    }    
}
