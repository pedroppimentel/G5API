/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

/**
 *
 * @author pedroppimentel
 */
public class DAOFactory {

    private DAOFactory() {
    }
    
    public static UserDAO getUserDAO() {
        return new UserDAOImpl();
    }
}
