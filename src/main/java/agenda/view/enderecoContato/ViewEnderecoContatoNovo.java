
package agenda.view.enderecoContato;

import agenda.controller.ControllerContato;
import agenda.controller.ControllerEndereco;
import agenda.controller.ControllerEnderecoContato;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanEndereco;
import agenda.model.bean.BeanEnderecoContato;
import agenda.model.bean.BeanUsuario;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class ViewEnderecoContatoNovo extends javax.swing.JFrame {

    private BeanUsuario usuario;
    private final Vector<Long> id_contato = new Vector<>();
    private final Vector<Long> id_endereco = new Vector<>();
    
    public ViewEnderecoContatoNovo(BeanUsuario usuario) {
        this.usuario = usuario;
        initComponents();
        enderecoComboBox();
        contatoComboBox();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        labelObs = new javax.swing.JLabel();
        cbxContato = new javax.swing.JComboBox<>();
        labelContato = new javax.swing.JLabel();
        cbxEndereco = new javax.swing.JComboBox<>();
        labelEnderecos = new javax.swing.JLabel();
        inputObs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        labelObs.setText("Obs");

        cbxContato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        labelContato.setText("Contato");

        cbxEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        labelEnderecos.setText("Endereços");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxContato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContato, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEnderecos)
                            .addComponent(cbxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelObs)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputObs, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContato)
                    .addComponent(labelEnderecos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelObs)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSalvar)
                        .addComponent(btLimpar))
                    .addComponent(inputObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       if(validarCampos() == false){
           JOptionPane.showMessageDialog(null, "Selecione todos os campos obrigatórios!", "Selecione todos os campos!", JOptionPane.WARNING_MESSAGE);
       }
       else{
           
            BeanContato contato = new BeanContato(id_contato.get(cbxContato.getSelectedIndex() - 1), usuario);
            BeanEndereco endereco = new BeanEndereco(id_endereco.get(cbxEndereco.getSelectedIndex() - 1), usuario);
            
            BeanEnderecoContato enderecoContatoEntrada = new BeanEnderecoContato(
                    endereco, contato, inputObs.getText(), usuario);

            ControllerEnderecoContato controllerEnderecoContato = new ControllerEnderecoContato();

            BeanEnderecoContato enderecoContatoSaida = controllerEnderecoContato.inserirEnderecoContato(enderecoContatoEntrada);
            JOptionPane.showMessageDialog(null, enderecoContatoSaida);

            limparCamposTela();  
          
       }
    }//GEN-LAST:event_btSalvarActionPerformed
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCamposTela();
    }//GEN-LAST:event_btLimparActionPerformed

    private boolean validarCampos(){
        return !(cbxContato.getSelectedIndex() == 0 || cbxEndereco.getSelectedIndex() == 0);
    }
    
    private void enderecoComboBox(){
        try {
            
            ControllerEndereco controllerEndereco = new ControllerEndereco();
            BeanEndereco endereco = new BeanEndereco(usuario);
            List<BeanEndereco> enderecos = controllerEndereco.listarEnderecos(endereco, "Todos");
            
            cbxContato.addItem("Selecione");
            
            for(BeanEndereco en : enderecos){
                id_endereco.addElement(en.getId());
                
                String mostrar = 
                        String.format(en.getBairro() + ", " + en.getLogradouro() 
                                + ", " + en.getNumero() + ", " + en.getCep() + ", " 
                                + en.getCidade() + "-" + en.getEstado());
                
                cbxEndereco.addItem(mostrar);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void contatoComboBox(){
        try {
            
            ControllerContato controllerContato = new ControllerContato();
            BeanContato contato = new BeanContato(usuario);
            List<BeanContato> contatos = controllerContato.listarContatos(contato, "Todos");
            
            cbxContato.removeAllItems();
            cbxContato.addItem("Selecione");
            
            for(BeanContato bc : contatos){
                id_contato.addElement(bc.getId());
                cbxContato.addItem(bc.getNome());
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void limparCamposTela(){
       
        cbxContato.setSelectedIndex(0);
        cbxEndereco.setSelectedIndex(0);
        inputObs.setText("");
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbxContato;
    private javax.swing.JComboBox<String> cbxEndereco;
    private javax.swing.JTextField inputObs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelEnderecos;
    private javax.swing.JLabel labelObs;
    // End of variables declaration//GEN-END:variables
}
