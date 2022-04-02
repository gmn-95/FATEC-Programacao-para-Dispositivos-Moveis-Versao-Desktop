package agenda.model.dao;

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

    public BeanUsuario atualizarPessoa(BeanUsuario usuario) {
        if(conexaoDb.conectar()){
            
            String sql = "UPDATE tb_pessoa SET nome = ? WHERE id = ?";
            
            try {
                
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, usuario.getNome());
                preparedStatement.setLong(2, usuario.getId());
                
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

    public BeanUsuario excluirPessoa(BeanUsuario usuario) {
        if(conexaoDb.conectar()){
            
            String sql = "DELETE FROM tb_pessoa WHERE id = ?";
            
            try {
                
                connection = conexaoDb.getConnection();
                
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, usuario.getId());
                
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
        return null;
    }
}
