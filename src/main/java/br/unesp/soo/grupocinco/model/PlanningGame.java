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
    private List<Assignment> tarefas;

    public PlanningGame() {
    }

    public PlanningGame(long id, String titulo, List<Assignment> tarefas) {
        this.id = id;
        this.titulo = titulo;
        this.tarefas = tarefas;
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

    public List<Assignment> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Assignment> tarefas) {
        this.tarefas = tarefas;
    }

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
                && Objects.equals(this.tarefas, pg.tarefas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.titulo, this.tarefas);
    }

    @Override
    public String toString() {
        return "PlanningGame{" + "id=" + this.id + ", titulo='" + this.titulo + '\'' + ", tarefas='" + this.tarefas + '\'' + '}';
    }
}
