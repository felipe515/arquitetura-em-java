/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.infrastructure.service;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.service.IServiceTarefa;
import br.com.ifba.tarefa.service.ServiceTarefa;
import java.util.List;
/**
 *
 * @author Felipe
 */
public class Facade implements IFacade{
    
    private final IServiceTarefa serviceTarefa = new ServiceTarefa();
    
    @Override
    public Tarefa saveTarefa(Tarefa tarefa){
        return serviceTarefa.saveTarefa(tarefa);
    }
    
    @Override
    public void deleteTarefa(Tarefa tarefa){
        this.serviceTarefa.deleteTarefa(tarefa);
    }

    @Override
    public Tarefa updateTarefa(Tarefa tarefa) {
        return serviceTarefa.updateTarefa(tarefa);
    }
    
    @Override
    public List<Tarefa> getAllTarefa() {
        return serviceTarefa.getAllTarefa();
    }
    
    @Override
    public List<Tarefa> findByDescricao(String descricao) {
        return serviceTarefa.findByDescricao(descricao);
    }
}
