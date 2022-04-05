package agenda.controller;

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

    public BeanUsuario atualizarPessoa(BeanUsuario usuario) {
        return daoPessoa.atualizarPessoa(usuario);
    }

    public BeanUsuario excluirPessoa(BeanUsuario usuario) {
        return daoPessoa.excluirPessoa(usuario);
    }
    
}
