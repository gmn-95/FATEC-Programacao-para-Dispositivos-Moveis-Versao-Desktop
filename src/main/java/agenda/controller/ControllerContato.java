package agenda.controller;

import agenda.model.bean.BeanContato;
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
    
    public BeanContato inserirContato(BeanContato contato){
        return daoContato.inserirContato(contato);
    }
    
    public List<BeanContato> listarContatos(BeanContato contato, String tiopPesquisa){
        return daoContato.listarContatos(contato, tiopPesquisa);
    }
    
    public BeanContato buscarContato(BeanContato contato){
        return daoContato.buscarContato(contato);
    }
    
    public BeanContato alterarContato(BeanContato contato){
        return daoContato.alterarContato(contato);
    }
    
    public BeanContato excluirTodosContatos(BeanContato contato) {
        return daoContato.excluirTodosContatos(contato);
    }

    public BeanContato excluirContato(BeanContato contato) {
        return daoContato.excluirContato(contato);
    }
    
    
}
