/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pedroppimentel
 */
public class Assignment {

    private long id;
    private String titulo;
    private String descricao;
    private int complexidade;
    private long responsavel;
    private long desenvolvedor;
    private Date dataInicio;
    private Date dataTermino;

    public Assignment() {
    }

    public Assignment(long id, String titulo, String descricao, int complexidade, long responsavel, long desenvolvedor, Date dataInicio, Date dataTermino) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.complexidade = complexidade;
        this.responsavel = responsavel;
        this.desenvolvedor = desenvolvedor;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

    public long getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(long responsavel) {
        this.responsavel = responsavel;
    }

    public long getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(long desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        Assignment as = (Assignment) o;
        return Objects.equals(this.id, as.id) && Objects.equals(this.titulo, as.titulo)
                && Objects.equals(this.descricao, as.descricao) && Objects.equals(this.complexidade, as.complexidade)
                && Objects.equals(this.responsavel, as.responsavel) && Objects.equals(this.desenvolvedor, as.desenvolvedor)
                && Objects.equals(this.dataInicio, as.dataInicio) && Objects.equals(this.dataTermino, as.dataTermino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.titulo, this.descricao, this.complexidade, this.responsavel, this.desenvolvedor, this.dataInicio, this.dataTermino);
    }

    @Override
    public String toString() {
        return "Assignment{" + "id=" + this.id + ", titulo='" + this.titulo + '\'' + ", descricao='" + this.descricao + '\''
                + ", complexidade='" + this.complexidade + '\'' + ", responsavel='" + this.responsavel + '\''
                + ", desenvolvedor='" + this.desenvolvedor + '\'' + ", dataInicio='" + this.dataInicio + '\''
                + ", dataTermino='" + this.dataTermino + '}';
    }

}
