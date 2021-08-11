/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.config;

/**
 *
 * @author pedroppimentel
 */
public interface DatabaseConfig {

    final String USUARIO = "postgres";
    final String SENHA = "postgres";
    final String URL = "jdbc:postgresql://localhost:5432/g5projeto";
    final String DRIVER_NAME = "org.postgresql.Driver";
}
