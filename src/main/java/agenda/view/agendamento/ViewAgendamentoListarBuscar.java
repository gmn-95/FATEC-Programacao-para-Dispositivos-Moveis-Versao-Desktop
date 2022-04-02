package agenda.view.agendamento;

import agenda.controller.ControllerAgendamento;
import agenda.model.bean.BeanAgendamento;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanUsuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gustavo
 */
public class ViewAgendamentoListarBuscar extends javax.swing.JFrame {

    private boolean editar;
    private boolean excluir;
    private boolean buscar;
    private BeanUsuario usuario;
    private SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public ViewAgendamentoListarBuscar() {
        initComponents();
    }

    public ViewAgendamentoListarBuscar(boolean editar, boolean excluir, BeanUsuario usuario) {
        setResizable(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public ViewAgendamentoListarBuscar(boolean buscar, BeanUsuario usuario) {
        setResizable(false);
        
        this.usuario = usuario;
        this.buscar = buscar;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public void listarTodos(BeanUsuario usuario) throws ParseException{
        
        BeanAgendamento agendamentoEntrada = new BeanAgendamento(usuario);
        ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
        List<BeanAgendamento> agendamentos = controllerAgendamento.listaAgendamentos(agendamentoEntrada, "Todos");
        montarTabela(agendamentos);
    }
    
    private void montarTabela(List<BeanAgendamento> agendamentos){
        DefaultTableModel model = (DefaultTableModel) tableListaAgendamendo.getModel();
        model.setNumRows(0);

        if(agendamentos != null){
            for(BeanAgendamento agendamento : agendamentos){
                model.addRow(new Object[]{
                    agendamento.getId(),
                    agendamento.getDescricao(),
                    agendamento.getConteudo(),
                    dataFormat.format(agendamento.getData_agendada()),
                    horaFormat.format(agendamento.getHora_agendada()),
                    agendamento.getContato().getId(),
                    agendamento.getContato().getNome()
                });
            }
        }
    }
    
    private void verificaOpção(){
        if(editar == true && excluir != true){
            btExcluir.setVisible(false);
            btEditar.setVisible(true);
        }
        else if(editar != true && excluir == true){
            btEditar.setVisible(false);
            btExcluir.setVisible(true);
        }
        else if(editar == true && excluir == true){
            btEditar.setVisible(true);
            btExcluir.setVisible(true);
        }
        else if(buscar){
            btEditar.setVisible(true);
            btExcluir.setVisible(true);
            
            cbxTipoListagem.removeAllItems();
            cbxTipoListagem.addItem("Id Agendamento");
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaAgendamendo = new javax.swing.JTable();
        inputPesquisa = new javax.swing.JTextField();
        cbxTipoListagem = new javax.swing.JComboBox<>();
        btPesquisar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        tableListaAgendamendo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Descrição", "Conteúdo", "Data agendada", "Hora agendada", "Id contato", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaAgendamendo);
        if (tableListaAgendamendo.getColumnModel().getColumnCount() > 0) {
            tableListaAgendamendo.getColumnModel().getColumn(0).setResizable(false);
        }

        cbxTipoListagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Hora", "Data", "Descricao", "Conteudo", "Contato", "Id_contato" }));
        cbxTipoListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoListagemActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxTipoListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipoListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if(tableListaAgendamendo.getSelectedRow() >= 0){
            
            ViewAgendamentoEditar agendamentoEditar = new ViewAgendamentoEditar(this, editar, excluir, usuario, tableListaAgendamendo);
            agendamentoEditar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Agendamento Selecionado" , "Selecione um agendamento!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

   private void verificarLista(List<BeanAgendamento> agendamentos){
       if(!agendamentos.isEmpty() || agendamentos != null || agendamentos.get(0).getContato() != null){
           montarTabela(agendamentos);
       }
       else{
           JOptionPane.showMessageDialog(null, "Agendamento Não Encontrado!", "Não Encontrado!", JOptionPane.WARNING_MESSAGE);
       }
   }
    
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        if((inputPesquisa.getText().equals("") || inputPesquisa == null) && cbxTipoListagem.getSelectedIndex() != 0){
            JOptionPane.showMessageDialog(null, "Insira o valor a ser pesquisado!");
        }
        else{
            BeanAgendamento agendamentoEntrada = new BeanAgendamento(usuario);
            String tipoPesquisa = cbxTipoListagem.getSelectedItem().toString();

            ControllerAgendamento controllerAgendamento = new ControllerAgendamento();
            List<BeanAgendamento> agendamentos = new ArrayList<>();

            try {
                if(cbxTipoListagem.getItemCount() > 2 ){
                    switch(cbxTipoListagem.getSelectedIndex()){
                    case 0:
                       listarTodos(usuario);
                       break;
                    case 1:
                        agendamentoEntrada.setHora_agendada(horaFormat.parse(inputPesquisa.getText()));
                        break;

                    case 2:
                        agendamentoEntrada.setData_agendada(dataFormat.parse(inputPesquisa.getText()));
                        break;
                    case 3:
                        agendamentoEntrada.setDescricao(inputPesquisa.getText());
                        break;
                    case 4:
                        agendamentoEntrada.setConteudo(inputPesquisa.getText());
                        break;
                    case 5:
                        agendamentoEntrada.setContato(new BeanContato(inputPesquisa.getText()));
                        break;
                    case 6:
                        agendamentoEntrada.setContato(new BeanContato(Long.parseLong(inputPesquisa.getText())));  agendamentos = controllerAgendamento.listaAgendamentos(agendamentoEntrada, tipoPesquisa);
                        verificarLista(agendamentos);
                        break;
                    default:
                        listarTodos(usuario);
                        break;

                    }
                    agendamentos = controllerAgendamento.listaAgendamentos(agendamentoEntrada, tipoPesquisa);
                    verificarLista(agendamentos);
                } else {

                    agendamentoEntrada.setId(Long.valueOf(inputPesquisa.getText()));
                    BeanAgendamento agendamentoSaida = controllerAgendamento.buscarAgendamento(agendamentoEntrada);
                    agendamentos.add(agendamentoSaida);
                    verificarLista(agendamentos);
                }

            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "O valor inserido não é válido!", "Valor inválido!", JOptionPane.ERROR_MESSAGE);
                inputPesquisa.setText("");
            }
        }   
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void cbxTipoListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoListagemActionPerformed
        formatarInputDePequisa();
    }//GEN-LAST:event_cbxTipoListagemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            if(!buscar){
                listarTodos(usuario);
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(ViewAgendamentoListarBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tableListaAgendamendo.getSelectedRow() >= 0){
            ViewAgendamentoExcluir agendamentoExcluir = new ViewAgendamentoExcluir(this, editar, excluir, usuario, tableListaAgendamendo);
            agendamentoExcluir.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Agendamento Selecionado" , "Selecione um agendamento!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      
    }//GEN-LAST:event_formMouseClicked

    private void formatarInputDePequisa(){
        if(cbxTipoListagem.getSelectedIndex() == 0 && cbxTipoListagem.getItemCount() > 1){
            inputPesquisa.setEditable(false);
        }
        else{
            inputPesquisa.setEditable(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> cbxTipoListagem;
    private javax.swing.JTextField inputPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListaAgendamendo;
    // End of variables declaration//GEN-END:variables
}
