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
public class UserDAOImpl implements UserDAO {

    public UserDAOImpl() {
    }

    @Override
    public boolean create(User user) {
        return true;
    }

    @Override
    public boolean update(User user) {
        return true;
    }

    @Override
    public User findById(Long idUser) {
        User u = new User(1, "Marcin", "Rosalio", "marcin@rosalio.com", "123456", 2, 1);
        return u;
    }

    @Override
    public User findByUsername(String username) {
        User u = new User(1, "Marcin", "Rosalio", "marcin@rosalio.com", "123456", 2, 1);
        return u;
    }

}
