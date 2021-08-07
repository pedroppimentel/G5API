/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.PlanningGame;

/**
 *
 * @author pedroppimentel
 */
public interface PlanningGameDAO {

    public boolean create(PlanningGame pGame);

    public boolean update(PlanningGame pGame);

    public boolean delete(long id);
}
