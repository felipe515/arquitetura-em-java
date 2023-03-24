/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.infrastructure.service;

import br.com.ifba.tarefa.entities.Tarefa;
import java.util.List;
/**
 *
 * @author Felipe
 */
public interface IFacade {
    
    public abstract Tarefa saveTarefa(Tarefa tarefa);
    public abstract Tarefa updateTarefa(Tarefa tarefa);
    public abstract void deleteTarefa(Tarefa tarefa);
    public List<Tarefa> getAllTarefa();
    public List<Tarefa> findByDescricao(String descricao);
}
