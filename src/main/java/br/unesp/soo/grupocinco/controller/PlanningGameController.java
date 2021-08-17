/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.controller;

import br.unesp.soo.grupocinco.model.PlanningGame;
import br.unesp.soo.grupocinco.service.PlanningGameService;
import br.unesp.soo.grupocinco.service.ServiceFactory;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
@RequestMapping(path = "/planning-game")
public class PlanningGameController {

    private PlanningGameService service;

    public PlanningGameController() {
        this.service = ServiceFactory.getPlanningGameService();
    }

    @GetMapping()
    public ResponseEntity<List<PlanningGame>> getAllPlanningGames() {
        List<PlanningGame> listGame = service.getAllGames();

        if (listGame.size() > 0) {
            return new ResponseEntity<>(listGame, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(listGame, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping()
    public ResponseEntity<Boolean> createPlanningGame(@Valid @RequestBody PlanningGame pGame, @PathVariable int complexidade) {
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
