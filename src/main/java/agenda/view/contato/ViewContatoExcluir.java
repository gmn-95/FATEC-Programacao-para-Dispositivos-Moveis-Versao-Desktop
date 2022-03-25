/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.view.contato;


import agenda.view.usuario.*;
import agenda.controller.ControllerPessoa;
import agenda.controller.ControllerUsuario;
import agenda.model.bean.BeanUsuario;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gustavo
 */
public class ViewContatoExcluir extends javax.swing.JDialog{
    
    private boolean editar;
    private boolean excluir;
    private BeanUsuario usuario;
    
    private JTable tabela;
    private ViewContatoListarBuscar viewUsuarioListarBuscar;
    private ViewContatoListarBuscar v;
        
    public ViewContatoExcluir(ViewContatoListarBuscar viewUsuarioListarBuscar, boolean editar, boolean excluir, JTable tabela, BeanUsuario usuario) {
        super(viewUsuarioListarBuscar, true);
        
        this.viewUsuarioListarBuscar = viewUsuarioListarBuscar;
        this.viewUsuarioListarBuscar.setVisible(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.usuario = usuario;
        
        initComponents();
    
        setLocationRelativeTo(null);
        camposEditar(tabela);
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
        btExcluir = new javax.swing.JButton();
        radioCriar = new javax.swing.JRadioButton();
        radioEditar = new javax.swing.JRadioButton();
        labelOpcaoUsuario = new javax.swing.JLabel();
        radioExcluir = new javax.swing.JRadioButton();
        radioListarBuscar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        inputIdUsuario = new javax.swing.JTextField();
        IdPessoa = new javax.swing.JLabel();
        inputIdPessoa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelNome.setText("Nome");

        labelLogin.setText("Login");

        labelSenha.setText("Senha");

        labelConfirmarSenha.setText("Confirmar Senha");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        radioCriar.setText("Criar usuário");

        radioEditar.setText("Editar usuário");

        labelOpcaoUsuario.setText("Opções de usuário (Opcional)");

        radioExcluir.setText("Excluir usuário");

        radioListarBuscar.setText("Listar/Buscar usuário");

        jLabel1.setText("Id Usuário");

        inputIdUsuario.setEditable(false);

        IdPessoa.setText("Id Pessoa");

        inputIdPessoa.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOpcaoUsuario)
                            .addComponent(radioCriar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioListarBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioEditar)
                                    .addComponent(radioExcluir)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelNome)
                                        .addComponent(labelSenha)
                                        .addComponent(inputSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addComponent(inputNome))
                                    .addComponent(jLabel1)
                                    .addComponent(inputIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdPessoa)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelLogin)
                                        .addComponent(labelConfirmarSenha)
                                        .addComponent(inputLogin)
                                        .addComponent(inputConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioListarBuscar)
                    .addComponent(radioExcluir))
                .addGap(35, 35, 35)
                .addComponent(btExcluir)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        v = new ViewContatoListarBuscar(editar, excluir, usuario);
        v.setVisible(true);
        v.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.viewUsuarioListarBuscar = new ViewContatoListarBuscar(editar, excluir, usuario);
        this.viewUsuarioListarBuscar.setVisible(true);
        v.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
   
    }//GEN-LAST:event_formWindowClosed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
           
            BeanUsuario beanUsuario = new BeanUsuario(Long.valueOf(inputIdUsuario.getText()), Long.valueOf(inputIdPessoa.getText()));

            ControllerUsuario controllerUsuario = new ControllerUsuario();
            beanUsuario = controllerUsuario.excluirUsuario(beanUsuario);
            
            ControllerPessoa controllerPessoa = new ControllerPessoa();
            BeanUsuario beanUsuarioSaida = controllerPessoa.excluirPessoa(beanUsuario);

            JOptionPane.showMessageDialog(null, beanUsuarioSaida);

            dispose();
            v.dispose();
            this.viewUsuarioListarBuscar = new ViewContatoListarBuscar(editar, excluir, usuario);
            this.viewUsuarioListarBuscar.setVisible(true);
    }//GEN-LAST:event_btExcluirActionPerformed


    private void camposEditar(JTable tabela){
        int row = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        inputIdUsuario.setText(String.valueOf(model.getValueAt(row, 0)));
        inputIdUsuario.setEnabled(false);
        
        inputIdPessoa.setText(String.valueOf(model.getValueAt(row, 1)));
        inputIdPessoa.setEnabled(false);
        
        inputNome.setText(String.valueOf(model.getValueAt(row, 2)));
        inputNome.setEnabled(false);
        
        inputLogin.setText(String.valueOf(model.getValueAt(row, 3)));
        inputLogin.setEnabled(false);
        
        inputSenha.setText(String.valueOf(model.getValueAt(row, 4)));
        inputSenha.setEnabled(false);
        
        inputConfirmarSenha.setText(String.valueOf(model.getValueAt(row, 4)));
        inputConfirmarSenha.setEnabled(false);
        
        radioCriar.setSelected((boolean) model.getValueAt(row, 5));
        radioCriar.setEnabled(false);
        
        radioEditar.setSelected((boolean) model.getValueAt(row, 6));
        radioEditar.setEnabled(false);
        
        radioExcluir.setSelected((boolean) model.getValueAt(row, 7));
        radioExcluir.setEnabled(false);
        
        radioListarBuscar.setSelected((boolean) model.getValueAt(row, 8));
        radioListarBuscar.setEnabled(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdPessoa;
    private javax.swing.JButton btExcluir;
    private javax.swing.JPasswordField inputConfirmarSenha;
    private javax.swing.JTextField inputIdPessoa;
    private javax.swing.JTextField inputIdUsuario;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JLabel jLabel1;
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
