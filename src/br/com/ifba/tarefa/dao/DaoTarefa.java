/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.dao;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.infrastructure.dao.BaseDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Felipe
 */
public class DaoTarefa extends BaseDAO<Tarefa> implements IdaoTarefa{
    
    @Override
    public List<Tarefa> findByDescricao(String descricao) {
        String busca = "SELECT a FROM Tarefa AS a WHERE a.descricao like '%:descricao%' ";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("descricao", descricao);
        return query.getResultList();
    }
}
