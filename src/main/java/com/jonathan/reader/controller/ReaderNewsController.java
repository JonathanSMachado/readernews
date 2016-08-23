/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author jonathan
 */
@Controller
@RequestMapping("/ReaderNews")
public class ReaderNewsController {

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
    public ModelAndView createRegisterPage() {
        System.out.println("Página criação cadastro");
        ModelAndView mv = new ModelAndView("create-register");
        return mv;
    }
    
    @RequestMapping(value = "/create-register", method = RequestMethod.POST)
    public ModelAndView createUser(){
        System.out.println("Salvando o registro");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("create-register");
        mv.addObject("message", "estou gravando o usuário");
        return mv;
    }
      
    @RequestMapping("/login")
    public ModelAndView login(@AuthenticationPrincipal User user, RedirectAttributes attributes){
        
        ModelAndView mv = new ModelAndView();
        
        if(user != null){
            System.out.println(user.getUsername());
            mv.setViewName("redirect:/ReaderNews/main");
            attributes.addFlashAttribute("user", user.getUsername());
        } else {
            mv.setViewName("login");
        }
        return mv;
    }
}
