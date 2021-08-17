/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

import br.unesp.soo.grupocinco.model.Assignment;
import java.util.List;

/**
 *
 * @author pedroppimentel
 */
public interface AssignmentService {
    
    public Assignment getAssignmentById(long id);
            
    public List<Assignment> getAssignments();
    
    public boolean createAssignment(Assignment assignment);
    
    public boolean updateAssignment(Assignment assignment);
    
    public boolean deleteAssignment(long id);
    
    public int calculateComplexity(Assignment assignment);

}
