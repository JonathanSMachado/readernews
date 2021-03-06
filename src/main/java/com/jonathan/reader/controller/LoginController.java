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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author jonathan
 */

@Controller
@RequestMapping("/ReaderNews")
public class LoginController {
    
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
