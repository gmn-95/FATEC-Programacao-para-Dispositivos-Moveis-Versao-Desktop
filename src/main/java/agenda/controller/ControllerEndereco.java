/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanEndereco;
import agenda.model.dao.DaoEndereco;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class ControllerEndereco {
    
    private DaoEndereco daoEndereco;

    public ControllerEndereco() {
        daoEndereco = new DaoEndereco();
    }
    
    public BeanEndereco inserirEndereco(BeanEndereco endereco){
        return daoEndereco.inserirEndereco(endereco);
    }
    
    public BeanEndereco atualizarEndereco(BeanEndereco endereco){
        return daoEndereco.atualizarEndereco(endereco);
    }
    
    public BeanEndereco excluirEndereco(BeanEndereco endereco){
        return daoEndereco.excluirEndereco(endereco);
    }
    
    public BeanEndereco excluirTodosEnderecos(BeanEndereco endereco){
        return daoEndereco.excluirTodosEnderecos(endereco);
    }
            
    public List<BeanEndereco> listarEnderecos(BeanEndereco endereco, String tipoPesquisa){
        return daoEndereco.listarEnderecos(endereco, tipoPesquisa);
    }
            
    public BeanEndereco buscarEndereco(BeanEndereco endereco){
        return daoEndereco.buscarEndereco(endereco);
    }
    
}
