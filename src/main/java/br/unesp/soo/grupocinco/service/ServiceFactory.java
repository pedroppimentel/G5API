/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

/**
 *
 * @author pedroppimentel
 */
public class ServiceFactory {

    private ServiceFactory() {
    }

    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    public static AssignmentService getAssignmentService() {
        return new AssignmentServiceImpl();
    }
    
    public static PlanningGameService getPlanningGameService() {
        return new PlanningGameServiceImpl();
    }
}
