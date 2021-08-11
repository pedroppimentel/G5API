/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.dao;

import br.unesp.soo.grupocinco.model.Assignment;
import br.unesp.soo.grupocinco.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedroppimentel
 */
public class AssignmentDAOImpl implements AssignmentDAO {

    public AssignmentDAOImpl() {
    }

    @Override
    public boolean create(Assignment assignment) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(INSERT_ASSIGNMENT);
                pstm.setString(1, assignment.getTitulo());
                pstm.setString(2, assignment.getDescricao());
                pstm.setInt(3, assignment.getComplexidade());
                pstm.setLong(4, assignment.getResponsavel());
                pstm.setLong(5, assignment.getDesenvolvedor());
                pstm.setDate(6, (Date) assignment.getDataInicio());
                pstm.setDate(7, (Date) assignment.getDataTermino());

                pstm.executeQuery();

                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    @Override
    public boolean update(Assignment assignment) {
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(UPDATE_ASSIGNMENT);
                pstm.setString(1, assignment.getTitulo());
                pstm.setString(2, assignment.getDescricao());
                pstm.setInt(3, assignment.getComplexidade());
                pstm.setLong(4, assignment.getResponsavel());
                pstm.setLong(5, assignment.getDesenvolvedor());
                pstm.setDate(6, (Date) assignment.getDataInicio());
                pstm.setDate(7, (Date) assignment.getDataTermino());
                pstm.setLong(8, assignment.getId());

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
                pstm = con.prepareStatement(DELETE_ASSIGNMENT);
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
