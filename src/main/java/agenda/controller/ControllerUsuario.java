/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanUsuario;
import agenda.model.dao.DaoUsuario;

/**
 *
 * @author gustavo
 */
public class ControllerUsuario {
    
    private final DaoUsuario daoUsuario;

    public ControllerUsuario() {
        daoUsuario = new DaoUsuario();
    }
    
    public BeanUsuario validarLogin(BeanUsuario usuario){
        usuario = daoUsuario.validarLogin(usuario);
        return usuario;
    }
    
    
}
