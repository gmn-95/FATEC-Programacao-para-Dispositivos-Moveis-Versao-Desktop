package agenda.controller;

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
    
    public BeanEnderecoContato alterarEnderecoContato(BeanEnderecoContato enderecoContato){
        return daoEnderecoContato.alterarEnderecoContato(enderecoContato);
    }
    
    //excluirTodosEnderecoContato
    public BeanEnderecoContato excluirTodosEnderecoContato(BeanEnderecoContato enderecoContato){
        return daoEnderecoContato.excluirTodosEnderecoContato(enderecoContato);
    }
    
    public BeanEnderecoContato excluirEnderecoContato(BeanEnderecoContato enderecoContato){
        return daoEnderecoContato.excluirEnderecoContato(enderecoContato);
    }
    
}
