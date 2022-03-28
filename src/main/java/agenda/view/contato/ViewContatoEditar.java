package agenda.view.contato;

import agenda.controller.ControllerContato;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author gustavo
 */
public class ViewContatoEditar extends javax.swing.JDialog {

    private boolean editar;
    private boolean excluir;
    private BeanUsuario usuario;
    private JTable tabela;
    private ViewContatoListarBuscar viewContatoListarBuscar;
    private ViewContatoListarBuscar v;
    
    public ViewContatoEditar(ViewContatoListarBuscar viewContatoListarBuscar, boolean editar, boolean excluir, JTable tabela, BeanUsuario usuario) {
        super(viewContatoListarBuscar, true);
        
        this.viewContatoListarBuscar = viewContatoListarBuscar;
        this.viewContatoListarBuscar.setVisible(false);
        
        this.usuario = usuario;
        this.editar = editar;
        this.excluir = excluir;
        this.tabela = tabela;
        
        initComponents();
        setLocationRelativeTo(null);
        formartarCampoCelularTelefone();
        camposEditar(tabela);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        inputTelefone = new javax.swing.JFormattedTextField();
        inputCelular = new javax.swing.JFormattedTextField();
        labelObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaObs = new javax.swing.JTextArea();
        inputEmail = new javax.swing.JTextField();
        labelIdContato = new javax.swing.JLabel();
        inputIdContato = new javax.swing.JTextField();

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

        labelTelefone.setText("Telefone");

        labelCelular.setText("Celular");

        labelEmail.setText("Email");

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

        inputTelefone.setMaximumSize(new java.awt.Dimension(157, 24));
        inputTelefone.setMinimumSize(new java.awt.Dimension(157, 24));

        labelObs.setText("Obs");

        textAreaObs.setColumns(20);
        textAreaObs.setRows(5);
        jScrollPane1.setViewportView(textAreaObs);

        inputEmail.setMaximumSize(new java.awt.Dimension(157, 24));
        inputEmail.setMinimumSize(new java.awt.Dimension(157, 24));

        labelIdContato.setText("Id contato");

        inputIdContato.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputIdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdContato)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelObs)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputCelular)
                                .addComponent(labelNome)
                                .addComponent(labelCelular)
                                .addComponent(inputNome)
                                .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTelefone)
                                        .addComponent(labelEmail))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelIdContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputIdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(labelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelular)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btLimpar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.viewContatoListarBuscar = new ViewContatoListarBuscar(editar, excluir, usuario);
        this.viewContatoListarBuscar.setVisible(true);
        v.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        v = new ViewContatoListarBuscar(editar, excluir, usuario);
        v.setVisible(true);
        v.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formartarCampoCelularTelefone(){
        try {
            MaskFormatter celularFormatado = new MaskFormatter("(##) #####-####");
            celularFormatado.install(inputCelular);
            
            MaskFormatter telefoneFormatado = new MaskFormatter("(##) ####-####");
            telefoneFormatado.install(inputTelefone);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo." , "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if(validarCampos() == false){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!", "Preencha todos os campos!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            String celular = inputCelular.getText();
            String telefone = inputTelefone.getText();

            if(celular.equals("(  )      -    ")){
                celular = "";
            }

            if(telefone.equals("(  )     -    ")){
                telefone = "";
            }

            BeanContato contatoEntrada = new BeanContato(Long.valueOf(inputIdContato.getText()), usuario, inputNome.getText(),
                telefone, celular, inputEmail.getText(), textAreaObs.getText());

            ControllerContato controllerContato = new ControllerContato();

            BeanContato contatoSaida = controllerContato.alterarContato(contatoEntrada);
            JOptionPane.showMessageDialog(null, contatoSaida);
            
            dispose();
            v.dispose();
            this.viewContatoListarBuscar = new ViewContatoListarBuscar(editar, excluir, usuario);
            this.viewContatoListarBuscar.setVisible(true);

        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCamposTela();
    }//GEN-LAST:event_btLimparActionPerformed
    
    private boolean validarCampos(){
        return !(inputNome.getText().isEmpty() || inputNome.getText() == null);
    }
    
    private void limparCamposTela(){
        
        inputNome.setText("");
        inputCelular.setText("");
        inputTelefone.setText("");
        formartarCampoCelularTelefone();
        inputEmail.setText("");
        textAreaObs.setText("");

    }
 
    private void camposEditar(JTable tabela){
        int row = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        inputIdContato.setText(String.valueOf(model.getValueAt(row, 0)));
        inputIdContato.setEnabled(false);
        
        inputNome.setText(String.valueOf(model.getValueAt(row, 1)));
        
        inputTelefone.setText(String.valueOf(model.getValueAt(row, 2)));
        inputCelular.setText(String.valueOf(model.getValueAt(row, 3)));
        
        inputEmail.setText(String.valueOf(model.getValueAt(row, 4)));
        textAreaObs.setText(String.valueOf(model.getValueAt(row, 5)));
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JFormattedTextField inputCelular;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputIdContato;
    private javax.swing.JTextField inputNome;
    private javax.swing.JFormattedTextField inputTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIdContato;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelObs;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JTextArea textAreaObs;
    // End of variables declaration//GEN-END:variables
}
