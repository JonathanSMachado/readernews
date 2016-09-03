/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.service.impl;

import com.jonathan.reader.model.Profile;
import com.jonathan.reader.model.User;
import com.jonathan.reader.repository.UserRepository;
import com.jonathan.reader.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jonathan
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void add(User user) {
        userRepository.create(user);
    }

    @Override
    public void update(User user) {
        User userToUpdate = userRepository.getById(user.getId());
        userToUpdate.setBirth(user.getBirth());
        userToUpdate.setName(user.getName());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setProfile(Profile.ADMIN); //TODO: parar de setar todos como admin
        userRepository.update(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
    
    private boolean validateUser(User user){
        
        return true;
    }
}