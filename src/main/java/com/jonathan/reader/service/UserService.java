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
    
    public void addUser(User user);
    public void updateUser(User user);
    public User getUserById(Long id);
    public User geUserByEmail(String email);
    public void deleteUser(Long id);
    public List<User> getUsers();
    
}
