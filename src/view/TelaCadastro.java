/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ClienteDAO;
import model.Cliente;
import model.Produto;
import model.Tecnico;
import util.Formata;

/**
 *
 * @author linux
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        setMascara();
        tfCliNome.requestFocus();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        pnButtons = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tbCadastro = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbFone = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfCliNome = new javax.swing.JTextField();
        tfCliCPF = new javax.swing.JFormattedTextField();
        tfCliFone = new javax.swing.JFormattedTextField();
        tfCliCelular = new javax.swing.JFormattedTextField();
        tfCliEmail = new javax.swing.JTextField();
        pnProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfProDescricao = new javax.swing.JTextField();
        spProEstoque = new javax.swing.JSpinner();
        cbProAtivo = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfProCusto = new javax.swing.JTextField();
        tfProVenda = new javax.swing.JTextField();
        pnServico = new javax.swing.JPanel();
        pnTecnico = new javax.swing.JPanel();
        lbTecNome = new javax.swing.JLabel();
        tfTecNome = new javax.swing.JTextField();
        lbTecVlhora = new javax.swing.JLabel();
        tfTecVlhora = new javax.swing.JTextField();
        lbTecSalario = new javax.swing.JLabel();
        tfTecSalario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InfoSys - Tela de Cadastros");

        pnTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbTitulo.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        lbTitulo.setText("Cadastros");

        lbLogo.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/InfoSysLogo-Pequeno.png"))); // NOI18N

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addComponent(lbLogo)
                .addGap(62, 62, 62)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTitulo))
            .addComponent(lbLogo)
        );

        pnButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(28, 28, 28)
                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pnButtonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btGravar, btLimpar});

        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btGravar)
                .addComponent(btLimpar))
        );

        tbCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbNome.setText("Nome:");

        lbCPF.setText("CPF:");

        lbFone.setText("Telefone:");

        lbCelular.setText("Celular:");

        lbEmail.setText("Email:");

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEmail)
                    .addComponent(lbCelular)
                    .addComponent(lbFone)
                    .addComponent(lbCPF)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(tfCliNome)
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfCliCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(tfCliFone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfCliCPF, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF)
                    .addComponent(tfCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFone)
                    .addComponent(tfCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelular)
                    .addComponent(tfCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbCadastro.addTab("Clientes", pnCliente);

        jLabel1.setText("Descrição:");

        jLabel2.setText("Estoque:");

        cbProAtivo.setText("Ativo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Preço"));

        jLabel3.setText("Custo:");

        jLabel4.setText("Venda:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfProCusto, tfProVenda});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(4, 4, 4)
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbProAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProAtivo))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tbCadastro.addTab("Produtos", pnProduto);

        javax.swing.GroupLayout pnServicoLayout = new javax.swing.GroupLayout(pnServico);
        pnServico.setLayout(pnServicoLayout);
        pnServicoLayout.setHorizontalGroup(
            pnServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );
        pnServicoLayout.setVerticalGroup(
            pnServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        tbCadastro.addTab("Serviços", pnServico);

        lbTecNome.setLabelFor(tfTecNome);
        lbTecNome.setText("Nome:");

        lbTecVlhora.setText("Valor Hora:");

        lbTecSalario.setText("Salário:");

        javax.swing.GroupLayout pnTecnicoLayout = new javax.swing.GroupLayout(pnTecnico);
        pnTecnico.setLayout(pnTecnicoLayout);
        pnTecnicoLayout.setHorizontalGroup(
            pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTecnicoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTecSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTecVlhora, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTecNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTecVlhora, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTecSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnTecnicoLayout.setVerticalGroup(
            pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTecnicoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecNome)
                    .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecVlhora)
                    .addComponent(tfTecVlhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecSalario)
                    .addComponent(tfTecSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tbCadastro.addTab("Técnicos", pnTecnico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbCadastro)
            .addComponent(pnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        // TODO add your handling code here:
        if (tbCadastro.getSelectedComponent() == pnCliente) gravaCliente();
        else if (tbCadastro.getSelectedComponent() == pnProduto) gravaProduto();
        else if (tbCadastro.getSelectedComponent() == pnTecnico) gravaTecnico();
    }//GEN-LAST:event_btGravarActionPerformed

    private void gravaCliente() {
        String nome = tfCliNome.getText();
        String cpf = tfCliCPF.getText();
        String fone = tfCliFone.getText();
        String celular = tfCliCelular.getText();
        String email = tfCliEmail.getText();
        Cliente c = new Cliente(nome,cpf,fone,celular,email);
        ClienteDAO dao = new ClienteDAO();
        dao.insert(c);
        System.out.println(c);
        limpaTelaCliente();       
    }
    
    private void gravaProduto() {
        String descricao = tfProDescricao.getText();
        int estoque = (int) spProEstoque.getValue();
        boolean ativo = cbProAtivo.isSelected();
        double custo = Double.parseDouble(tfProCusto.getText());
        double venda = Double.parseDouble(tfProVenda.getText());
        Produto p = new Produto(descricao,estoque,ativo,custo,venda);
        System.out.println(p);
        limpaTelaCliente();             
    }

    private void gravaTecnico() {
        String nome = tfTecNome.getText();
        double vlhora = Double.parseDouble(tfTecVlhora.getText());
        double salario = Double.parseDouble(tfTecSalario.getText());
        Tecnico t = new Tecnico(nome,vlhora,salario);
        System.out.println(t);
        limpaTelaTecnico();       
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        if (tbCadastro.getSelectedComponent() == pnCliente) limpaTelaCliente();
        else if (tbCadastro.getSelectedComponent() == pnProduto) limpaTelaProduto();       
        else if (tbCadastro.getSelectedComponent() == pnTecnico) limpaTelaTecnico();

    }//GEN-LAST:event_btLimparActionPerformed

    private void limpaTelaProduto() {
        tfProDescricao.setText("");
        spProEstoque.setValue(0);
        cbProAtivo.setSelected(true);
        tfProCusto.setText("");
        tfProVenda.setText("");
        tfProDescricao.requestFocus();
    }
    
    private void limpaTelaCliente() {
        tfCliNome.setText("");
        tfCliCPF.setText("");
        tfCliFone.setText("");
        tfCliCelular.setText("");
        tfCliEmail.setText("");
        tfCliNome.requestFocus();       
    }
    
    private void limpaTelaTecnico() {
        tfTecNome.setText("");
        tfTecVlhora.setText("");
        tfTecSalario.setText("");
        tfTecNome.requestFocus();
    }
    
    private void setMascara() {
        tfCliCPF.setFormatterFactory(Formata.cpf());
        tfCliFone.setFormatterFactory(Formata.fone());
        tfCliCelular.setFormatterFactory(Formata.celular());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JCheckBox cbProAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFone;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTecNome;
    private javax.swing.JLabel lbTecSalario;
    private javax.swing.JLabel lbTecVlhora;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnServico;
    private javax.swing.JPanel pnTecnico;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSpinner spProEstoque;
    private javax.swing.JTabbedPane tbCadastro;
    private javax.swing.JFormattedTextField tfCliCPF;
    private javax.swing.JFormattedTextField tfCliCelular;
    private javax.swing.JTextField tfCliEmail;
    private javax.swing.JFormattedTextField tfCliFone;
    private javax.swing.JTextField tfCliNome;
    private javax.swing.JTextField tfProCusto;
    private javax.swing.JTextField tfProDescricao;
    private javax.swing.JTextField tfProVenda;
    private javax.swing.JTextField tfTecNome;
    private javax.swing.JTextField tfTecSalario;
    private javax.swing.JTextField tfTecVlhora;
    // End of variables declaration//GEN-END:variables
}