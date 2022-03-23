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
    
}
