/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.model.dao;

import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import agenda.util.ConexaoDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gustavo
 */
public class DaoContato {
    
    private Connection connection;
    private final ConexaoDb conexaoDb;

    public DaoContato() {
        conexaoDb = new ConexaoDb();
    }
    
    public BeanContato buscarContato(BeanContato contato, BeanUsuario usuario){
        
        if(conexaoDb.conectar()){
            
            String sql = "select * from tb_contato, tb_usuario where tb_contato.nome = ? "
                    + "and fk_id_usuario = ? and fk_id_usuario = tb_usuario.id";
            
            try {
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, contato.getNome());
                preparedStatement.setLong(2, usuario.getId_usuario());
                
                ResultSet resultSet = preparedStatement.executeQuery();
                
                if(resultSet.next()){
                    contato.setId(resultSet.getLong("id"));
                    
                    connection.commit();
                    resultSet.close();

                    return  contato;
                }
                
                return null;
                
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }
    
    public List<BeanContato> listarContatos(BeanUsuario usuario){
        
        if(conexaoDb.conectar()){
            
            List<BeanContato> list = new ArrayList<>();
            
            String sql = "select * from tb_contato, tb_usuario "
                + "where fk_id_usuario = ? and fk_id_usuario = tb_usuario.id";
        
            try {
                connection = conexaoDb.getConnection();
                 
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, usuario.getId_usuario());
                
                ResultSet resultSet = preparedStatement.executeQuery();

                while(resultSet.next()){
                    BeanContato contato = new BeanContato(resultSet.getLong("id"), 
                            new BeanUsuario(resultSet.getLong("fk_id_usuario")), 
                            resultSet.getString("nome"), resultSet.getString("telefone_fixo"), 
                            resultSet.getString("celular"), resultSet.getString("email"), 
                            resultSet.getString("obs"));
                    
                    list.add(contato);
                }
                
                connection.commit();
                resultSet.close();
                
                return list;
                
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
        System.out.println("teste1");
        return null;
        
    }
    
}
