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
public class BeanUsuario extends BeanPessoa{
    
    private Long id_usuario;
    private String login;
    private String senha;
    private boolean criar_novo_usuario;
    private boolean editar_usuario;
    private boolean excluir_usuario;
    private boolean listar_usuario;
    private boolean buscar_usuario;

    public BeanUsuario() {
    }

    public BeanUsuario(Long id, String nome) {
        super(id, nome);
    }

    public BeanUsuario(String nome) {
        super(nome);
    }
    
    

    public BeanUsuario(Long id_usuario, String login, String senha, boolean criar_novo_usuario, boolean editar_usuario, boolean excluir_usuario, boolean listar_usuario, boolean buscar_usuario, String nome) {
        super(nome);
        this.id_usuario = id_usuario;
        this.login = login;
        this.senha = senha;
        this.criar_novo_usuario = criar_novo_usuario;
        this.editar_usuario = editar_usuario;
        this.excluir_usuario = excluir_usuario;
        this.listar_usuario = listar_usuario;
        this.buscar_usuario = buscar_usuario;
    }

    public BeanUsuario(Long id_usuario, String login, String senha, boolean criar_novo_usuario, boolean editar_usuario, boolean excluir_usuario, boolean listar_usuario, boolean buscar_usuario, Long id, String nome) {
        super(id, nome);
        this.id_usuario = id_usuario;
        this.login = login;
        this.senha = senha;
        this.criar_novo_usuario = criar_novo_usuario;
        this.editar_usuario = editar_usuario;
        this.excluir_usuario = excluir_usuario;
        this.listar_usuario = listar_usuario;
        this.buscar_usuario = buscar_usuario;
    }
    
    public BeanUsuario(String login, String senha, boolean criar_novo_usuario, boolean buscar_usuario, boolean editar_usuario, boolean excluir_usuario, boolean listar_usuario) {
        this.login = login;
        this.senha = senha;
        this.criar_novo_usuario = criar_novo_usuario;
        this.editar_usuario = editar_usuario;
        this.excluir_usuario = excluir_usuario;
        this.listar_usuario = listar_usuario;
        this.buscar_usuario = buscar_usuario;
    }

    public BeanUsuario(String login, String senha, boolean criar_novo_usuario, boolean buscar_usuario, boolean editar_usuario, boolean excluir_usuario, boolean listar_usuario, String nome) {
        super(nome);
        this.login = login;
        this.senha = senha;
        this.criar_novo_usuario = criar_novo_usuario;
        this.editar_usuario = editar_usuario;
        this.excluir_usuario = excluir_usuario;
        this.listar_usuario = listar_usuario;
        this.buscar_usuario = buscar_usuario;
    }

   
    public BeanUsuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public BeanUsuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isCriar_novo_usuario() {
        return criar_novo_usuario;
    }

    public void setCriar_novo_usuario(boolean criar_novo_usuario) {
        this.criar_novo_usuario = criar_novo_usuario;
    }

    public boolean isBuscar_usuario() {
        return buscar_usuario;
    }

    public void setBuscar_usuario(boolean buscar_usuario) {
        this.buscar_usuario = buscar_usuario;
    }
    
    

    public boolean isEditar_usuario() {
        return editar_usuario;
    }

    public void setEditar_usuario(boolean editar_usuario) {
        this.editar_usuario = editar_usuario;
    }

    public boolean isExcluir_usuario() {
        return excluir_usuario;
    }

    public void setExcluir_usuario(boolean excluir_usuario) {
        this.excluir_usuario = excluir_usuario;
    }

    public boolean isListar_usuario() {
        return listar_usuario;
    }

    public void setListar_usuario(boolean listar_usuario) {
        this.listar_usuario = listar_usuario;
    }

    @Override
    public String toString() {
        return "BeanUsuario{" + "id_usuario=" + id_usuario + ", id_pessoa=" + getNome() + ", login=" + login + ", senha=" + senha + ", criar_novo_usuario=" + criar_novo_usuario + ", editar_usuario=" + editar_usuario + ", excluir_usuario=" + excluir_usuario + ", listar_usuario=" + listar_usuario + '}';
    }

    
    
    
    
}
