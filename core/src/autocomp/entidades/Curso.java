/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autocomp.entidades;

import java.io.Serializable;

/**
 *
 * @author 31032109
 */
public class Curso implements Serializable{
    
    private int id;
    private String nome;
    private int semestres;
    private Usuario coordenador;
    
    public Curso(int id, String nome, int semestres, Usuario coordenador){
        this.id = id;
        this.nome = nome;
        this.semestres = semestres;
        this.coordenador = coordenador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public Usuario getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Usuario coordenador) {
        this.coordenador = coordenador;
    }
}
