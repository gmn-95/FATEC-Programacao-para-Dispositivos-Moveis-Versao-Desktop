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
        return daoUsuario.atualizarUsuario(usuario);
    }

    public BeanUsuario buscarUsuario(BeanUsuario usuario) {
        return daoUsuario.buscarUsuario(usuario);
    }

    public BeanUsuario excluirUsuario(BeanUsuario usuario) {
        return daoUsuario.excluirUsuario(usuario);
    }
    
}
