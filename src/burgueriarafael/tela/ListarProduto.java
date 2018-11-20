/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.tela;

import burgueriarafael.basica.Produto;
import burgueriarafael.fachada.ProdutoFachada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import burgueriarafael.util.Uteis;

/**
 *
 * @author r.b.gomes.dos.santos
 */
public class ListarProduto extends javax.swing.JFrame {
    
    private ProdutoFachada produtoFachada = null;
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    private List<Produto> listaProduto = new ArrayList<>();
    
    private boolean abrindoTela  = false; 

    /**
     * Creates new form ListarLivro
     */
    public ListarProduto() {
        initComponents();
        preencherTabelaCliente();
    }
    
    private void preencherTabelaCliente(){
        
        modelo = (DefaultTableModel) jTable1.getModel();
        
        produtoFachada = new ProdutoFachada();
        
        try {
            //limpando a lista
            listaProduto.clear();
            //preenchendo a lista com as informações do banco
            listaProduto = produtoFachada.consultarProduto();
            if (jTable1.getRowCount()>0) {
                Uteis.AlertInfo(this, "Todos Produtos foram listados com sucesso.");
            }
            
        } catch (Exception ex) {
            Uteis.AlertError(this, ex.getMessage());
        }

        //remove as linhas da tabela, para evitar que duplicidade
        modelo.setRowCount(0);
        
        for (Produto produto : listaProduto) {
            
            Object object [] = new Object[]{
                
                produto.getIdProduto(),
                produto.getValorProduto(),
                produto.getNomeProduto(),
                produto.getDescricaoProduto()
               
            };
            
            modelo.addRow(object);
        }
        
        jTable1.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_tela = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_Atualizar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 181, 94));

        lbl_tela.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_tela.setForeground(new java.awt.Color(102, 51, 0));
        lbl_tela.setText("Produtos KoF Burguers");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(lbl_tela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_tela)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btn_editar.setBackground(new java.awt.Color(255, 255, 255));
        btn_editar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(102, 51, 0));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_deletar.setBackground(new java.awt.Color(255, 255, 255));
        btn_deletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_deletar.setForeground(new java.awt.Color(102, 51, 0));
        btn_deletar.setText("Deletar");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(102, 51, 0));
        btn_cadastrar.setText("Cadastrar novo");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_Atualizar1.setBackground(new java.awt.Color(255, 255, 255));
        btn_Atualizar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Atualizar1.setForeground(new java.awt.Color(102, 51, 0));
        btn_Atualizar1.setText("Atualizar");
        btn_Atualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Atualizar1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProduto", "Valor Produto", "Nome Produto", "Desc Produto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        btn_Voltar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(102, 51, 0));
        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                        .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Atualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Atualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:

        int posicaoSelecionada = jTable1.getSelectedRow();

        //maior que -1 existe alguma linha selecionada na tabela
        if (posicaoSelecionada > -1) {
            Produto produtoSelecionado ;
            produtoSelecionado = listaProduto.get(posicaoSelecionada);
            
            CadastrarProduto telaCadastrarProduto = new CadastrarProduto(CadastrarProduto.TELA_MODO_EDITAR , produtoSelecionado);
            telaCadastrarProduto.setVisible(true);
            abrindoTela = true;
            this.dispose();
        }
        else{
            Uteis.AlertInfo(this, "Selecione algum item na tabela para poder realizar a edição!");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        // TODO add your handling code here:
        int posicaoSelecionada = jTable1.getSelectedRow();

        //maior que -1 existe alguma linha selecionada na tabela
        if (posicaoSelecionada > -1) {
            try {
                Produto produtoSelecionado ;
                produtoSelecionado = listaProduto.get(posicaoSelecionada);

                int resutBtnClick = Uteis.ConfirmeDialog(this, "Deseja realmente deletar esse produto?");

                if (resutBtnClick == JOptionPane.YES_OPTION) {
                    produtoFachada.deletarProduto(produtoSelecionado);
                    Uteis.AlertInfo(this, "Produto deletado com sucesso.");
                    preencherTabelaCliente();
                }

            } catch (Exception ex) {
                Uteis.AlertError(this, ex.getMessage());
            }
        }
        else{
            Uteis.AlertInfo(this, "Selecione algum item na tabela para poder realizar a exclusão!");
        }

    }//GEN-LAST:event_btn_deletarActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:

        CadastrarProduto telaCadastrarProduto = new CadastrarProduto(CadastrarProduto.TELA_MODO_CADASTRAR, null);
        telaCadastrarProduto.setVisible(true);
        abrindoTela = true;
        dispose();
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_Atualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Atualizar1ActionPerformed

         int posicaoSelecionada = jTable1.getSelectedRow();

        //maior que -1 existe alguma linha selecionada na tabela
        if (posicaoSelecionada > -1) {
            Produto produtoSelecionado ;
            produtoSelecionado = listaProduto.get(posicaoSelecionada);
            CadastrarProduto telaCadastrarProduto = new CadastrarProduto(CadastrarProduto.TELA_MODO_EDITAR , produtoSelecionado);
            telaCadastrarProduto.setVisible(true);
            abrindoTela = true;
            this.dispose();
        }
        else{
            Uteis.AlertInfo(this, "Selecione algum item na tabela para poder realizar a edição!");
        }

        // TODO add your handling code here:
        preencherTabelaCliente();
    }//GEN-LAST:event_btn_Atualizar1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed

          MenuBurgueria menuburgueria = new MenuBurgueria();
          menuburgueria.setVisible(true);
          this.setVisible(false);
          Runtime.getRuntime().runFinalization();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atualizar1;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_tela;
    // End of variables declaration//GEN-END:variables
}
