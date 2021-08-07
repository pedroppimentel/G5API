/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

import br.unesp.soo.grupocinco.dao.AssignmentDAO;
import br.unesp.soo.grupocinco.dao.DAOFactory;
import br.unesp.soo.grupocinco.model.Assignment;

/**
 *
 * @author pedroppimentel
 */
public class AssignmentServiceImpl implements AssignmentService {

    private final AssignmentDAO repository = DAOFactory.getAssignmentDAO();

    @Override
    public boolean createAssignment(Assignment assignment) {
        return repository.create(assignment);
    }

    @Override
    public boolean updateAssignment(Assignment assignment) {
        return repository.update(assignment);
    }

    @Override
    public boolean deleteAssignment(long id) {
        return repository.delete(id);
    }

}
