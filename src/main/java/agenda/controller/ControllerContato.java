/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import agenda.model.dao.DaoContato;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class ControllerContato {
    
    private DaoContato daoContato;

    public ControllerContato() {
        daoContato = new DaoContato();
    }
    
    public List<BeanContato> listarContatos(BeanUsuario usuario){
        return daoContato.listarContatos(usuario);
    }
    
    public BeanContato buscarContato(BeanContato contato, BeanUsuario usuario){
        return daoContato.buscarContato(contato, usuario);
    }
    
    
}