/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.controller;

import com.jonathan.reader.service.UserService;
import com.jonathan.reader.model.User;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    private UserService userService; //TODO: rever este ponto

    @RequestMapping(value = {"", "/", "/main"})
    public ModelAndView mainPage() {
        System.out.println("Página principal");
        ModelAndView mv = new ModelAndView("/reader/main");
        return mv;
    }

    @RequestMapping("/recover-password")
    public ModelAndView recoverPasswordPage() {
        System.out.println("Página recuperação de senha");
        ModelAndView mv = new ModelAndView("recover-password");
        return mv;
    }

    @RequestMapping("/create-register")
    public ModelAndView createRegisterPage(User user) {
        System.out.println("Página criação cadastro");
        ModelAndView mv = new ModelAndView("create-register");
        //mv.addObject("user", new User());
        return mv;
    }
    
    @RequestMapping(value = "/create-register", method = RequestMethod.POST)
    public ModelAndView createUser(@Valid User user, BindingResult result){
        
        System.out.println(user.toString());
        
        if (result.hasErrors()){
            System.out.println("Há erros no cadastro");
            return createRegisterPage(user);
        }
        
        System.out.println("Salvando o registro");
        ModelAndView mv = new ModelAndView("create-register");
        userService.addUser(user);
        mv.addObject("message", "Usuário " + user.getName()+ " salvo com sucesso");
        return mv;
    }
    
}
