
package agenda.view.endereco;

import agenda.controller.ControllerEndereco;
import agenda.model.bean.BeanEndereco;
import agenda.model.bean.BeanUsuario;
import agenda.util.Confirmacao;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gustavo
 */
public class ViewEnderecoNovo extends javax.swing.JFrame {

    private BeanUsuario usuario;
    
    public ViewEnderecoNovo(BeanUsuario usuario) {
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
        formartarCampoCep();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelBairro = new javax.swing.JLabel();
        inputBairro = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        inputCidade = new javax.swing.JFormattedTextField();
        inputEstado = new javax.swing.JFormattedTextField();
        inputCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        inputLogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputNumero = new javax.swing.JTextField();
        labelComplemento = new javax.swing.JLabel();
        inputComplemento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labelBairro.setText("Bairro");

        labelCidade.setText("Cidade");

        labelEstado.setText("Estado");

        labelCep.setText("Cep");

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

        jLabel1.setText("Logradouro");

        jLabel2.setText("Numero");

        labelComplemento.setText("Complemento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputLogradouro)
                            .addComponent(labelBairro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputBairro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(labelCidade)
                                    .addComponent(labelCep)
                                    .addComponent(inputCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(inputCep)
                                    .addComponent(inputNumero))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelComplemento)
                            .addComponent(jLabel1)
                            .addComponent(inputComplemento))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairro)
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstado)
                    .addComponent(labelCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelComplemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       if(validarCampos() == false){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!", "Preencha todos os campos!", JOptionPane.WARNING_MESSAGE);
       }
       else{
                String cep = inputCep.getText();
                String complemento = inputComplemento.getText();
                
                if(cep.equals("     -   ")){
                    cep = "";
                }
                
                if(complemento.equals(" ") || complemento == null){
                    complemento = "";
                }
               
                BeanEndereco enderecoEntrada = new BeanEndereco(inputBairro.getText(), inputCidade.getText(), 
                        inputEstado.getText(), cep, inputLogradouro.getText(), inputNumero.getText(), 
                        complemento, usuario);
                
                ControllerEndereco controllerEndereco = new ControllerEndereco();
                
                BeanEndereco enderecoSaida = controllerEndereco.inserirEndereco(enderecoEntrada);
                
                if(Confirmacao.compare(enderecoSaida)){
                    JOptionPane.showMessageDialog(null, "Erro ao inserir novo endereco", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Endereço criado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
               
                limparCamposTela();  
          
       }
    }//GEN-LAST:event_btSalvarActionPerformed
    
    private void formartarCampoCep(){
        try {
            MaskFormatter cepFormatado = new MaskFormatter("#####-###");//04951-020
            cepFormatado.install(inputCep);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo." , "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCamposTela();
    }//GEN-LAST:event_btLimparActionPerformed

    private boolean validarCampos(){
        
        return !(inputBairro.getText().isEmpty() || inputBairro.getText().equals("")
                || inputCidade.getText().isEmpty() || inputCidade.getText().equals("")
                || inputEstado.getText().isEmpty() || inputEstado.getText().equals("")
                || inputLogradouro.getText().isEmpty() || inputLogradouro.getText().equals(""));
    }
    
    
    
    private void limparCamposTela(){
       
        inputBairro.setText("");
        inputCidade.setText("");
        inputEstado.setText("");
        inputCep.setText("");
        formartarCampoCep();
        inputLogradouro.setText("");
        inputNumero.setText("");
        inputComplemento.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JFormattedTextField inputCep;
    private javax.swing.JFormattedTextField inputCidade;
    private javax.swing.JTextField inputComplemento;
    private javax.swing.JFormattedTextField inputEstado;
    private javax.swing.JTextField inputLogradouro;
    private javax.swing.JTextField inputNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelEstado;
    // End of variables declaration//GEN-END:variables

}
