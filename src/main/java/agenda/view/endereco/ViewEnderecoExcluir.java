package agenda.view.endereco;

import agenda.controller.ControllerEndereco;
import agenda.controller.ControllerEnderecoContato;
import agenda.model.bean.BeanEndereco;
import agenda.model.bean.BeanEnderecoContato;
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
public class ViewEnderecoExcluir extends javax.swing.JDialog {

    private boolean editar;
    private boolean excluir;
    private BeanUsuario usuario;
    private JTable tabela;
    private ViewEnderecoListarBuscar viewEnderecoListarBuscar;
    private ViewEnderecoListarBuscar v;
    
    public ViewEnderecoExcluir(ViewEnderecoListarBuscar viewEnderecoListarBuscar, boolean editar, boolean excluir, JTable tabela, BeanUsuario usuario) {
        super(viewEnderecoListarBuscar, true);
        
        this.viewEnderecoListarBuscar = viewEnderecoListarBuscar;
        this.viewEnderecoListarBuscar.setVisible(false);
        
        this.usuario = usuario;
        this.editar = editar;
        this.excluir = excluir;
        this.tabela = tabela;
        
        initComponents();
        setLocationRelativeTo(null);
        formartarCampoCep();
        camposEditar();
        
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
        btExcluir = new javax.swing.JButton();
        inputCidade = new javax.swing.JFormattedTextField();
        inputEstado = new javax.swing.JFormattedTextField();
        inputCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        inputLogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputNumero = new javax.swing.JTextField();
        labelComplemento = new javax.swing.JLabel();
        inputComplemento = new javax.swing.JTextField();
        inputId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        labelBairro.setText("Bairro");

        labelCidade.setText("Cidade");

        labelEstado.setText("Estado");

        labelCep.setText("Cep");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Logradouro");

        jLabel2.setText("Numero");

        labelComplemento.setText("Complemento");

        inputId.setEditable(false);

        jLabel3.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(labelBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputBairro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(labelCidade)
                                    .addComponent(labelCep)
                                    .addComponent(inputCidade)
                                    .addComponent(inputCep)
                                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelComplemento)
                            .addComponent(jLabel1)
                            .addComponent(inputComplemento))
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGap(34, 34, 34)
                .addComponent(btExcluir)
                .addGap(36, 36, 36))
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
  
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.viewEnderecoListarBuscar = new ViewEnderecoListarBuscar(editar, excluir, usuario);
        this.viewEnderecoListarBuscar.setVisible(true);
        v.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        v = new ViewEnderecoListarBuscar(editar, excluir, usuario);
        v.setVisible(true);
        v.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        BeanEndereco enderecoEntrada = new BeanEndereco(Long.parseLong(inputId.getText()), usuario);
        
        BeanEnderecoContato enderecoContato = new BeanEnderecoContato(enderecoEntrada, usuario);
        ControllerEnderecoContato controllerEnderecoContato = new ControllerEnderecoContato();
        controllerEnderecoContato.excluirEnderecoContatoPorEndereco(enderecoContato);
        

        ControllerEndereco controllerEndereco = new ControllerEndereco();

        BeanEndereco enderecoSaida = controllerEndereco.excluirEndereco(enderecoEntrada);
        
        if(Confirmacao.compare(enderecoSaida)){
            JOptionPane.showMessageDialog(null, "Erro ao excluir Endereço", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Endereço excluído com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        dispose();
        v.dispose();
        this.viewEnderecoListarBuscar = new ViewEnderecoListarBuscar(editar, excluir, usuario);
        this.viewEnderecoListarBuscar.setVisible(true);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void formartarCampoCep(){
        try {
            MaskFormatter cepFormatado = new MaskFormatter("#####-###");//04951-020
            cepFormatado.install(inputCep);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo." , "ERRO", JOptionPane.ERROR);
        }
    }
 
    private void camposEditar(){
        int row = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        inputId.setText(String.valueOf(model.getValueAt(row, 0)));
        inputId.setEnabled(false);
        
        inputBairro.setText(String.valueOf(model.getValueAt(row, 1)));
        inputBairro.setEnabled(false);
        
        inputCidade.setText(String.valueOf(model.getValueAt(row, 2)));
        inputCidade.setEnabled(false);
        
        inputEstado.setText(String.valueOf(model.getValueAt(row, 3)));
        inputEstado.setEnabled(false);
        
        inputCep.setText(String.valueOf(model.getValueAt(row, 4)));
        inputCep.setEnabled(false);
        
        inputLogradouro.setText(String.valueOf(model.getValueAt(row, 5)));
        inputLogradouro.setEnabled(false);
        
        inputNumero.setText(String.valueOf(model.getValueAt(row, 6)));
        inputNumero.setEnabled(false);
        
        inputComplemento.setText(String.valueOf(model.getValueAt(row, 7)));
        inputComplemento.setEnabled(false);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JTextField inputBairro;
    private javax.swing.JFormattedTextField inputCep;
    private javax.swing.JFormattedTextField inputCidade;
    private javax.swing.JTextField inputComplemento;
    private javax.swing.JFormattedTextField inputEstado;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputLogradouro;
    private javax.swing.JTextField inputNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelEstado;
    // End of variables declaration//GEN-END:variables
}
