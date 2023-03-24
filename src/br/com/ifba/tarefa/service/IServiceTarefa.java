/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.service;

import java.util.List;
import br.com.ifba.tarefa.entities.Tarefa;

/**
 *
 * @author Felipe
 */
public interface IServiceTarefa {
    
     //salva o aluno
    public abstract Tarefa saveTarefa(Tarefa tarefa);
    //deleta aluno
    public abstract void deleteTarefa(Tarefa tarefa);
    
    public abstract Tarefa updateTarefa(Tarefa tarefa);
    // Metodo que retorna todos os Alunos da base de dados
    public abstract List<Tarefa> getAllTarefa();
    
    public List<Tarefa> findByDescricao(String descricao);
}
