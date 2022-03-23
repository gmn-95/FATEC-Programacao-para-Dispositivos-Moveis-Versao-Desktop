
import agenda.model.bean.BeanUsuario;
import agenda.model.dao.DaoContato;
import javax.swing.JOptionPane;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class DaoContatoTeste {

    public DaoContatoTeste() {
    }
    
    @Test
    public void listar(){
        DaoContato contato = new DaoContato();
        BeanUsuario beanUsuario = new BeanUsuario(1l);
        System.out.println(beanUsuario.getId_usuario());
        if(contato.listarContatos(beanUsuario) != null){
            JOptionPane.showMessageDialog(null, "Sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "erro");
        }
    }
    
}
