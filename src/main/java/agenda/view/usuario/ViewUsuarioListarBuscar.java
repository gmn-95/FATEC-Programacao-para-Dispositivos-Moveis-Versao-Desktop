package agenda.view.usuario;

import agenda.controller.ControllerUsuario;
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
public class ViewUsuarioListarBuscar extends javax.swing.JFrame {

    private boolean editar;
    private boolean excluir;
    private boolean buscar;
    private BeanUsuario usuario;
    
    public ViewUsuarioListarBuscar() {
        initComponents();
    }
    
    public ViewUsuarioListarBuscar(boolean buscar, BeanUsuario usuario) {
        setResizable(false);
        
        this.buscar = buscar;
        this.usuario = usuario;
        
        initComponents();
        
        tableListaUsuarios.getColumnModel().getColumn(4).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(4).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(5).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(5).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(6).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(6).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(7).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(7).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(8).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(8).setMaxWidth(0);
        
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }

    public ViewUsuarioListarBuscar(boolean editar, boolean excluir, BeanUsuario usuario) {
        setResizable(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.usuario = usuario;
        
        initComponents();
        
        tableListaUsuarios.getColumnModel().getColumn(4).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(4).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(5).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(5).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(6).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(6).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(7).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(7).setMaxWidth(0);
        
        tableListaUsuarios.getColumnModel().getColumn(8).setMinWidth(0);
        tableListaUsuarios.getColumnModel().getColumn(8).setMaxWidth(0);
        
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public ViewUsuarioListarBuscar(boolean buscar) {
        setResizable(false);
        
        this.buscar = buscar;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public void listarTodos(BeanUsuario beanUsuario) throws ParseException{
        
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        List<BeanUsuario> usuarios = controllerUsuario.listarUsuario(beanUsuario, "Todos");
        montarTabela(usuarios);
    }
    
    private void montarTabela(List<BeanUsuario> usuarios){
        DefaultTableModel model = (DefaultTableModel) tableListaUsuarios.getModel();
        model.setNumRows(0);

        if(usuarios != null){
            for(BeanUsuario beanUsuario : usuarios){
                model.addRow(new Object[]{
                    beanUsuario.getId_usuario(),
                    beanUsuario.getId(),
                    beanUsuario.getNome(),
                    beanUsuario.getLogin(),
                    beanUsuario.getSenha(),
                    beanUsuario.isCriar_novo_usuario(),
                    beanUsuario.isEditar_usuario(),
                    beanUsuario.isExcluir_usuario(),
                    beanUsuario.isListar_usuario()
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
            cbxTipoListagem.addItem("Id Usuário");
            
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
        tableListaUsuarios = new javax.swing.JTable();
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

        tableListaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Usuario", "Id Pessoa", "Nome", "Login", "Senha", "pode criar", "pode editar", "pode excluir", "pode listar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaUsuarios);
        if (tableListaUsuarios.getColumnModel().getColumnCount() > 0) {
            tableListaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tableListaUsuarios.getColumnModel().getColumn(4).setResizable(false);
            tableListaUsuarios.getColumnModel().getColumn(5).setResizable(false);
            tableListaUsuarios.getColumnModel().getColumn(6).setResizable(false);
            tableListaUsuarios.getColumnModel().getColumn(7).setResizable(false);
            tableListaUsuarios.getColumnModel().getColumn(8).setResizable(false);
        }

        cbxTipoListagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Login", "Nome" }));
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
        if(tableListaUsuarios.getSelectedRow() >= 0){
            
            ViewUsuarioEditar usuarioEditar = new ViewUsuarioEditar(this, editar, excluir, tableListaUsuarios, usuario);
            usuarioEditar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Usuário Selecionado" , "Selecione um Usuário!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

   private void verificarLista(List<BeanUsuario> usuarios){
       if(!usuarios.isEmpty() || usuarios != null || usuarios.get(0).getId() != null){
           montarTabela(usuarios);
       }
       else{
           JOptionPane.showMessageDialog(null, "Usuário Não Encontrado!", "Não Encontrado!", JOptionPane.WARNING_MESSAGE);
       }
   }
    
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        if((inputPesquisa.getText().equals("") || inputPesquisa == null) && cbxTipoListagem.getSelectedIndex() != 0){
            JOptionPane.showMessageDialog(null, "Insira o valor a ser pesquisado!");
        }
        else{
            BeanUsuario usuarioEntrada = new BeanUsuario();
            String tipoPesquisa = cbxTipoListagem.getSelectedItem().toString();

            ControllerUsuario controllerUsuario = new ControllerUsuario();
            List<BeanUsuario> usuarios = new ArrayList<>();
        
            try {
                if(cbxTipoListagem.getItemCount() > 2 ){
                    switch(cbxTipoListagem.getSelectedIndex()){
                    case 0:
                       listarTodos(usuarioEntrada);
                       break;
                    case 1:
                        usuarioEntrada.setLogin(inputPesquisa.getText());  
                        break;
                    case 2:
                        usuarioEntrada.setNome(inputPesquisa.getText());
                        break; 
                    default:
                        listarTodos(usuarioEntrada);
                        break;
                    }
                    usuarios = controllerUsuario.listarUsuario(usuarioEntrada, tipoPesquisa);
                    verificarLista(usuarios);
                } else {

                    usuarioEntrada.setId_usuario(Long.valueOf(inputPesquisa.getText()));
                    BeanUsuario usuarioSaida = controllerUsuario.buscarUsuario(usuarioEntrada);
                    usuarios.add(usuarioSaida);
                    verificarLista(usuarios);
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
                listarTodos(null);
            }
        } catch (ParseException ex) {
            Logger.getLogger(ViewUsuarioListarBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tableListaUsuarios.getSelectedRow() >= 0){
            ViewUsuarioExcluir usuarioExcluir = new ViewUsuarioExcluir(this, editar, excluir, tableListaUsuarios, usuario);
            usuarioExcluir.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Agendamento Selecionado" , "Selecione um agendamento!", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTable tableListaUsuarios;
    // End of variables declaration//GEN-END:variables
}
