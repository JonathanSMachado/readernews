/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.model;

/**
 *
 * @author jonathan
 */
public enum Profile {
    
    ADMIN("Admin"), USER("User");
    
    private final String description;

    private Profile(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }   
}