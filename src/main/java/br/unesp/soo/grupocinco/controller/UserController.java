/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.controller;

import br.unesp.soo.grupocinco.dao.UserDAO;
import br.unesp.soo.grupocinco.model.User;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedroppimentel
 */
@RestController
public class UserController {

    @Autowired
    private UserDAO repository;

    @PostMapping(value = "/pessoa")
    public ResponseEntity<Boolean> createUser(@Valid @RequestBody User user) {
        boolean created = repository.create(user);
        
        if (created) {
            return new ResponseEntity<>(created, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(created, HttpStatus.BAD_REQUEST);
        }
    }
}
