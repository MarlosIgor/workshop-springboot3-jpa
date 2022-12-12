package com.marlosigor.project.resources;

import com.marlosigor.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/users"})

public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "marlos", "Marlos@gmail.com", "996299941", "12345");
        return ResponseEntity.ok().body(u);
    }
}
