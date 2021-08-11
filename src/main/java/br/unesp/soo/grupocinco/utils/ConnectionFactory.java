/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.utils;

import br.unesp.soo.grupocinco.config.DatabaseConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pedroppimentel
 */
public class ConnectionFactory implements DatabaseConfig {

    public static Connection getConexao() throws SQLException {
        Connection con = null;

        try {
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Message: " + ex.getMessage());
        }

        return con;
    }

    public boolean fechar(Connection con) {
        return false;
    }

    public boolean fechar(Connection con, PreparedStatement pstm) {
        return false;
    }

    public boolean fechar(Connection con, PreparedStatement pstm, ResultSet res) {
        return false;
    }

}
