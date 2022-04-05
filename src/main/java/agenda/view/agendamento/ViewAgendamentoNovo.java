package agenda.view.agendamento;

import agenda.controller.ControllerAgendamento;
import agenda.controller.ControllerContato;
import agenda.model.bean.BeanAgendamento;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import agenda.util.Confirmacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gustavo
 */
public class ViewAgendamentoNovo extends javax.swing.JFrame {

    private BeanUsuario usuario;
    
    public ViewAgendamentoNovo(BeanUsuario usuario) {
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
        formataCampoData();
        formataCampoHorário();
        contatoComboBox();
        
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
        labelData = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelConteudo = new javax.swing.JLabel();
        labelContato = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputConteudo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btCriarAgendamento = new javax.swing.JButton();
        btLimparFormAgendamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        inputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataActionPerformed(evt);
            }
        });

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

        labelData.setText("Data");

        labelHora.setText("Horário");

        labelDescricao.setText("Descrição");

        labelConteudo.setText("Conteúdo");

        labelContato.setText("Contato");

        inputConteudo.setColumns(20);
        inputConteudo.setRows(5);
        jScrollPane1.setViewportView(inputConteudo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelData)
                                .addComponent(labelHora)
                                .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(labelContato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxContato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputDescricao)
                            .addComponent(inputData)
                            .addComponent(inputHorario)))
                    .addComponent(labelConteudo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHora))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescricao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContato))
                .addGap(18, 18, 18)
                .addComponent(labelConteudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCriarAgendamento.setText("Criar");
        btCriarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarAgendamentoActionPerformed(evt);
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
                .addGap(33, 33, 33)
                .addComponent(btCriarAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btLimparFormAgendamento)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCriarAgendamento)
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
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataActionPerformed
    }//GEN-LAST:event_inputDataActionPerformed

    private void cbxContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxContatoActionPerformed
    }//GEN-LAST:event_cbxContatoActionPerformed

    private void limparCamposTelaCriar(){
       
        inputData.setText("");
        formataCampoData();
        inputHorario.setText("");
        formataCampoHorário();
        inputDescricao.setText("");
        cbxContato.setSelectedIndex(0);
        inputConteudo.setText("");

    }
    
    private void btCriarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarAgendamentoActionPerformed
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        
        try {
            Date data = dataFormat.parse(inputData.getText());
            Date hora = horaFormat.parse(inputHorario.getText());
            
            BeanContato contato = new BeanContato(id_contato.get(cbxContato.getSelectedIndex() - 1), usuario);
            System.out.println(contato.getId());
            String descricao = inputDescricao.getText();
            String conteudo = inputConteudo.getText();

            BeanAgendamento agendamentoEntrada = new BeanAgendamento(
                contato, usuario, data, hora, 
                    descricao, conteudo);

            ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
            BeanAgendamento agendamentoSaida = controllerAgendamento.criarAgendamento(agendamentoEntrada);

            if(Confirmacao.compare(agendamentoSaida)){
            JOptionPane.showMessageDialog(null, "Erro ao criar Agendamento", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Agendamento criado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (ParseException ex) {
            Logger.getLogger(ViewAgendamentoNovo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        limparCamposTelaCriar();
        
    }//GEN-LAST:event_btCriarAgendamentoActionPerformed

    private void btLimparFormAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormAgendamentoActionPerformed
        limparCamposTelaCriar();
    }//GEN-LAST:event_btLimparFormAgendamentoActionPerformed

    private void inputHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHorarioActionPerformed
    }//GEN-LAST:event_inputHorarioActionPerformed

    private void contatoComboBox(){
        try {
            
            ControllerContato controllerContato = new ControllerContato();
            BeanContato contato = new BeanContato(usuario);
            List<BeanContato> contatos = controllerContato.listarContatos(contato, "Todos");
            
            cbxContato.addItem("Selecione");
            
            for(BeanContato bc : contatos){
                id_contato.addElement(bc.getId());
                cbxContato.addItem(bc.getNome());
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void formataCampoData(){
        try {
            MaskFormatter dataFormatada = new MaskFormatter("##-##-####");
            dataFormatada.install(inputData);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo de texto." , "ERRO", JOptionPane.ERROR);
        }
    }
    
    private void formataCampoHorário(){
        try {
        
            MaskFormatter horaFormatada = new MaskFormatter("##:##");
            horaFormatada.install(inputHorario);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao formar campo de texto." , "ERRO", JOptionPane.ERROR);
        }
    }
    
    
    private final Vector<Long> id_contato = new Vector<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriarAgendamento;
    private javax.swing.JButton btLimparFormAgendamento;
    private javax.swing.JComboBox<String> cbxContato;
    private javax.swing.JTextArea inputConteudo;
    private javax.swing.JFormattedTextField inputData;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JFormattedTextField inputHorario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelContato;
    private javax.swing.JLabel labelConteudo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelHora;
    // End of variables declaration//GEN-END:variables
}
