/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.service;

import br.unesp.soo.grupocinco.dao.DAOFactory;
import br.unesp.soo.grupocinco.dao.UserDAO;
import br.unesp.soo.grupocinco.model.User;

/**
 *
 * @author pedroppimentel
 */
public class UserServiceImpl implements UserService {

    private final UserDAO repository = DAOFactory.getUserDAO();

    @Override
    public User getOneByID(long id) {
        return repository.findById(id);
    }

    @Override
    public boolean createUser(User user) {
        return repository.create(user);
    }

}
