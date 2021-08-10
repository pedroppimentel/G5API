/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.User;

/**
 *
 * @author pedroppimentel
 */
public interface UserDAO {
    public boolean create(User user);
    
    public boolean update(User user);

    public User findById(Long idUser);
    
    public User findByUsername(String username);
}
