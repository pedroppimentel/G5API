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
public class AssignmentDAOImpl implements AssignmentDAO {

    public AssignmentDAOImpl() {
    }

    @Override
    public boolean create(Assignment assignment) {
        return true;
    }

    @Override
    public boolean update(Assignment assignment) {
        return true;
    }

    @Override
    public boolean delete(long id) {
        return true;
    }
    
}
