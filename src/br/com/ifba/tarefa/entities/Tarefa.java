/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.entities;

import br.com.ifba.tarefa.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author Felipe
 */

@Entity
@Table(name="tarefas")
public class Tarefa extends PersistenceEntity implements Serializable{
    
    //atrubutos
    private String descricao;
    private boolean finalizado;
    
    @Column(name = "data_Finalizado", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFinalizacao;

   
    public Tarefa() {
    }

    //setters e getters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Date dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
    
    
    
}
