package agenda.view.usuario;

import agenda.controller.ControllerPessoa;
import agenda.controller.ControllerUsuario;
import agenda.model.bean.BeanUsuario;
import agenda.util.Confirmacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author gustavo
 */
public class ViewUsuarioEditar extends javax.swing.JDialog {

    private boolean editar;
    private boolean excluir;
    private BeanUsuario usuario;
    private JTable tabela;
    private ViewUsuarioListarBuscar viewUsuarioListarBuscar;
    private ViewUsuarioListarBuscar v;
    
    public ViewUsuarioEditar(ViewUsuarioListarBuscar viewUsuarioListarBuscar, boolean editar, boolean excluir, JTable tabela, BeanUsuario usuario) {
        super(viewUsuarioListarBuscar, true);
        
        this.viewUsuarioListarBuscar = viewUsuarioListarBuscar;
        this.viewUsuarioListarBuscar.setVisible(false);
        
        this.usuario = usuario;
        this.editar = editar;
        this.excluir = excluir;
        
        initComponents();
        setLocationRelativeTo(null);
        
        this.tabela = tabela;
        
        camposEditar();
        
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
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
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

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        radioCriar.setText("Criar usu??rio");

        radioEditar.setText("Editar usu??rio");

        labelOpcaoUsuario.setText("Op????es de usu??rio (Opcional)");

        radioExcluir.setText("Excluir usu??rio");

        radioListarBuscar.setText("Listar/Buscar usu??rio");

        jLabel1.setText("Id Usu??rio");

        inputIdUsuario.setEditable(false);

        IdPessoa.setText("Id Pessoa");

        inputIdPessoa.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
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
                                .addComponent(inputSenha)
                                .addComponent(inputNome)
                                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(inputConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btLimpar))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.viewUsuarioListarBuscar = new ViewUsuarioListarBuscar(editar, excluir, usuario);
        this.viewUsuarioListarBuscar.setVisible(true);
        v.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        v = new ViewUsuarioListarBuscar(editar, excluir, usuario);
        v.setVisible(true);
        v.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if(validarCampos() == false){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigat??rios!", "Preencha todos os campos!", JOptionPane.WARNING_MESSAGE);
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
                        Long.valueOf(inputIdUsuario.getText()),
                    inputLogin.getText(), senha, podeCriar,
                    podeEditar, podeExcluir, podeListar, podeBuscar, Long.valueOf(inputIdPessoa.getText()), inputNome.getText());

                ControllerPessoa controllerPessoa = new ControllerPessoa();
                beanUsuario = controllerPessoa.atualizarPessoa(beanUsuario);

                ControllerUsuario controllerUsuario = new ControllerUsuario();
                BeanUsuario beanUsuarioSaida = controllerUsuario.atualizarUsuario(beanUsuario);

                if(Confirmacao.compare(beanUsuarioSaida)){
                    JOptionPane.showMessageDialog(null, "Erro ao editar Usu??rio", "Erro!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usu??rio editado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }

                limparCamposTela();
                
                dispose();
                v.dispose();
                this.viewUsuarioListarBuscar = new ViewUsuarioListarBuscar(editar, excluir, usuario);
                this.viewUsuarioListarBuscar.setVisible(true);

            }
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private boolean confirmaSenha(){
        String senha = String.valueOf(inputSenha.getPassword());
        String confirmaSenha = String.valueOf(inputConfirmarSenha.getPassword());
        
        return senha.equals(confirmaSenha);
    }
    
    private boolean validarCampos(){
        
        String senha = String.valueOf(inputSenha.getPassword());
        String confirmaSenha = String.valueOf(inputConfirmarSenha.getPassword());
        
        return !(inputLogin.getText().isEmpty() || senha.isEmpty() || senha == null || confirmaSenha.isEmpty()
                || confirmaSenha == null || inputNome.getText().isEmpty());
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCamposTela();
    }//GEN-LAST:event_btLimparActionPerformed

    private void limparCamposTela(){
       
        inputIdPessoa.setText("");
        inputIdUsuario.setText("");
        inputNome.setText("");
        inputLogin.setText("");
        inputSenha.setText("");
        inputConfirmarSenha.setText("");
        radioCriar.setSelected(false);
        radioEditar.setSelected(false);
        radioExcluir.setSelected(false);
        radioListarBuscar.setSelected(false);

    }
 
    private void camposEditar(){
        int row = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        inputIdUsuario.setText(String.valueOf(model.getValueAt(row, 0)));
        inputIdUsuario.setEnabled(false);
        
        inputIdPessoa.setText(String.valueOf(model.getValueAt(row, 1)));
        inputIdPessoa.setEnabled(false);
        
        inputNome.setText(String.valueOf(model.getValueAt(row, 2)));
        inputLogin.setText(String.valueOf(model.getValueAt(row, 3)));
        
        inputSenha.setText(String.valueOf(model.getValueAt(row, 4)));
        inputConfirmarSenha.setText(String.valueOf(model.getValueAt(row, 4)));
        
        radioCriar.setSelected((boolean) model.getValueAt(row, 5));
        radioEditar.setSelected((boolean) model.getValueAt(row, 6));
        radioExcluir.setSelected((boolean) model.getValueAt(row, 7));
        radioListarBuscar.setSelected((boolean) model.getValueAt(row, 8));
        
        if(!usuario.isCriar_novo_usuario()){
            radioCriar.setEnabled(false);
            radioExcluir.setEnabled(false);
            radioEditar.setEnabled(false);
            radioListarBuscar.setEnabled(false);
            
            btLimpar.setEnabled(false);
            
            if(!String.valueOf(usuario.getId_usuario()).equals(String.valueOf(model.getValueAt(row, 0)))){
                inputNome.setEnabled(false);
                inputSenha.setEnabled(false);
                inputConfirmarSenha.setEnabled(false);
                inputLogin.setEnabled(false);
                
                btAtualizar.setEnabled(false);
            }  
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdPessoa;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btLimpar;
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
