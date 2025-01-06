package com.agustin.curso.springboot.webapp.springbootweb.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.agustin.curso.springboot.webapp.springbootweb.models.User;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Agustin", "Garcia");
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("user", user);
        user.setEmail("agucho@correo.com");

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de Usuarios.");
        return "list";
    }

    @ModelAttribute("users") //Si queremos reutilizar datos, creamos un metodo con la anotacion "ModelAttribute"
    public List<User> usersModel() {

        return Arrays.asList(
            new User("Agucho", "Garcia"),
            new User("Delfina", "Otero"),
            new User("Felipe", "Otero", "Felipe@correo.com"));
    }
    
}
