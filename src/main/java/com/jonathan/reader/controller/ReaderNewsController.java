/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller
@RequestMapping("/ReaderNews")
public class ReaderNewsController {

    @RequestMapping
    public ModelAndView init() {
        System.out.println("Página de login");
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

    @RequestMapping("/recover-password")
    public ModelAndView recoverPasswordPage() {
        System.out.println("Página recuperação de senha");
        ModelAndView mv = new ModelAndView("recover-password");
        return mv;
    }

    @RequestMapping("/create-register")
    public ModelAndView createRegister() {
        System.out.println("Página criação cadastro");
        ModelAndView mv = new ModelAndView("create-register");
        return mv;
    }
    
    @RequestMapping("/main")
    public ModelAndView mainPage(){
        System.out.println("Página principal");
        ModelAndView mv = new ModelAndView("/reader/main");
        return mv;
    }
}
