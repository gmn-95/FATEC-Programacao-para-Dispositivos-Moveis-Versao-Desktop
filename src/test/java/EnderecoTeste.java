
import agenda.controller.ControllerEndereco;
import agenda.model.bean.BeanEndereco;
import agenda.model.bean.BeanUsuario;
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
public class EnderecoTeste {
    
    @Test
    public void executeTest() throws Exception{
  
        inserir();
       
    }
    
    public void inserir() throws Exception{
        
        
        BeanEndereco enderecoEntrada = new BeanEndereco("ipava", "São Paulo", "SP", "04951-020", "Catangua", "88", "Casa", new BeanUsuario(1L));
        ControllerEndereco controllerEndereco = new ControllerEndereco();
        
        BeanEndereco enderecoSaida = controllerEndereco.inserirEndereco(enderecoEntrada);
        
        if(enderecoSaida == null){
            throw new Exception("ErroInserir");
        }
        
    }
}
