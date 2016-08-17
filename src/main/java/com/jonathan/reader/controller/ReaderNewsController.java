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
    public ModelAndView init(){
        System.out.println("Estou aqui");
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
