/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.controller;

import com.jonathan.reader.service.UserService;
import com.jonathan.reader.model.User;
import com.jonathan.reader.service.notification.NotificationService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller
@RequestMapping("/ReaderNews")
public class ReaderNewsController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private NotificationService notificationService;

    @RequestMapping(value = {"", "/", "/main"})
    public ModelAndView mainPage() {
        ModelAndView mv = new ModelAndView("/reader/main");
        return mv;
    }

    @RequestMapping("/recover-password")
    public ModelAndView recoverPasswordPage() {
        ModelAndView mv = new ModelAndView("recover-password");
        return mv;
    }

    @RequestMapping("/register")
    public ModelAndView createRegisterPage(User user) {
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView createUser(@Valid User user, BindingResult result){
                
        if (result.hasErrors()){
            
            //notificationService.addErrorMessage("Há erros no cadastro");
            //notificationService.addInfoMessage("Outra mensagem");
            
            return createRegisterPage(user);
        }
        
        ModelAndView mv = new ModelAndView("register");
        userService.add(user);
        mv.addObject("message_success", "Usuário " + user.getName()+ " salvo com sucesso");
        return mv;
    }
}
