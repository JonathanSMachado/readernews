/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.service.notification;

/**
 *
 * @author jonathan
 */

public interface NotificationService {
    
    void addInfoMessage(String message);
    void addErrorMessage(String message);
    void clearNotificationMessages();
    
}
