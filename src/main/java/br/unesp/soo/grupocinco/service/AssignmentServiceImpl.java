/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

import br.unesp.soo.grupocinco.dao.AssignmentDAO;
import br.unesp.soo.grupocinco.dao.DAOFactory;
import br.unesp.soo.grupocinco.model.Assignment;
import java.util.List;

/**
 *
 * @author pedroppimentel
 */
public class AssignmentServiceImpl implements AssignmentService {

    private final AssignmentDAO repository = DAOFactory.getAssignmentDAO();
    
    @Override
    public Assignment getAssignmentById(long id) {
        return repository.getById(id);
    }
    
    @Override
    public List<Assignment> getAssignments() {
        return repository.getAll();
    }

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
    
    @Override
    public int calculateComplexity(Assignment assignment) {
        Assignment databaseAssignment = repository.getById(assignment.getId());
        
        int res = 0;
        
        if (databaseAssignment.getId() > 0) {
            res = (databaseAssignment.getComplexidade() + assignment.getComplexidade()) / 2;
        }
        
        return res;
    }

}
