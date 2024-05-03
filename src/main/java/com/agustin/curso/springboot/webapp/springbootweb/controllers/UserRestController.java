package com.agustin.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agustin.curso.springboot.webapp.springbootweb.models.User;
import com.agustin.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsDto")
    public UserDto detailsDto() {

        User user = new User("Agustin", "Garcia");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {

        User user = new User("Agustin", "Garcia");
        User user2 = new User("Azul", "Ovejero");
        User user3 = new User("Felipe", "Otero");

        List<User> users = Arrays.asList(user, user2, user3);

    //  List<User> users = new ArrayList<>();
    //  users.add(user);
    //  users.add(user2);
    //  users.add(user3);

        return users;
    }

    @GetMapping("/detailsMap")
    public Map<String, Object> detailsMap() {

        User user = new User("Agustin", "Garcia");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo");
        body.put("user", user);

        return body;
    }
}
