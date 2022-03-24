/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanUsuario;
import agenda.model.dao.DaoUsuario;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class ControllerUsuario {
    
    private final DaoUsuario daoUsuario;

    public ControllerUsuario() {
        daoUsuario = new DaoUsuario();
    }
    
    public BeanUsuario inserirUsuario(BeanUsuario usuario){
        return daoUsuario.inserirUsuario(usuario);
    }
    
    public List<BeanUsuario> listarUsuario(BeanUsuario usuario, String tipoPesquisa){
        return daoUsuario.listarUsuarios(usuario, tipoPesquisa);
    }
    
    public BeanUsuario validarLogin(BeanUsuario usuario){
        usuario = daoUsuario.validarLogin(usuario);
        return usuario;
    }

    public BeanUsuario atualizarUsuario(BeanUsuario usuario) {
        return usuario = daoUsuario.atualizarUsuario(usuario);
    }
    
    
}
