/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model.bean;

/**
 *
 * @author gustavo
 */
public class BeanEnderecoContato {
    
    private Long id;
    private BeanEndereco endereco;
    private BeanContato contato;

    public BeanEnderecoContato(Long id) {
        this.id = id;
    }

    public BeanEnderecoContato(BeanEndereco endereco, BeanContato contato) {
        this.endereco = endereco;
        this.contato = contato;
    }
    
    public BeanEnderecoContato(Long id, BeanEndereco endereco, BeanContato contato) {
        this.id = id;
        this.endereco = endereco;
        this.contato = contato;
    }

    public BeanEnderecoContato(BeanEndereco endereco) {
        this.endereco = endereco;
    }

    public BeanEnderecoContato(BeanContato contato) {
        this.contato = contato;
    }
    
    
    
    
    
}
