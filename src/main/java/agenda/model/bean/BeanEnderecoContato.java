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
    private String obs;

    public BeanEnderecoContato(Long id) {
        this.id = id;
    }

    public BeanEnderecoContato(BeanEndereco endereco, BeanContato contato, String obs) {
        this.endereco = endereco;
        this.contato = contato;
        this.obs = obs;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BeanEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(BeanEndereco endereco) {
        this.endereco = endereco;
    }

    public BeanContato getContato() {
        return contato;
    }

    public void setContato(BeanContato contato) {
        this.contato = contato;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "BeanEnderecoContato{" + "id=" + id + ", endereco=" + endereco + ", contato=" + contato + ", obs=" + obs + '}';
    }
    
    
}
