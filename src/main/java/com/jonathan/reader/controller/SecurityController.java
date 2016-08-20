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

/**
 *
 * @author jonathan
 */

@Controller
public class SecurityController {
    
    @RequestMapping("/ReaderNews/login")
    public String login(@AuthenticationPrincipal User user){
        System.out.println(user.toString());
        if(user != null){
            return "redirect:/ReaderNews/main";
        }
        
        return "login";
    }
    
}
