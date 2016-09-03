/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.service;

import com.jonathan.reader.model.User;
import java.util.List;

/**
 *
 * @author jonat
 */
public interface UserService {
    
    public void add(User user);
    public void update(User user);
    public User getById(Long id);
    public User getByEmail(String email);
    public void delete(Long id);
    public List<User> getAll();
    
}
