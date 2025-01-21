package com.agustin.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home() {

        return "redirect:/details"; //redirect redigire hacia la nueva url solicitada reiniciando el request
        //return "forward:/details"; //hace un switch dentro del mismo request, este se mantiene dentro de la misma peticion http
    }
    
}
