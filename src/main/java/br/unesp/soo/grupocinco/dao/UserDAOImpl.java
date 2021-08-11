/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.User;
import br.unesp.soo.grupocinco.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedroppimentel
 */
public class UserDAOImpl implements UserDAO {

    public UserDAOImpl() {
    }

    @Override
    public boolean create(User user) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(INSERT_USER);
                pstm.setString(1, user.getNome());
                pstm.setString(2, user.getSobrenome());
                pstm.setString(3, user.getEmail());
                pstm.setLong(4, user.getIdPerfil());
                pstm.setLong(5, user.getStatus());

                pstm.executeUpdate();

                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    @Override
    public boolean update(User user) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(UPDATE_USER);
                pstm.setString(1, user.getNome());
                pstm.setString(2, user.getSobrenome());
                pstm.setString(3, user.getEmail());
                pstm.setLong(4, user.getIdPerfil());
                pstm.setLong(5, user.getStatus());
                pstm.setLong(6, user.getId());

                pstm.executeUpdate();

                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    @Override
    public User findById(Long idUser) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        User u = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(FIND_USER_BY_ID);
                pstm.setLong(1, idUser);

                res = pstm.executeQuery();

                while (res.next()) {
                    u = new User();
                    u.setId(res.getLong(1));
                    u.setNome(res.getString(2));
                    u.setSobrenome(res.getString(3));
                    u.setEmail(res.getString(4));
                    u.setIdPerfil(res.getLong(5));
                    u.setStatus(res.getInt(6));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return u;
    }

    @Override
    public User findByUsername(String username) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        User u = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(FIND_USER_BY_USERNAME);
                pstm.setString(1, username);

                res = pstm.executeQuery();

                while (res.next()) {
                    u = new User();
                    u.setId(res.getLong(1));
                    u.setNome(res.getString(2));
                    u.setSobrenome(res.getString(3));
                    u.setEmail(res.getString(4));
                    u.setIdPerfil(res.getLong(5));
                    u.setStatus(res.getInt(6));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return u;
    }

}
