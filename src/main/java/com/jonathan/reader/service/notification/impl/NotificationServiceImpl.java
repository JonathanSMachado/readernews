/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.service.notification.impl;

import com.jonathan.reader.service.notification.NotificationService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jonathan
 */

@Service
public class NotificationServiceImpl implements NotificationService{
    
    public static final String NOTIFY_MSG_SESSION_KEY = "siteNotificationMessages";
    
    private List<NotificationMessage> notifyMessages;
    
    @Autowired
    private HttpSession httpSession;

    @Override
    public void addInfoMessage(String message) {
        addNotificationMessage(NotificationMessageType.INFO, message);
    }

    @Override
    public void addErrorMessage(String message) {
        addNotificationMessage(NotificationMessageType.ERROR, message);
    }

    private void addNotificationMessage(NotificationMessageType type, String message) {
        notifyMessages = (List<NotificationMessage>) httpSession.getAttribute(NOTIFY_MSG_SESSION_KEY);
        
        if(notifyMessages == null){
            notifyMessages = new ArrayList<NotificationMessage>();
        }
        
        notifyMessages.add(new NotificationMessage(type, message));
        httpSession.setAttribute(NOTIFY_MSG_SESSION_KEY, notifyMessages);
    }

    @Override
    public void clearNotificationMessages(){
        if (notifyMessages != null){
            notifyMessages.clear();
        }
    }
}
