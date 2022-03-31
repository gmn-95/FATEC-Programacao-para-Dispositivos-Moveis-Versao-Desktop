/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanAgendamento;
import agenda.model.bean.BeanEnderecoContato;
import agenda.model.dao.DaoEnderecoContato;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class ControllerEnderecoContato {
    
    private DaoEnderecoContato daoEnderecoContato;

    public ControllerEnderecoContato() {
        daoEnderecoContato = new DaoEnderecoContato();
    }
    
    public BeanEnderecoContato inserirEnderecoContato(BeanEnderecoContato enderecoContato){
        return daoEnderecoContato.inserirEnderecoContato(enderecoContato);
    }
    
    public List<BeanEnderecoContato> listarEnderecoContato(BeanEnderecoContato enderecoContato, String tipoPesquisa){
        return daoEnderecoContato.listarEnderecoContato(enderecoContato, tipoPesquisa);
    }
    
    public BeanEnderecoContato buscarEnderecoContato(BeanEnderecoContato enderecoContato){
        return daoEnderecoContato.buscarEnderecoContato(enderecoContato);
    }
    
}
