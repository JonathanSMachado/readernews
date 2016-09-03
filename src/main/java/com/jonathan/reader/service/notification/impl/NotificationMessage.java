/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.service.notification.impl;

/**
 *
 * @author jonathan
 */

public class NotificationMessage {
    
    private NotificationMessageType type;
    private String text;

    public NotificationMessage(NotificationMessageType type, String message) {
        
        this.type = type;
        this.text = message;
    }
    
    public NotificationMessageType getType(){
        return type;
    }
    
    public String getText(){
        return text;
    }
}
