/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.model;

import java.util.Objects;

/**
 *
 * @author pedroppimentel
 */
public class User {

    private long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private long idPerfil;
    private int status;

    public User() {
    }

    public User(long id, String nome, String sobrenome, String email, String senha, long idPerfil, int status) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.idPerfil = idPerfil;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User us = (User) o;
        return Objects.equals(this.id, us.id) && Objects.equals(this.nome, us.nome)
                && Objects.equals(this.sobrenome, us.sobrenome) && Objects.equals(this.senha, us.senha)
                && Objects.equals(this.idPerfil, us.idPerfil) && Objects.equals(this.status, us.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nome, this.sobrenome, this.senha, this.idPerfil, this.status);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", nome='" + this.nome + '\'' + ", sobrenome='" + this.sobrenome + '\''
                + this.senha + '\'' + this.idPerfil + '\'' + this.status + '\'' + '}';
    }

}