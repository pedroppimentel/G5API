/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.Assignment;

/**
 *
 * @author pedroppimentel
 */
public interface AssignmentDAO {

    final String INSERT_ASSIGNMENT = "INSERT INTO public.tarefa "
            + "(titulo, descricao, complexidade, id_responsavel, id_desenvolvedor, data_inicio, data_termino) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?);";

    final String UPDATE_ASSIGNMENT = "UPDATE public.tarefa "
            + "SET titulo=?, descricao=?, complexidade=?, id_responsavel=?, "
            + "id_desenvolvedor=?, data_inicio=?, data_termino=? "
            + "WHERE id=?;";

    final String DELETE_ASSIGNMENT = "DELETE FROM public.tarefa WHERE id=?;";

    public boolean create(Assignment assignment);

    public boolean update(Assignment assignment);

    public boolean delete(long id);
}
