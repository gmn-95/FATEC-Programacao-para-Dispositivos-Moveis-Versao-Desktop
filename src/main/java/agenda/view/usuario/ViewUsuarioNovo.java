
package agenda.view.usuario;

import agenda.controller.ControllerPessoa;
import agenda.controller.ControllerUsuario;
import agenda.model.bean.BeanUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class ViewUsuarioNovo extends javax.swing.JFrame {

    
    public ViewUsuarioNovo(BeanUsuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        inputLogin = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        labelConfirmarSenha = new javax.swing.JLabel();
        inputConfirmarSenha = new javax.swing.JPasswordField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        radioCriar = new javax.swing.JRadioButton();
        radioEditar = new javax.swing.JRadioButton();
        labelOpcaoUsuario = new javax.swing.JLabel();
        radioExcluir = new javax.swing.JRadioButton();
        radioListarBuscar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labelNome.setText("Nome");

        labelLogin.setText("Login");

        labelSenha.setText("Senha");

        labelConfirmarSenha.setText("Confirmar Senha");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");

        radioCriar.setText("Criar usuário");

        radioEditar.setText("Editar usuário");

        labelOpcaoUsuario.setText("Opções de usuário (Opcional)");

        radioExcluir.setText("Excluir usuário");

        radioListarBuscar.setText("Listar/Buscar usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOpcaoUsuario)
                    .addComponent(radioCriar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNome)
                            .addComponent(labelSenha)
                            .addComponent(inputSenha)
                            .addComponent(inputNome)
                            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelLogin)
                                .addComponent(labelConfirmarSenha)
                                .addComponent(inputLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(inputConfirmarSenha))
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioListarBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioEditar)
                            .addComponent(radioExcluir))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(labelConfirmarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(labelOpcaoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCriar)
                    .addComponent(radioEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioListarBuscar)
                    .addComponent(radioExcluir))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
           if(confirmaSenha() == false){
               JOptionPane.showMessageDialog(null, "Confirme sua senha corretamente!", "Senha errada!", JOptionPane.WARNING_MESSAGE);
           }
           else{
               
               boolean podeCriar = radioCriar.isSelected();
               boolean podeEditar = radioEditar.isSelected();
               boolean podeListar = radioListarBuscar.isSelected();
               boolean podeExcluir = radioExcluir.isSelected();
               boolean podeBuscar = radioListarBuscar.isSelected();
               
               String senha = String.valueOf(inputSenha.getPassword());
               
               BeanUsuario beanUsuario = new BeanUsuario(
                       inputLogin.getText(), senha, podeCriar, 
                       podeBuscar, podeExcluir, podeListar, podeEditar, inputNome.getText());
               
               ControllerPessoa controllerPessoa = new ControllerPessoa();
               beanUsuario = controllerPessoa.inserirPessoa(beanUsuario);
               
               ControllerUsuario controllerUsuario = new ControllerUsuario();
               BeanUsuario beanUsuarioSaida = controllerUsuario.inserirUsuario(beanUsuario);
               
               JOptionPane.showMessageDialog(null, beanUsuarioSaida);
               
               limparCamposTela();
               
           }
       }
    }//GEN-LAST:event_btSalvarActionPerformed

    private boolean validarCampos(){
        
        String senha = String.valueOf(inputSenha.getPassword());
        String confirmaSenha = String.valueOf(inputConfirmarSenha.getPassword());
        
        return !(inputLogin.getText().isEmpty() || senha.isEmpty() || senha == null || confirmaSenha.isEmpty()
                || confirmaSenha == null || inputNome.getText().isEmpty());
    }
    
    private boolean confirmaSenha(){
        String senha = String.valueOf(inputSenha.getPassword());
        String confirmaSenha = String.valueOf(inputConfirmarSenha.getPassword());
        
        return senha.equals(confirmaSenha);
    }
    
    private void limparCamposTela(){
       
        inputNome.setText("");
        inputLogin.setText("");
        inputSenha.setText("");
        inputConfirmarSenha.setText("");
        radioCriar.setSelected(false);
        radioEditar.setSelected(false);
        radioExcluir.setSelected(false);
        radioListarBuscar.setSelected(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPasswordField inputConfirmarSenha;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelOpcaoUsuario;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JRadioButton radioCriar;
    private javax.swing.JRadioButton radioEditar;
    private javax.swing.JRadioButton radioExcluir;
    private javax.swing.JRadioButton radioListarBuscar;
    // End of variables declaration//GEN-END:variables
}
