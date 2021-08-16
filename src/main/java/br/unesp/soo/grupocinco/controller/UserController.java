/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.controller;

import br.unesp.soo.grupocinco.model.User;
import br.unesp.soo.grupocinco.service.ServiceFactory;
import br.unesp.soo.grupocinco.service.UserService;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedroppimentel
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/user")
public class UserController {

    private UserService service;

    public UserController() {
        this.service = ServiceFactory.getUserService();
    }   

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable(value = "id") long id) {
        User u = service.getOneByID(id);

        if (!Objects.isNull(u)) {
            return new ResponseEntity<>(u, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(u, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping()
    public ResponseEntity<Boolean> createUser(@Valid @RequestBody User user) {
        boolean created = service.createUser(user);

        if (created) {
            return new ResponseEntity<>(created, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(created, HttpStatus.BAD_REQUEST);
        }
    }
}
