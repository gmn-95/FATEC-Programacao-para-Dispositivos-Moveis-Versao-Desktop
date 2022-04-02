package agenda.view.contato;

import agenda.controller.ControllerContato;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import agenda.util.Confirmacao;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author gustavo
 */
public class ViewContatoExcluir extends javax.swing.JDialog {

    private boolean editar;
    private boolean excluir;
    private BeanUsuario usuario;
    private JTable tabela;
    private ViewContatoListarBuscar viewContatoListarBuscar;
    private ViewContatoListarBuscar v;
    
    public ViewContatoExcluir(ViewContatoListarBuscar viewContatoListarBuscar, boolean editar, boolean excluir, JTable tabela, BeanUsuario usuario) {
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
        camposEditar();
        
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
        btExcluir = new javax.swing.JButton();
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

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
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
                                .addComponent(inputCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(labelNome)
                                .addComponent(labelCelular)
                                .addComponent(inputNome))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTelefone)
                                        .addComponent(labelEmail))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
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
                .addComponent(btExcluir)
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
    
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
            BeanContato contatoEntrada = new BeanContato(Long.valueOf(inputIdContato.getText()), usuario);

            ControllerContato controllerContato = new ControllerContato();

            BeanContato contatoSaida = controllerContato.excluirContato(contatoEntrada);
            
            if(Confirmacao.compare(contatoSaida)){
                JOptionPane.showMessageDialog(null, "Erro ao excluir Contato", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Contato excluído com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
            
            dispose();
            v.dispose();
            this.viewContatoListarBuscar = new ViewContatoListarBuscar(editar, excluir, usuario);
            this.viewContatoListarBuscar.setVisible(true);
            
    }//GEN-LAST:event_btExcluirActionPerformed
    
    private void camposEditar(){
        int row = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        inputIdContato.setText(String.valueOf(model.getValueAt(row, 0)));
        inputIdContato.setEnabled(false);
        
        inputNome.setText(String.valueOf(model.getValueAt(row, 1)));
        inputNome.setEnabled(false);
        
        inputTelefone.setText(String.valueOf(model.getValueAt(row, 2)));
        inputTelefone.setEnabled(false);
        
        inputCelular.setText(String.valueOf(model.getValueAt(row, 3)));
        inputCelular.setEnabled(false);
        
        inputEmail.setText(String.valueOf(model.getValueAt(row, 4)));
        inputEmail.setEnabled(false);
        
        textAreaObs.setText(String.valueOf(model.getValueAt(row, 5)));
        textAreaObs.setEnabled(false);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
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
