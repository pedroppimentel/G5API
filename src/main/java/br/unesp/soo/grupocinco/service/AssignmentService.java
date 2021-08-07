/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

import br.unesp.soo.grupocinco.model.Assignment;

/**
 *
 * @author pedroppimentel
 */
public interface AssignmentService {

    public boolean createAssignment(Assignment assignment);
    
    public boolean updateAssignment(Assignment assignment);
    
    public boolean deleteAssignment(long id);

}
