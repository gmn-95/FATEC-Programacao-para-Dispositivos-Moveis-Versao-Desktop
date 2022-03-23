/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model.dao;

import agenda.model.bean.BeanPessoa;
import agenda.model.bean.BeanUsuario;
import agenda.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gustavo
 */
public class DaoPessoa {
    
    private Connection connection;
    private final ConexaoDb conexaoDb;

    public DaoPessoa() {
        conexaoDb = new ConexaoDb();
    }
    
    public BeanUsuario inserirPessoa(BeanUsuario usuario){
        
        if(conexaoDb.conectar()){
            
            String sql = "INSERT INTO tb_pessoa VALUES (null, ?)";
            
            try {
                
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, usuario.getNome());
                
                preparedStatement.executeUpdate();
                
                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                    if(resultSet.next()){
                        usuario.setId(resultSet.getLong(1));
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
}
