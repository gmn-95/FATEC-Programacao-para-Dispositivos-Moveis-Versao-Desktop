package agenda.view;

import agenda.view.agendamento.ViewAgendamentoNovo;
import agenda.model.bean.BeanUsuario;
import agenda.view.agendamento.ViewAgendamentoListarBuscar;
import agenda.view.contato.ViewContatoListarBuscar;
import agenda.view.contato.ViewContatoNovo;
import agenda.view.endereco.ViewEnderecoListarBuscar;
import agenda.view.endereco.ViewEnderecoNovo;
import agenda.view.enderecoContato.ViewEnderecoContatoListarBuscar;
import agenda.view.enderecoContato.ViewEnderecoContatoNovo;
import agenda.view.usuario.ViewUsuarioListarBuscar;
import agenda.view.usuario.ViewUsuarioNovo;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public final class ViewMenu extends javax.swing.JFrame {

    private BeanUsuario usuario;
    public ViewMenu(BeanUsuario usuario) {
        
        this.usuario = usuario;
        
        setTitle("Projeto Desktop P1 - Agendamento ");
        initComponents();
        
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btNovoAgendamento = new javax.swing.JButton();
        btBuscarAgendamento = new javax.swing.JButton();
        btEditarAgendamento = new javax.swing.JButton();
        btExcluirAgendamento = new javax.swing.JButton();
        btListarAgendamento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btNovoContato = new javax.swing.JButton();
        btBuscarContato = new javax.swing.JButton();
        btEditarContato = new javax.swing.JButton();
        btExcluirContato = new javax.swing.JButton();
        btListarContato = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btNovoEndereco = new javax.swing.JButton();
        btBuscarEndereco = new javax.swing.JButton();
        btEditarEndereco = new javax.swing.JButton();
        btExcluirEndereco = new javax.swing.JButton();
        btListarEndereco = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btNovoEnderecoContato = new javax.swing.JButton();
        btBuscarEnderecoContato = new javax.swing.JButton();
        btEditarEnderecoContato = new javax.swing.JButton();
        btExcluirEnderecoContato = new javax.swing.JButton();
        btListarEnderecoContato = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btNovoUsuario = new javax.swing.JButton();
        btBuscarUsuario = new javax.swing.JButton();
        btEditarUsuario = new javax.swing.JButton();
        btExcluirUsuario = new javax.swing.JButton();
        btListarUsuario = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        btNovoAgendamento.setText("Novo");
        btNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoAgendamentoActionPerformed(evt);
            }
        });

        btBuscarAgendamento.setText("Buscar");
        btBuscarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAgendamentoActionPerformed(evt);
            }
        });

        btEditarAgendamento.setText("Editar");
        btEditarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarAgendamentoActionPerformed(evt);
            }
        });

        btExcluirAgendamento.setText("Excluir");
        btExcluirAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirAgendamentoActionPerformed(evt);
            }
        });

        btListarAgendamento.setText("Listar");
        btListarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcluirAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.addTab("Agendamento", jPanel3);

        btNovoContato.setText("Novo");
        btNovoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoContatoActionPerformed(evt);
            }
        });

        btBuscarContato.setText("Buscar");
        btBuscarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarContatoActionPerformed(evt);
            }
        });

        btEditarContato.setText("Editar");
        btEditarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarContatoActionPerformed(evt);
            }
        });

        btExcluirContato.setText("Excluir");
        btExcluirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirContatoActionPerformed(evt);
            }
        });

        btListarContato.setText("Listar");
        btListarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcluirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.addTab("Contato", jPanel4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        btNovoEndereco.setText("Novo");
        btNovoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoEnderecoActionPerformed(evt);
            }
        });

        btBuscarEndereco.setText("Buscar");
        btBuscarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEnderecoActionPerformed(evt);
            }
        });

        btEditarEndereco.setText("Editar");
        btEditarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarEnderecoActionPerformed(evt);
            }
        });

        btExcluirEndereco.setText("Excluir");
        btExcluirEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEnderecoActionPerformed(evt);
            }
        });

        btListarEndereco.setText("Listar");
        btListarEndereco.setPreferredSize(new java.awt.Dimension(78, 24));
        btListarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btNovoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcluirEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(860, 860, 860))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.addTab("Endere??o", jPanel2);

        btNovoEnderecoContato.setText("Novo");
        btNovoEnderecoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoEnderecoContatoActionPerformed(evt);
            }
        });

        btBuscarEnderecoContato.setText("Buscar");
        btBuscarEnderecoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEnderecoContatoActionPerformed(evt);
            }
        });

        btEditarEnderecoContato.setText("Editar");
        btEditarEnderecoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarEnderecoContatoActionPerformed(evt);
            }
        });

        btExcluirEnderecoContato.setText("Excluir");
        btExcluirEnderecoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEnderecoContatoActionPerformed(evt);
            }
        });

        btListarEnderecoContato.setText("Listar");
        btListarEnderecoContato.setPreferredSize(new java.awt.Dimension(78, 24));
        btListarEnderecoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarEnderecoContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btNovoEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcluirEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListarEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEnderecoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        menu.addTab("Endere??o do Contato", jPanel5);

        btNovoUsuario.setText("Novo");
        btNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoUsuarioActionPerformed(evt);
            }
        });

        btBuscarUsuario.setText("Buscar");
        btBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarUsuarioActionPerformed(evt);
            }
        });

        btEditarUsuario.setText("Editar");
        btEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarUsuarioActionPerformed(evt);
            }
        });

        btExcluirUsuario.setText("Excluir");
        btExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirUsuarioActionPerformed(evt);
            }
        });

        btListarUsuario.setText("Listar");
        btListarUsuario.setPreferredSize(new java.awt.Dimension(78, 24));
        btListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        menu.addTab("Usu??rio", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked

    }//GEN-LAST:event_menuMouseClicked

    private void btListarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarEnderecoActionPerformed
        new ViewEnderecoListarBuscar(true, true, usuario).setVisible(true);
    }//GEN-LAST:event_btListarEnderecoActionPerformed

    private void btExcluirEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEnderecoActionPerformed
        new ViewEnderecoListarBuscar(false, true, usuario).setVisible(true);
    }//GEN-LAST:event_btExcluirEnderecoActionPerformed

    private void btEditarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarEnderecoActionPerformed
        new ViewEnderecoListarBuscar(true, false, usuario).setVisible(true);
    }//GEN-LAST:event_btEditarEnderecoActionPerformed

    private void btBuscarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEnderecoActionPerformed
        new ViewEnderecoListarBuscar(usuario.isEditar_usuario(), usuario.isExcluir_usuario(),usuario.isBuscar_usuario(), usuario).setVisible(true);
    }//GEN-LAST:event_btBuscarEnderecoActionPerformed

    private void btNovoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoEnderecoActionPerformed
        new ViewEnderecoNovo(usuario).setVisible(true);
    }//GEN-LAST:event_btNovoEnderecoActionPerformed

    private void btListarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarContatoActionPerformed
        new ViewContatoListarBuscar(true, true, usuario).setVisible(true);
    }//GEN-LAST:event_btListarContatoActionPerformed

    private void btExcluirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirContatoActionPerformed
        new ViewContatoListarBuscar(false, true, usuario).setVisible(true);
    }//GEN-LAST:event_btExcluirContatoActionPerformed

    private void btEditarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarContatoActionPerformed
        new ViewContatoListarBuscar(true, false, usuario).setVisible(true);
    }//GEN-LAST:event_btEditarContatoActionPerformed

    private void btBuscarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarContatoActionPerformed
        new ViewContatoListarBuscar(usuario.isEditar_usuario(), usuario.isExcluir_usuario(),usuario.isBuscar_usuario(), usuario).setVisible(true);
    }//GEN-LAST:event_btBuscarContatoActionPerformed

    private void btNovoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoContatoActionPerformed
        new ViewContatoNovo(usuario).setVisible(true);
    }//GEN-LAST:event_btNovoContatoActionPerformed

    private void btListarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarAgendamentoActionPerformed
        new ViewAgendamentoListarBuscar(true, true, usuario).setVisible(true);
    }//GEN-LAST:event_btListarAgendamentoActionPerformed

    private void btExcluirAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirAgendamentoActionPerformed
        new ViewAgendamentoListarBuscar(false, true, usuario).setVisible(true);
    }//GEN-LAST:event_btExcluirAgendamentoActionPerformed

    private void btEditarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarAgendamentoActionPerformed
        new ViewAgendamentoListarBuscar(true, false, usuario).setVisible(true);
    }//GEN-LAST:event_btEditarAgendamentoActionPerformed

    private void btBuscarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAgendamentoActionPerformed
        new ViewAgendamentoListarBuscar(usuario.isEditar_usuario(), usuario.isExcluir_usuario(),usuario.isBuscar_usuario(), usuario).setVisible(true);
    }//GEN-LAST:event_btBuscarAgendamentoActionPerformed

    private void btNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoAgendamentoActionPerformed
        new ViewAgendamentoNovo(usuario).setVisible(true);
    }//GEN-LAST:event_btNovoAgendamentoActionPerformed

    private void btNovoEnderecoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoEnderecoContatoActionPerformed
        new ViewEnderecoContatoNovo(usuario).setVisible(true);
    }//GEN-LAST:event_btNovoEnderecoContatoActionPerformed

    private void btBuscarEnderecoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEnderecoContatoActionPerformed
        new ViewEnderecoContatoListarBuscar(usuario.isEditar_usuario(), usuario.isExcluir_usuario(),usuario.isBuscar_usuario(), usuario).setVisible(true);
    }//GEN-LAST:event_btBuscarEnderecoContatoActionPerformed

    private void btEditarEnderecoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarEnderecoContatoActionPerformed
        new ViewEnderecoContatoListarBuscar(true, false, usuario).setVisible(true);
    }//GEN-LAST:event_btEditarEnderecoContatoActionPerformed

    private void btExcluirEnderecoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEnderecoContatoActionPerformed
        new ViewEnderecoContatoListarBuscar(false, true, usuario).setVisible(true);
    }//GEN-LAST:event_btExcluirEnderecoContatoActionPerformed

    private void btListarEnderecoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarEnderecoContatoActionPerformed
        new ViewEnderecoContatoListarBuscar(true, true, usuario).setVisible(true);
    }//GEN-LAST:event_btListarEnderecoContatoActionPerformed

    private void btNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoUsuarioActionPerformed
        if(!usuario.isCriar_novo_usuario()){
            JOptionPane.showMessageDialog(null, "Voc?? N??O tem permiss??o para criar um novo usu??rio!", "A????O N??O PERMITIDA!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            new ViewUsuarioNovo(usuario).setVisible(true);
        }
    }//GEN-LAST:event_btNovoUsuarioActionPerformed

    private void btBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarUsuarioActionPerformed
        if(!usuario.isBuscar_usuario()){
            JOptionPane.showMessageDialog(null, "Voc?? N??O tem permiss??o para buscar um usu??rio!", "A????O N??O PERMITIDA!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            new ViewUsuarioListarBuscar(usuario.isEditar_usuario(), usuario.isExcluir_usuario(),usuario.isBuscar_usuario(), usuario).setVisible(true);
        }
    }//GEN-LAST:event_btBuscarUsuarioActionPerformed

    private void btEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarUsuarioActionPerformed
        if(!usuario.isEditar_usuario()){
            JOptionPane.showMessageDialog(null, "Voc?? N??O tem permiss??o para editar um usu??rio!", "A????O N??O PERMITIDA!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            new ViewUsuarioListarBuscar(true, false, usuario).setVisible(true);
        }
    }//GEN-LAST:event_btEditarUsuarioActionPerformed

    private void btExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirUsuarioActionPerformed
        if(!usuario.isExcluir_usuario()){
            JOptionPane.showMessageDialog(null, "Voc?? N??O tem permiss??o para excluir um usu??rio!", "A????O N??O PERMITIDA!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            new ViewUsuarioListarBuscar(false, true, usuario).setVisible(true);
        }
    }//GEN-LAST:event_btExcluirUsuarioActionPerformed

    private void btListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarUsuarioActionPerformed
        if(!usuario.isListar_usuario()){
            JOptionPane.showMessageDialog(null, "Voc?? N??O tem permiss??o para listar usu??rios!", "A????O N??O PERMITIDA!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            new ViewUsuarioListarBuscar(usuario.isEditar_usuario(), usuario.isExcluir_usuario(), usuario).setVisible(true);
        }
    }//GEN-LAST:event_btListarUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
        usuario = new BeanUsuario();
        new ViewLogin().setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarAgendamento;
    private javax.swing.JButton btBuscarContato;
    private javax.swing.JButton btBuscarEndereco;
    private javax.swing.JButton btBuscarEnderecoContato;
    private javax.swing.JButton btBuscarUsuario;
    private javax.swing.JButton btEditarAgendamento;
    private javax.swing.JButton btEditarContato;
    private javax.swing.JButton btEditarEndereco;
    private javax.swing.JButton btEditarEnderecoContato;
    private javax.swing.JButton btEditarUsuario;
    private javax.swing.JButton btExcluirAgendamento;
    private javax.swing.JButton btExcluirContato;
    private javax.swing.JButton btExcluirEndereco;
    private javax.swing.JButton btExcluirEnderecoContato;
    private javax.swing.JButton btExcluirUsuario;
    private javax.swing.JButton btListarAgendamento;
    private javax.swing.JButton btListarContato;
    private javax.swing.JButton btListarEndereco;
    private javax.swing.JButton btListarEnderecoContato;
    private javax.swing.JButton btListarUsuario;
    private javax.swing.JButton btNovoAgendamento;
    private javax.swing.JButton btNovoContato;
    private javax.swing.JButton btNovoEndereco;
    private javax.swing.JButton btNovoEnderecoContato;
    private javax.swing.JButton btNovoUsuario;
    private javax.swing.JButton btSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane menu;
    // End of variables declaration//GEN-END:variables
}
