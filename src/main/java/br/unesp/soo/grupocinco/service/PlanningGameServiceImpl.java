/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

import br.unesp.soo.grupocinco.dao.DAOFactory;
import br.unesp.soo.grupocinco.dao.PlanningGameDAO;
import br.unesp.soo.grupocinco.model.PlanningGame;

/**
 *
 * @author pedroppimentel
 */
public class PlanningGameServiceImpl implements PlanningGameService {

    private final PlanningGameDAO repository = DAOFactory.getPlanningGameDAO();

    @Override
    public boolean createGame(PlanningGame pGame) {
        return repository.create(pGame);
    }

    @Override
    public boolean updateGame(PlanningGame pGame) {
        return repository.update(pGame);
    }

    @Override
    public boolean deleteGame(long id) {
        return repository.delete(id);
    }

}
