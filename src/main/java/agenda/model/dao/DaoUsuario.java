/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model.dao;

import agenda.model.bean.BeanUsuario;
import agenda.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class DaoUsuario {
    
    private Connection connection;
    private final ConexaoDb conexaoDb;
    
    public DaoUsuario() {
        conexaoDb = new ConexaoDb();
    }
    
    public List<BeanUsuario> listarUsuarios(BeanUsuario usuario, String tipoPesquisa){
        
        List<BeanUsuario> listaUsuarios = new ArrayList<>();
        
        String sql;
        
        if(conexaoDb.conectar()){
            
            try {

                connection = conexaoDb.getConnection();
                
                sql = "select * from tb_usuario AS usu inner join tb_pessoa AS pes ON usu.fk_id_pessoa = pes.id";
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                
                switch(tipoPesquisa){
                    case "Todos":
                        preparedStatement = connection.prepareStatement(sql);
                        break;
                        
                    case "Login":
                        sql = "select * from tb_usuario AS usu inner join tb_pessoa AS pes ON usu.fk_id_pessoa = pes.id "
                                + "WHERE usu.login Like UPPER(?)";
                        
                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, "%" + usuario.getLogin() + "%");
                        break;
                    
                    case "Nome":
                    sql = "select * from tb_usuario AS usu inner join tb_pessoa AS pes ON usu.fk_id_pessoa = pes.id "
                            + "WHERE pes.nome Like UPPER(?)";

                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, "%" + usuario.getNome()+ "%");
                    break;
                }
                
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){

                    BeanUsuario beanUsuario = new BeanUsuario(resultSet.getLong("id"), 
                            resultSet.getString("login"), 
                            resultSet.getString("senha"), 
                            resultSet.getBoolean("criar_novo_usuario"), 
                            resultSet.getBoolean("editar_usuario"), 
                            resultSet.getBoolean("excluir_usuario"), 
                            resultSet.getBoolean("listar_usuario"), 
                            resultSet.getBoolean("buscar_usuario"), 
                            resultSet.getLong("fk_id_pessoa"), 
                            resultSet.getString("nome"));
                    listaUsuarios.add(beanUsuario);
                }
                
                resultSet.close();
                connection.commit();
                connection.close();
                
                return listaUsuarios;
                
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                return null;
            }
        }
        return null;
    }
    
    public BeanUsuario inserirUsuario(BeanUsuario usuario){
        if(conexaoDb.conectar()){
            
            String sql = "INSERT INTO tb_usuario (login, senha, fk_id_pessoa, criar_novo_usuario, editar_usuario, excluir_usuario, listar_usuario, buscar_usuario)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            try {
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, usuario.getLogin());
                preparedStatement.setString(2, usuario.getSenha());
                preparedStatement.setLong(3, usuario.getId());
                preparedStatement.setBoolean(4, usuario.isCriar_novo_usuario());
                preparedStatement.setBoolean(5, usuario.isEditar_usuario());
                preparedStatement.setBoolean(6, usuario.isExcluir_usuario());
                preparedStatement.setBoolean(7, usuario.isListar_usuario());
                preparedStatement.setBoolean(8, usuario.isBuscar_usuario());
                
                preparedStatement.executeUpdate();
                
                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                    if(resultSet.next()){
                        usuario.setId_usuario(resultSet.getLong(1));
                    }
                    
                    resultSet.close();
                }
                
                connection.commit();
                connection.close();
                
                return usuario;
                
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            finally{
                conexaoDb.desconectar();
            }
        }
        
        conexaoDb.desconectar();
        return null;
    }
    
    public BeanUsuario validarLogin(BeanUsuario usuario){
        
        if(conexaoDb.conectar()){
            String sql = "select * from tb_usuario where login = ? and senha = ?";
            
            try {
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, usuario.getLogin());
                preparedStatement.setString(2, usuario.getSenha());
                
                ResultSet resultSet = preparedStatement.executeQuery();
                
              
                while(resultSet.next()){
                    usuario.setId_usuario(resultSet.getLong("id"));
                    usuario.setCriar_novo_usuario(resultSet.getBoolean("criar_novo_usuario"));
                    usuario.setEditar_usuario(resultSet.getBoolean("editar_usuario"));
                    usuario.setExcluir_usuario(resultSet.getBoolean("excluir_usuario"));
                    usuario.setListar_usuario(resultSet.getBoolean("listar_usuario"));
                    usuario.setBuscar_usuario(resultSet.getBoolean("buscar_usuario"));
                }
                resultSet.close();
                if(usuario.getId_usuario() != null){
                    connection.commit();
                    return usuario;
                }
                else{
                    return null;
                    
                }
            } catch (SQLException e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            finally{
                conexaoDb.desconectar();
            }
        }
        conexaoDb.desconectar();
        return null;
    }

    public BeanUsuario atualizarUsuario(BeanUsuario usuario) {
        if(conexaoDb.conectar()){
            
            String sql = "UPDATE tb_usuario SET login = ?, senha = ?, "
                    + "criar_novo_usuario = ?, editar_usuario = ?, excluir_usuario = ?, "
                    + "listar_usuario = ?, buscar_usuario = ? WHERE id = ?";
            
            try {
                
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, usuario.getLogin());
                preparedStatement.setString(2, usuario.getSenha());
                preparedStatement.setBoolean(3, usuario.isCriar_novo_usuario());
                preparedStatement.setBoolean(4, usuario.isEditar_usuario());
                preparedStatement.setBoolean(5, usuario.isExcluir_usuario());
                preparedStatement.setBoolean(6, usuario.isListar_usuario());
                preparedStatement.setBoolean(7, usuario.isBuscar_usuario());
                preparedStatement.setLong(8, usuario.getId_usuario());
                
                preparedStatement.executeUpdate();
                
                connection.commit();
                conexaoDb.desconectar();
                
                return usuario;
                
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                return null;
            }
            finally{
                conexaoDb.desconectar();
            }
            
        }
        conexaoDb.desconectar();
        return null;
    }

    public BeanUsuario buscarUsuario(BeanUsuario usuario) {
        if(conexaoDb.conectar()){
            
            String sql = "select * from tb_usuario AS usu inner join tb_pessoa "
                    + "AS pes ON usu.fk_id_pessoa = pes.id WHERE usu.id = ?";
            
            try {
                
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, usuario.getId_usuario());
                
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    usuario = new BeanUsuario(resultSet.getLong("id"), 
                            resultSet.getString("login"), 
                            resultSet.getString("senha"), 
                            resultSet.getBoolean("criar_novo_usuario"), 
                            resultSet.getBoolean("editar_usuario"), 
                            resultSet.getBoolean("excluir_usuario"), 
                            resultSet.getBoolean("listar_usuario"), 
                            resultSet.getBoolean("buscar_usuario"), 
                            resultSet.getLong("fk_id_pessoa"), 
                            resultSet.getString("nome"));
                }
                
                connection.commit();
                conexaoDb.desconectar();
                
                return usuario;
                
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                return null;
            }
            finally{
                conexaoDb.desconectar();
            }
            
        }
        conexaoDb.desconectar();
        return null;
    }

    public BeanUsuario excluirUsuario(BeanUsuario usuario) {
        if(conexaoDb.conectar()){
            
            String sql = "DELETE FROM tb_usuario WHERE id = ?";
            
            try {
                
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, usuario.getId_usuario());
                
                preparedStatement.executeUpdate();
                
                connection.commit();
                conexaoDb.desconectar();
                
                return usuario;
                
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            finally{
                conexaoDb.desconectar();
            }
            
        }
        conexaoDb.desconectar();
        return null;
    }
    
}
