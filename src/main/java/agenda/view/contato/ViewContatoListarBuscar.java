package agenda.view.contato;

import agenda.controller.ControllerContato;
import agenda.model.bean.BeanContato;
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
public class ViewContatoListarBuscar extends javax.swing.JFrame {

    private boolean editar;
    private boolean excluir;
    private boolean buscar;
    private BeanUsuario usuario;
    
    public ViewContatoListarBuscar() {
        initComponents();
    }
    
    public ViewContatoListarBuscar(boolean buscar, BeanUsuario usuario) {
        setResizable(false);
        
        this.buscar = buscar;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }

    public ViewContatoListarBuscar(boolean editar, boolean excluir, BeanUsuario usuario) {
        setResizable(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public ViewContatoListarBuscar(boolean editar, boolean excluir, boolean buscar, BeanUsuario usuario) {
        setResizable(false);
        
        this.editar = editar;
        this.excluir = excluir;
        this.buscar = buscar;
        this.usuario = usuario;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public ViewContatoListarBuscar(boolean buscar) {
        setResizable(false);
        
        this.buscar = buscar;
        
        initComponents();
        verificaOpção();
        setLocationRelativeTo(null);
        formatarInputDePequisa();
    }
    
    public void listarTodos(BeanContato contato) throws ParseException{
        
        ControllerContato controllerContato = new ControllerContato();
        List<BeanContato> contatos = controllerContato.listarContatos(contato, "Todos");
        montarTabela(contatos);
    }
    
    private void montarTabela(List<BeanContato> contatos){
        DefaultTableModel model = (DefaultTableModel) tableListaContatos.getModel();
        model.setNumRows(0);

        if(contatos != null || !contatos.isEmpty()){
            for(BeanContato contato : contatos){
                model.addRow(new Object[]{
                    contato.getId(),
                    contato.getNome(),
                    contato.getTelefone_fixo(),
                    contato.getCelular(),
                    contato.getEmail(),
                    contato.getObs()
                });
            }
        }
    }
    
    private void verificaOpção(){

        btExcluir.setVisible(excluir);
        btEditar.setVisible(editar);
        
        if(buscar){
   
            cbxTipoListagem.removeAllItems();
            cbxTipoListagem.addItem("Id Contato");
            
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
        tableListaContatos = new javax.swing.JTable();
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

        tableListaContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Celular", "Email", "Obs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableListaContatos);
        if (tableListaContatos.getColumnModel().getColumnCount() > 0) {
            tableListaContatos.getColumnModel().getColumn(0).setResizable(false);
            tableListaContatos.getColumnModel().getColumn(3).setResizable(false);
            tableListaContatos.getColumnModel().getColumn(4).setResizable(false);
            tableListaContatos.getColumnModel().getColumn(5).setResizable(false);
        }

        cbxTipoListagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "Telefone", "Celular", "Email", "Obs" }));
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
        if(tableListaContatos.getSelectedRow() >= 0){
            
            ViewContatoEditar usuarioEditar = new ViewContatoEditar(this, editar, excluir, tableListaContatos, usuario);
            usuarioEditar.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Contato Selecionado" , "Selecione um Contato!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

   private void verificarLista(List<BeanContato> contatos){
       if(!contatos.isEmpty() || contatos != null || contatos.get(0).getId() != null){
           montarTabela(contatos);
       }
       else{
           JOptionPane.showMessageDialog(null, "Contato Não Encontrado!", "Não Encontrado!", JOptionPane.WARNING_MESSAGE);
       }
   }
    
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        
        if((inputPesquisa.getText().equals("") || inputPesquisa == null) && cbxTipoListagem.getSelectedIndex() != 0){
            JOptionPane.showMessageDialog(null, "Insira o valor a ser pesquisado!");
        }
        else{
            BeanContato contatoEntrada = new BeanContato(usuario);
            String tipoPesquisa = cbxTipoListagem.getSelectedItem().toString();

            ControllerContato controllerContato = new ControllerContato();
            List<BeanContato> contatos = new ArrayList<>();
        
            try {
                if(cbxTipoListagem.getItemCount() > 2 ){
                    switch(cbxTipoListagem.getSelectedIndex()){
                    case 0:
                       listarTodos(contatoEntrada);
                       break;
                    case 1:
                        contatoEntrada.setNome(inputPesquisa.getText());  
                        break;
                    case 2:
                        contatoEntrada.setTelefone_fixo(inputPesquisa.getText());
                        break; 
                    case 3:
                        contatoEntrada.setCelular(inputPesquisa.getText());
                        break; 
                    case 4:
                        contatoEntrada.setEmail(inputPesquisa.getText());
                        break;
                    case 5:
                        contatoEntrada.setObs(inputPesquisa.getText());
                        break; 
                    default:
                        listarTodos(contatoEntrada);
                        break;
                    }
                    contatos = controllerContato.listarContatos(contatoEntrada, tipoPesquisa);
                    verificarLista(contatos);
                } else {

                    contatoEntrada.setId(Long.valueOf(inputPesquisa.getText()));
                    BeanContato contatoSaida = controllerContato.buscarContato(contatoEntrada);
                    contatos.add(contatoSaida);
                    verificarLista(contatos);
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
                BeanContato contato = new BeanContato(usuario);
                listarTodos(contato);
            }
        } catch (ParseException ex) {
            Logger.getLogger(ViewContatoListarBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tableListaContatos.getSelectedRow() >= 0){
            ViewContatoExcluir usuarioExcluir = new ViewContatoExcluir(this, editar, excluir, tableListaContatos, usuario);
            usuarioExcluir.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nenhum Contato Selecionado" , "Selecione um Contato!", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTable tableListaContatos;
    // End of variables declaration//GEN-END:variables
}
