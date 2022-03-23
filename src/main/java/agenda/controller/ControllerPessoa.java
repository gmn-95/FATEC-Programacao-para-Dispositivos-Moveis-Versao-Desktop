/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import agenda.model.bean.BeanPessoa;
import agenda.model.bean.BeanUsuario;
import agenda.model.dao.DaoPessoa;

/**
 *
 * @author gustavo
 */
public class ControllerPessoa {
    
    private DaoPessoa daoPessoa;

    public ControllerPessoa() {
        daoPessoa = new DaoPessoa();
    }
    
    public BeanUsuario inserirPessoa(BeanUsuario usuario){
        return daoPessoa.inserirPessoa(usuario);
    }
    
}
