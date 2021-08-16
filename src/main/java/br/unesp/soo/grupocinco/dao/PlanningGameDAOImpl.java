/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.PlanningGame;
import br.unesp.soo.grupocinco.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedroppimentel
 */
public class PlanningGameDAOImpl implements PlanningGameDAO {

    public PlanningGameDAOImpl() {
    }

    @Override
    public List<PlanningGame> getAll() {
        List<PlanningGame> listGame = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(SELECT_PLANNING_GAME);

                res = pstm.executeQuery();

                while (res.next()) {
                    PlanningGame p = new PlanningGame();
                    p.setId(res.getLong(1));
                    p.setTitulo(res.getString(2));
                    p.setIdtarefa(res.getLong(3));
                    listGame.add(p);
                }

                return listGame;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlanningGameDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listGame;
    }

    @Override
    public boolean create(PlanningGame pGame) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(INSERT_PLANNING_GAME);
                pstm.setString(1, pGame.getTitulo());
                pstm.setLong(2, pGame.getIdtarefa());

                pstm.executeQuery();

                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    @Override
    public boolean update(PlanningGame pGame) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(UPDATE_PLANNING_GAME);
                pstm.setString(1, pGame.getTitulo());
                pstm.setLong(2, pGame.getIdtarefa());
                pstm.setLong(3, pGame.getId());

                pstm.executeUpdate();

                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    @Override
    public boolean delete(long id) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(DELETE_PLANNING_GAME);
                pstm.setLong(1, id);

                pstm.executeUpdate();

                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

}
