/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gustavo
 */
public class ConexaoDb {
   
    private String banco = "jdbc:mysql://localhost/db_agenda?useTimezone=true&serverTimezone=UTC";
    private String usuario = "root";
    private String senha = "#Mysql_r00t";

    private static Connection connection;
    
    public ConexaoDb() {
    }
    
    public boolean conectar(){
        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(banco, usuario, senha);
            connection.setAutoCommit(false);
            return true;
         
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possível se conectar ao Banco de dados");
            System.out.println("Status--> Erro " + e.getMessage());
            return false;
        }
    }
    
    public void desconectar(){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    
}
