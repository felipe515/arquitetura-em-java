/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.dao;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.infrastructure.dao.IBaseDAO;
import java.util.List;
/**
 *
 * @author Felipe
 */
public interface IdaoTarefa extends IBaseDAO<Tarefa>{
    
     public abstract List<Tarefa> findByDescricao(String descricao);
}
