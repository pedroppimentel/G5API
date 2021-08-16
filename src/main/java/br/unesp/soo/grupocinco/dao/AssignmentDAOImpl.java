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
import java.util.ArrayList;
import java.util.List;
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
    public Assignment getById(long id) {
        Assignment a = new Assignment();
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(SELECT_ASSIGNMENT_BY_ID);
                pstm.setLong(1, id);

                res = pstm.executeQuery();

                while (res.next()) {
                    a.setId(res.getLong(1));
                    a.setTitulo(res.getString(2));
                    a.setDescricao(res.getString(3));
                    a.setComplexidade(res.getInt(4));
                    a.setResponsavel(res.getLong(5));
                    a.setDesenvolvedor(res.getInt(6));
                    a.setDataInicio(res.getString(7));
                    a.setDataTermino(res.getString(8));
                }

                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return a;
    } 

    @Override
    public List<Assignment> getAll() {
        List<Assignment> listAssgnment = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        try {
            con = ConnectionFactory.getConexao();

            if (con != null) {
                pstm = con.prepareStatement(SELECT_ASSIGNMENT);

                res = pstm.executeQuery();

                while (res.next()) {
                    Assignment a = new Assignment();
                    a.setId(res.getLong(1));
                    a.setTitulo(res.getString(2));
                    a.setDescricao(res.getString(3));
                    a.setComplexidade(res.getInt(4));
                    a.setResponsavel(res.getLong(5));
                    a.setDesenvolvedor(res.getInt(6));
                    a.setDataInicio(res.getString(7));
                    a.setDataTermino(res.getString(8));
                    listAssgnment.add(a);
                }

                return listAssgnment;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listAssgnment;
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
                pstm.setString(6, assignment.getDataInicio());
                pstm.setString(7, assignment.getDataTermino());

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
                pstm.setString(6, assignment.getDataInicio());
                pstm.setString(7, assignment.getDataTermino());
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
