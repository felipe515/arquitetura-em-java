/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.tarefa.model;

import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.view.TelaTarefa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Felipe
 */
public class TarefaTeste {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        Tarefa ta = new Tarefa();//novo objeto da classe tarefa
        
        TelaTarefa tc = new TelaTarefa();//instanciando um novo objeto da tela cadastro
        tc.setVisible(true);//mostrando a tela
        
        //criando o banco de dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vai");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("vai");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(ta);//banco da classe Tarefa
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
    }
}
