package agenda.view.agendamento;

import agenda.controller.ControllerAgendamento;
import agenda.controller.ControllerContato;
import agenda.model.bean.BeanAgendamento;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import agenda.util.Confirmacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gustavo
 */
public class ViewAgendamentoEditar extends javax.swing.JDialog {
    
    private BeanUsuario usuario;
    private boolean editar;
    private boolean excluir;
    private JTable tabela;
    private ViewAgendamentoListarBuscar viewAgendamentoListarBuscar;
    private ViewAgendamentoListarBuscar v;
    private Vector<Long> id_contato = new Vector<>();
    
    public ViewAgendamentoEditar(ViewAgendamentoListarBuscar viewAgendamentoListarBuscar, boolean editar, boolean excluir, BeanUsuario usuario, JTable tabela) {
        super(viewAgendamentoListarBuscar, true);
       
        this.viewAgendamentoListarBuscar = viewAgendamentoListarBuscar;
        this.viewAgendamentoListarBuscar.setVisible(false);
        
        this.usuario = usuario;
        this.editar = editar;
        this.excluir = excluir;
        this.tabela = tabela;
        
        initComponents();
        
        formataCampoData();
        formataCampoHor├írio();
        
        setLocationRelativeTo(null);
        
        camposEditar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inputData = new javax.swing.JFormattedTextField();
        inputDescricao = new javax.swing.JTextField();
        cbxContato = new javax.swing.JComboBox<>();
        inputHorario = new javax.swing.JFormattedTextField();
        labelDataAtualizar = new javax.swing.JLabel();
        labelHoraAtualizar = new javax.swing.JLabel();
        labelDescricaoAtualizar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelContatoAtualizar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputConteudo = new javax.swing.JTextArea();
        labelId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputIdContato = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btAtualizarAgendamento = new javax.swing.JButton();
        btLimparFormAgendamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Agendamento");
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

        inputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataActionPerformed(evt);
            }
        });

        cbxContato.setToolTipText("");
        cbxContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxContatoActionPerformed(evt);
            }
        });

        inputHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHorarioActionPerformed(evt);
            }
        });

        labelDataAtualizar.setText("Data");

        labelHoraAtualizar.setText("Hor├írio");

        labelDescricaoAtualizar.setText("Descri├ž├úo");

        jLabel4.setText("Conte├║do");

        labelContatoAtualizar.setText("Contato");

        inputConteudo.setColumns(20);
        inputConteudo.setRows(5);
        jScrollPane1.setViewportView(inputConteudo);

        labelId.setText("Id");

        inputIdContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDataAtualizar)
                                .addComponent(labelHoraAtualizar)
                                .addComponent(labelDescricaoAtualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(labelContatoAtualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxContato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputDescricao)
                            .addComponent(inputData)
                            .addComponent(inputHorario)
                            .addComponent(inputId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputIdContato, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataAtualizar)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHoraAtualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescricaoAtualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContatoAtualizar)
                    .addComponent(inputIdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btAtualizarAgendamento.setText("Atualizar");
        btAtualizarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarAgendamentoActionPerformed(evt);
            }
        });

        btLimparFormAgendamento.setText("Limpar");
        btLimparFormAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFormAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btAtualizarAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btLimparFormAgendamento)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizarAgendamento)
                    .addComponent(btLimparFormAgendamento))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataActionPerformed

    }//GEN-LAST:event_inputDataActionPerformed

    private void cbxContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxContatoActionPerformed

    }//GEN-LAST:event_cbxContatoActionPerformed

    private void inputHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHorarioActionPerformed
    }//GEN-LAST:event_inputHorarioActionPerformed

    private void btAtualizarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarAgendamentoActionPerformed
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
             
            BeanContato contato = new BeanContato(Long.valueOf(inputIdContato.getText()));
            
            BeanAgendamento agendamentoEntrada = new BeanAgendamento(Long.valueOf(inputId.getText()),
                    contato,
                    usuario, dataFormat.parse(inputData.getText()), horaFormat.parse(inputHorario.getText()),
                    inputDescricao.getText(), inputConteudo.getText());
            
            ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
            
            BeanAgendamento agendamentoSaida = controllerAgendamento.atualizarAgendamento(agendamentoEntrada, id_contato.get(cbxContato.getSelectedIndex() - 1));
            
            if(Confirmacao.compare(agendamentoSaida)){
                JOptionPane.showMessageDialog(null, "Erro ao editar Agendamento", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Agendamento editado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }
          
            dispose();
            v.dispose();
            this.viewAgendamentoListarBuscar = new ViewAgendamentoListarBuscar(editar, excluir, usuario);
            this.viewAgendamentoListarBuscar.setVisible(true);

        } catch (ParseException ex) {
            Logger.getLogger(ViewAgendamentoEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btAtualizarAgendamentoActionPerformed

   
    private void btLimparFormAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormAgendamentoActionPerformed
    
       
        inputData.setText("");
        formataCampoData();
        inputHorario.setText("");
        formataCampoHor├írio();
        inputDescricao.setText("");
        cbxContato.setSelectedIndex(0);
        inputConteudo.setText("");

    }//GEN-LAST:event_btLimparFormAgendamentoActionPerformed

    private void inputIdContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdContatoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.viewAgendamentoListarBuscar = new ViewAgendamentoListarBuscar(editar, excluir, usuario);
        this.viewAgendamentoListarBuscar.setVisible(true);
        v.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        v = new ViewAgendamentoListarBuscar(editar, excluir, usuario);
        v.setVisible(true);
        v.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formataCampoData(){
        try {
            MaskFormatter dataFormatada = new MaskFormatter("##-##-####");
            dataFormatada.install(inputData);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo de texto." , "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void formataCampoHor├írio(){
        try {
        
            MaskFormatter horaFormatada = new MaskFormatter("##:##");
            horaFormatada.install(inputHorario);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo de texto." , "ERRO", JOptionPane.ERROR);
        }
    }
   
    private void camposEditar(){
        int row = tabela.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
        inputId.setText(String.valueOf(model.getValueAt(row, 0)));
        inputId.setEditable(false);
        inputDescricao.setText(String.valueOf(model.getValueAt(row, 1)));
        inputConteudo.setText(String.valueOf(model.getValueAt(row, 2)));
        inputData.setText(String.valueOf(model.getValueAt(row, 3)));
        inputHorario.setText(String.valueOf(model.getValueAt(row, 4)));
        inputIdContato.setText(String.valueOf(model.getValueAt(row, 5)));
        inputIdContato.setVisible(false);
        inputIdContato.setEditable(false);
        
        contatoComboBox(model, row);
        
    }
    
    private void contatoComboBox(DefaultTableModel model, int row){
        try {
            ControllerContato controllerContato = new ControllerContato();
            
            BeanContato contato = new BeanContato(usuario);
            List<BeanContato> contatos = controllerContato.listarContatos(contato, "Todos");
            
            cbxContato.addItem("Selecione");
            
            
            for(BeanContato bc : contatos){
                id_contato.add(bc.getId());
                cbxContato.addItem(bc.getNome());
            }
            
            for(int i = 0; i < cbxContato.getItemCount(); i++){
                if(model.getValueAt(row, 5) == id_contato.get(i)){
                    cbxContato.setSelectedIndex(i + 1);
                    break;
                }
            }     
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarAgendamento;
    private javax.swing.JButton btLimparFormAgendamento;
    private javax.swing.JComboBox<String> cbxContato;
    private javax.swing.JTextArea inputConteudo;
    private javax.swing.JFormattedTextField inputData;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JFormattedTextField inputHorario;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputIdContato;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelContatoAtualizar;
    private javax.swing.JLabel labelDataAtualizar;
    private javax.swing.JLabel labelDescricaoAtualizar;
    private javax.swing.JLabel labelHoraAtualizar;
    private javax.swing.JLabel labelId;
    // End of variables declaration//GEN-END:variables
}
