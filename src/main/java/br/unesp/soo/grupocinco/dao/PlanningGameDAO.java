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

    final String INSERT_PLANNING_GAME = "INSERT INTO public.jogo (titulo, id_tarefa) VALUES(?, ?);";

    final String UPDATE_PLANNING_GAME = "UPDATE public.jogo "
            + "SET titulo=?, id_tarefa=? WHERE id=?;";

    final String DELETE_PLANNING_GAME = "DELETE FROM public.jogo WHERE id=?;";

    public boolean create(PlanningGame pGame);

    public boolean update(PlanningGame pGame);

    public boolean delete(long id);
}
