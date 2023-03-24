
package br.com.ifba.tarefa.service;

import br.com.ifba.tarefa.dao.DaoTarefa;
import br.com.ifba.tarefa.dao.IdaoTarefa;
import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.infrastructure.exception.BusinessException;
import java.util.List;
/**
 *
 * @author felipe
 */
public class ServiceTarefa implements IServiceTarefa{
    
     //mensagem de erro se a Tarefa for null;
    public final static String TAREFA_NULL = "Tarefa null";
    
    //mensagem de erro se a Tarefa já existir;
    public final static String TAREFA_EXISTE = "A tarefa já existe,";
    
    //mensagem de erro se a Tarefa não existir no banco;
    public final static String TAREFA_NAO_EXISTE = "A tarefa não existe na base de dados";
    
    //mensagem de erro se a Tarefa for inválida;
    public final static String TAREFA_INVALIDA = "Tarefa inválida";
    
    //objeto
    private final IdaoTarefa daoTarefa = new DaoTarefa();
    
    //metodos
    @Override
    public Tarefa saveTarefa(Tarefa tarefa) {
        
        if(tarefa == null){
            //Tratamento de exceção; se o aluno for NULL/Vazio
            throw new BusinessException(TAREFA_NULL);
        }
        if(daoTarefa.findById(tarefa.getId()) != null) {
            throw new BusinessException(TAREFA_EXISTE);
        } 
        
        return daoTarefa.save(tarefa);
    }

    @Override
    public void deleteTarefa(Tarefa tarefa) {
       if(tarefa == null){
            throw new BusinessException(TAREFA_NULL);
        }
       if(this.daoTarefa.findById(tarefa.getId()) == null) {
            throw new BusinessException(TAREFA_NAO_EXISTE);
        }
       
        this.daoTarefa.delete(tarefa);
    }

    @Override
    public Tarefa updateTarefa(Tarefa tarefa) {
        if(tarefa == null) {
            throw new BusinessException(TAREFA_NULL);
        }
        if(daoTarefa.findById(tarefa.getId()) == null) {
           throw new BusinessException(TAREFA_NAO_EXISTE);
        }
          return daoTarefa.update(tarefa);
    }

    @Override
    public List<Tarefa> getAllTarefa() {
        return daoTarefa.findAll();
    }

    @Override
    public List<Tarefa> findByDescricao(String descricao) {
        if(descricao == null) {
            throw new BusinessException("Descricao null");
        } 
        
        return daoTarefa.findByDescricao(descricao);
        
    }
}
