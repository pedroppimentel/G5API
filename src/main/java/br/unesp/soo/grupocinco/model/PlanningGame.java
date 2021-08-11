/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author pedroppimentel
 */
public class PlanningGame {

    private long id;
    private String titulo;
    // private List<Assignment> tarefas;
    private long idtarefa;

    public PlanningGame() {
    }

    public PlanningGame(long id, String titulo, long idtarefa) {
        this.id = id;
        this.titulo = titulo;
        this.idtarefa = idtarefa;
        // this.tarefas = tarefas;
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

    public long getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(long idtarefa) {
        this.idtarefa = idtarefa;
    }

    /*
    public List<Assignment> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Assignment> tarefas) {
        this.tarefas = tarefas;
    }*/
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        PlanningGame pg = (PlanningGame) o;
        return Objects.equals(this.id, pg.id) && Objects.equals(this.titulo, titulo)
                && Objects.equals(this.idtarefa, pg.idtarefa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.titulo, this.idtarefa);
    }

    @Override
    public String toString() {
        return "PlanningGame{" + "id=" + this.id + ", titulo='" + this.titulo + '\'' + ", idTarefa='" + this.idtarefa + '\'' + '}';
    }
}
