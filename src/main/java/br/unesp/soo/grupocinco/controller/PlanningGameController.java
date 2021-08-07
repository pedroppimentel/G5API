/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.controller;

import br.unesp.soo.grupocinco.model.PlanningGame;
import br.unesp.soo.grupocinco.service.PlanningGameService;
import br.unesp.soo.grupocinco.service.ServiceFactory;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedroppimentel
 */
@RestController
@RequestMapping(path = "/planning-game")
public class PlanningGameController {

    private PlanningGameService service;

    public PlanningGameController() {
        this.service = ServiceFactory.getPlanningGameService();
    }

    @PostMapping()
    public ResponseEntity<Boolean> createPlanningGame(@Valid @RequestBody PlanningGame pGame) {
        boolean created = service.createGame(pGame);

        if (created) {
            return new ResponseEntity<>(created, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(created, HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping()
    public ResponseEntity<Boolean> updatePlanningGame(@Valid @RequestBody PlanningGame pGame) {
        boolean updated = service.updateGame(pGame);

        if (updated) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(updated, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping()
    public ResponseEntity<Boolean> updatePlanningGame(@Valid @RequestBody long id) {
        boolean deleted = service.deleteGame(id);

        if (deleted) {
            return new ResponseEntity<>(deleted, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(deleted, HttpStatus.BAD_REQUEST);
        }
    }
}
