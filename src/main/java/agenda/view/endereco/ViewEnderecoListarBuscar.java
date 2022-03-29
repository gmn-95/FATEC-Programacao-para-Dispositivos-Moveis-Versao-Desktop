/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.view.endereco;

import agenda.view.endereco.*;
import agenda.controller.ControllerEndereco;
import agenda.model.bean.BeanEndereco;
import agenda.model.bean.BeanUsuario;
import java.text.ParseException;
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
public class ViewEnderecoListarBuscar extends javax.swing.JFrame {

    private boolean editar;
    private boolean excluir;
    private boolean buscar;
    private BeanUsuario usuario;
    
    public ViewEnderecoListarBuscar() {
        initComponents();
    }
 
    
    public ViewEnderecoListarBuscar(boolean buscar, BeanUsuario usuario) {
        setResizable(false);
        
        this.buscar = buscar;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }

    public ViewEnderecoListarBuscar(boolean editar, boolean excluir, BeanUsuario usuario) {
        setResizable(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public ViewEnderecoListarBuscar(boolean buscar) {
        setResizable(false);
        
        this.buscar = buscar;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public void listarTodos(BeanEndereco endereco) throws ParseException{
        
        ControllerEndereco controllerEndereco = new ControllerEndereco();
        List<BeanEndereco> enderecos = controllerEndereco.listarEnderecos(endereco, "Todos");
        montarTabela(enderecos);
    }
    
    private void montarTabela(List<BeanEndereco> enderecos){
        DefaultTableModel model = (DefaultTableModel) tableListaEnderecos.getModel();
        model.setNumRows(0);

        if(enderecos != null || !enderecos.isEmpty()){
            for(BeanEndereco endereco : enderecos){
                model.addRow(new Object[]{
                    endereco.getId(),
                    endereco.getBairro(),
                    endereco.getCidade(),
                    endereco.getEstado(),
                    endereco.getCep(),
                    endereco.getLogradouro(),
                    endereco.getNumero(),
                    endereco.getComplemento()
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
            cbxTipoListagem.addItem("Id Endereco");
            
        }
    }
    
    private void formatarInputDePequisa(){
        if(cbxTipoListagem.getSelectedIndex() == 0 && cbxTipoListagem.getItemCount() > 1){
            inputPesquisa.setEditable(false);
        }
        else{
            inputPesquisa.setEditable(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListaEnderecos = new javax.swing.JTable();
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

        tableListaEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Bairro", "Cidade", "Estado", "Cep", "Logradouro", "Número", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaEnderecos);
        if (tableListaEnderecos.getColumnModel().getColumnCount() > 0) {
            tableListaEnderecos.getColumnModel().getColumn(0).setResizable(false);
            tableListaEnderecos.getColumnModel().getColumn(3).setResizable(false);
        }

        cbxTipoListagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Bairro", "Cidade", "Estado", "Cep", "Logradouro", "Numero", "Complemento" }));
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
        if(tableListaEnderecos.getSelectedRow() >= 0){
            
            ViewEnderecoEditar usuarioEditar = new ViewEnderecoEditar(this, editar, excluir, tableListaEnderecos, usuario);
            usuarioEditar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Endereco Selecionado" , "Selecione um Endereco!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

   private void verificarLista(List<BeanEndereco> enderecos){
       if(!enderecos.isEmpty() || enderecos != null || enderecos.get(0).getId() != null){
           montarTabela(enderecos);
       }
       else{
           JOptionPane.showMessageDialog(null, "Endereco Não Encontrado!", "Não Encontrado!", JOptionPane.WARNING_MESSAGE);
       }
   }
    
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        if((inputPesquisa.getText().equals("") || inputPesquisa == null) && cbxTipoListagem.getSelectedIndex() != 0){
            JOptionPane.showMessageDialog(null, "Insira o valor a ser pesquisado!");
        }
        else{
            BeanEndereco enderecoEntrada = new BeanEndereco(usuario);
            String tipoPesquisa = cbxTipoListagem.getSelectedItem().toString();

            ControllerEndereco controllerEndereco = new ControllerEndereco();
            List<BeanEndereco> enderecos = new ArrayList<>();
        
            try {
                if(cbxTipoListagem.getItemCount() > 2 ){
                    switch(cbxTipoListagem.getSelectedIndex()){
                    case 0:
                       listarTodos(enderecoEntrada);
                       break;
                    case 1:
                        enderecoEntrada.setBairro(inputPesquisa.getText());  
                        break;
                    case 2:
                        enderecoEntrada.setCidade(inputPesquisa.getText());
                        break; 
                    case 3:
                        enderecoEntrada.setEstado(inputPesquisa.getText());
                        break; 
                    case 4:
                        enderecoEntrada.setCep(inputPesquisa.getText());
                        break;
                    case 5:
                        enderecoEntrada.setLogradouro(inputPesquisa.getText());
                        break;
                    case 6:
                        enderecoEntrada.setNumero(inputPesquisa.getText());
                        break; 
                    case 7:
                        enderecoEntrada.setComplemento(inputPesquisa.getText());
                        break; 
                    default:
                        listarTodos(enderecoEntrada);
                        break;
                    }
                    enderecos = controllerEndereco.listarEnderecos(enderecoEntrada, tipoPesquisa);
                    verificarLista(enderecos);
                } else {

                    enderecoEntrada.setId(Long.valueOf(inputPesquisa.getText()));
                    BeanEndereco enderecoSaida = controllerEndereco.buscarEndereco(enderecoEntrada);
                    enderecos.add(enderecoSaida);
                    verificarLista(enderecos);
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
                BeanEndereco endereco = new BeanEndereco(usuario);
                listarTodos(endereco);
            }
        } catch (ParseException ex) {
            Logger.getLogger(ViewEnderecoListarBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tableListaEnderecos.getSelectedRow() >= 0){
            ViewEnderecoExcluir usuarioExcluir = new ViewEnderecoExcluir(this, editar, excluir, tableListaEnderecos, usuario);
            usuarioExcluir.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Endereco Selecionado" , "Selecione um Endereco!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox<String> cbxTipoListagem;
    private javax.swing.JTextField inputPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListaEnderecos;
    // End of variables declaration//GEN-END:variables
}
