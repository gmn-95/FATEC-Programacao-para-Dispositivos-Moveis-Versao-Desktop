package agenda.view.enderecoContato;

import agenda.controller.ControllerEnderecoContato;
import agenda.model.bean.BeanContato;
import agenda.model.bean.BeanEndereco;
import agenda.model.bean.BeanEnderecoContato;
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
public class ViewEnderecoContatoListarBuscar extends javax.swing.JFrame {

    private boolean editar;
    private boolean excluir;
    private boolean buscar;
    private BeanUsuario usuario;
    
    public ViewEnderecoContatoListarBuscar() {
        initComponents();
    }
    
    public ViewEnderecoContatoListarBuscar(boolean buscar, BeanUsuario usuario) {
        setResizable(false);
        
        this.buscar = buscar;
        this.usuario = usuario;
        
        initComponents();
        
        tableListaEnderecoContato.getColumnModel().getColumn(10).setMinWidth(0);
        tableListaEnderecoContato.getColumnModel().getColumn(11).setMaxWidth(0);
        
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }

    public ViewEnderecoContatoListarBuscar(boolean editar, boolean excluir, BeanUsuario usuario) {
        setResizable(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public ViewEnderecoContatoListarBuscar(boolean buscar) {
        setResizable(false);
        
        this.buscar = buscar;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public void listarTodos(BeanEnderecoContato enderecoContato) throws ParseException{
        
        ControllerEnderecoContato controllerEnderecoContato = new ControllerEnderecoContato();
        List<BeanEnderecoContato> enderecoContatos = controllerEnderecoContato.listarEnderecoContato(enderecoContato, "Todos");
        montarTabela(enderecoContatos);
    }
    
    private void montarTabela(List<BeanEnderecoContato> beanEnderecoContatos){
        DefaultTableModel model = (DefaultTableModel) tableListaEnderecoContato.getModel();
        model.setNumRows(0);

        if(beanEnderecoContatos != null || !beanEnderecoContatos.isEmpty()){
            for(BeanEnderecoContato enderecoContato : beanEnderecoContatos){
                model.addRow(new Object[]{
                    enderecoContato.getId(),
                    enderecoContato.getContato().getNome(),
                    enderecoContato.getEndereco().getBairro(),
                    enderecoContato.getEndereco().getCidade(),
                    enderecoContato.getEndereco().getEstado(),
                    enderecoContato.getEndereco().getCep(),
                    enderecoContato.getEndereco().getLogradouro(),
                    enderecoContato.getEndereco().getNumero(),
                    enderecoContato.getEndereco().getComplemento(),
                    enderecoContato.getObs(),
                    enderecoContato.getContato().getId(),
                    enderecoContato.getEndereco().getId()
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
            cbxTipoListagem.addItem("Id endereço de contato");
            
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
        tableListaEnderecoContato = new javax.swing.JTable();
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        tableListaEnderecoContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Contato", "Bairro", "Cidade", "Estado", "Cep", "Logradouro", "Número", "Complemento", "Obs", "id contato", "id endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaEnderecoContato);
        if (tableListaEnderecoContato.getColumnModel().getColumnCount() > 0) {
            tableListaEnderecoContato.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableListaEnderecoContato.getColumnModel().getColumn(10).setResizable(false);
            tableListaEnderecoContato.getColumnModel().getColumn(11).setResizable(false);
        }

        cbxTipoListagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Id endereco", "Id contato", "Obs" }));
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
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxTipoListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
        if(tableListaEnderecoContato.getSelectedRow() >= 0){
            
            ViewEnderecoContatoEditar usuarioEditar = new ViewEnderecoContatoEditar(this, editar, excluir, tableListaEnderecoContato, usuario);
            usuarioEditar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Endereço do Contato Selecionado" , "Selecione um Endereço de Contato!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

   private void verificarLista(List<BeanEnderecoContato> enderecoContatos){
       if(!enderecoContatos.isEmpty() || enderecoContatos != null || enderecoContatos.get(0).getId() != null){
           montarTabela(enderecoContatos);
       }
       else{
           JOptionPane.showMessageDialog(null, "Endereço do Contato Não Encontrado!", "Não Encontrado!", JOptionPane.WARNING_MESSAGE);
       }
   }
    
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        if((inputPesquisa.getText().equals("") || inputPesquisa == null) && cbxTipoListagem.getSelectedIndex() != 0){
            JOptionPane.showMessageDialog(null, "Insira o valor a ser pesquisado!");
        }
        else{
            BeanEnderecoContato enderecoContatoEntrada = new BeanEnderecoContato(usuario);
            String tipoPesquisa = cbxTipoListagem.getSelectedItem().toString();

            ControllerEnderecoContato controllerEnderecoContato = new ControllerEnderecoContato();
            List<BeanEnderecoContato> enderecoContatos = new ArrayList<>();
        
            try {
                if(cbxTipoListagem.getItemCount() > 2 ){
                    switch(cbxTipoListagem.getSelectedIndex()){
                    case 0:
                       listarTodos(enderecoContatoEntrada);
                       break;
                    case 1:
                        enderecoContatoEntrada.setEndereco(new BeanEndereco(Long.parseLong(inputPesquisa.getText())));  
                        break;
                    case 2:
                        enderecoContatoEntrada.setContato(new BeanContato(Long.parseLong(inputPesquisa.getText())));
                        break; 
                    case 3:
                        enderecoContatoEntrada.setObs(inputPesquisa.getText());
                        break;
                    default:
                        listarTodos(enderecoContatoEntrada);
                        break;
                    }
                    enderecoContatos = controllerEnderecoContato.listarEnderecoContato(enderecoContatoEntrada, tipoPesquisa);
                    verificarLista(enderecoContatos);
                } else {

                    enderecoContatoEntrada.setId(Long.valueOf(inputPesquisa.getText()));
                    BeanEnderecoContato enderecoContatoSaida = controllerEnderecoContato.buscarEnderecoContato(enderecoContatoEntrada);
                    enderecoContatos.add(enderecoContatoSaida);
                    verificarLista(enderecoContatos);
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
               BeanEnderecoContato enderecoContato = new BeanEnderecoContato(usuario);
                listarTodos(enderecoContato);
            }
        } catch (ParseException ex) {
            Logger.getLogger(ViewEnderecoContatoListarBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tableListaEnderecoContato.getSelectedRow() >= 0){
            ViewEnderecoContatoExcluir usuarioExcluir = new ViewEnderecoContatoExcluir(this, editar, excluir, tableListaEnderecoContato, usuario);
            usuarioExcluir.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Endereco de Contato Selecionado" , "Selecione um Endereco de Contato!", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTable tableListaEnderecoContato;
    // End of variables declaration//GEN-END:variables
}
