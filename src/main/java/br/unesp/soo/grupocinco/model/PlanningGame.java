/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.soo.grupocinco.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

/**
 *
 * @author pedroppimentel
 */
@Table(name = "jogo")
@DiscriminatorValue("jogo")
public class PlanningGame implements Serializable {

    @Column(name = "id", nullable = false, unique = true)
    private long id;
    
    @Column(name = "titulo", nullable = false, unique = true)
    private String titulo;
    
    @Column(name = "id_tarefa", nullable = false, unique = true)
    private long idtarefa;

    public PlanningGame() {
    }

    public PlanningGame(long id, String titulo, long idtarefa) {
        this.id = id;
        this.titulo = titulo;
        this.idtarefa = idtarefa;
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
