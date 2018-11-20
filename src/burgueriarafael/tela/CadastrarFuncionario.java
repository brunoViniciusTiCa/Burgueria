/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgueriarafael.tela;

import burgueriarafael.basica.Funcionario;
import burgueriarafael.fachada.FuncionarioFachada;
import burgueriarafael.util.Uteis;

/**
 *
 * @author BrunoTiCaVini
 */
public class CadastrarFuncionario extends javax.swing.JFrame {
    
    public CadastrarFuncionario(){
      
    }
    public static final String TELA_MODO_EDITAR = "e";
    public static final String TELA_MODO_CADASTRAR = "c";
    public static final String TELA_MODO_VOLTAR = "v";
    
    private FuncionarioFachada funcionarioFachada;
    
    public String modoTela = "";
    public Funcionario funcionario = new Funcionario();
    

    /**
     * Creates new form CadastrarFuncionario
     * @param pFuncionario
     */
    public CadastrarFuncionario(String tipoTela, Funcionario pFuncionario) {
        initComponents();
        
        modoTela = TELA_MODO_EDITAR;
        
        if(tipoTela.equals(TELA_MODO_CADASTRAR)){
            lbl_Func.setVisible(true); 
            txt_CpfFuncionario.setVisible(true);
            modoTela = TELA_MODO_CADASTRAR;
        }
        else{
            
            funcionario = pFuncionario;
            lbl_tela.setText("Editar funcionario");
            txt_CpfFuncionario.setText(Uteis.toString(pFuncionario.getCpfFuncionario()));
            txt_CpfFuncionario.setEnabled(true);
            
            txt_TelefoneFuncionario.setText(funcionario.getTelefoneFuncionario());
            txt_EndFuncionario.setText(funcionario.getEnderecoFuncionario());
            txt_NomeFuncionario.setText(funcionario.getNomeFuncionario());
            txt_SexoFuncionario.setText(funcionario.getSexoFuncionario());
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo_Func = new javax.swing.JLabel();
        txt_SexoFuncionario = new javax.swing.JTextField();
        txt_CpfFuncionario = new javax.swing.JTextField();
        txt_TelefoneFuncionario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        End_Func = new javax.swing.JLabel();
        txt_EndFuncionario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_tela = new javax.swing.JLabel();
        Nome_Func = new javax.swing.JLabel();
        lbl_Func = new javax.swing.JLabel();
        txt_NomeFuncionario = new javax.swing.JTextField();
        Tele_Func = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_Func1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Sexo_Func.setBackground(new java.awt.Color(240, 181, 94));
        Sexo_Func.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sexo_Func.setForeground(new java.awt.Color(102, 51, 0));
        Sexo_Func.setText("Sexo Funcionario");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 51, 0));
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        End_Func.setBackground(new java.awt.Color(240, 181, 94));
        End_Func.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        End_Func.setForeground(new java.awt.Color(102, 51, 0));
        End_Func.setText("End Funcionario");

        jPanel1.setBackground(new java.awt.Color(240, 181, 94));

        lbl_tela.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_tela.setForeground(new java.awt.Color(102, 51, 0));
        lbl_tela.setText("Cadastro de Funcionario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_tela)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_tela)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Nome_Func.setBackground(new java.awt.Color(240, 181, 94));
        Nome_Func.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nome_Func.setForeground(new java.awt.Color(102, 51, 0));
        Nome_Func.setText("Nome Funcionario");

        lbl_Func.setBackground(new java.awt.Color(240, 181, 94));
        lbl_Func.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Func.setForeground(new java.awt.Color(102, 51, 0));
        lbl_Func.setText("CPF Funcionario");

        Tele_Func.setBackground(new java.awt.Color(240, 181, 94));
        Tele_Func.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tele_Func.setForeground(new java.awt.Color(102, 51, 0));
        Tele_Func.setText("Telefone Funcionario");

        btn_voltar.setBackground(new java.awt.Color(255, 255, 255));
        btn_voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(102, 51, 0));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jLabel1.setText("*");

        jLabel2.setText("*");

        jLabel6.setText("*");

        jLabel7.setText("*");

        jLabel8.setText("*");

        lbl_Func1.setBackground(new java.awt.Color(240, 181, 94));
        lbl_Func1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Func1.setForeground(new java.awt.Color(102, 51, 0));
        lbl_Func1.setText("CAMPOS COM (*) SÃO OBRIGATORIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tele_Func, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nome_Func, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sexo_Func, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_SexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(End_Func, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Func, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_CpfFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_EndFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Func1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(jLabel5)
                    .addContainerGap(490, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lbl_Func1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Func)
                    .addComponent(txt_CpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tele_Func)
                    .addComponent(txt_TelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(End_Func)
                    .addComponent(txt_EndFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_Func)
                    .addComponent(txt_NomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sexo_Func)
                        .addComponent(txt_SexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(jLabel5)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        funcionarioFachada = new FuncionarioFachada();

        if ( modoTela.equals(TELA_MODO_CADASTRAR)) {

            funcionario.setCpfFuncionario(txt_CpfFuncionario.getText());
            funcionario.setTelefoneFuncionario(txt_TelefoneFuncionario.getText());
            funcionario.setEnderecoFuncionario(txt_EndFuncionario.getText());
            funcionario.setNomeFuncionario(txt_NomeFuncionario.getText());
            funcionario.setSexoFuncionario(txt_SexoFuncionario.getText());
            

            try {
                funcionarioFachada.inserirFuncionario(funcionario);
                Uteis.AlertInfo(this,"Funcionario Cadastrado!!!");
            } catch (Exception ex) {
                Uteis.AlertError(this, ex.getMessage());
            }

        }else if (modoTela.equals(TELA_MODO_EDITAR) ){

            try {
                funcionario.getIdFuncionario();
                funcionario.setCpfFuncionario(txt_CpfFuncionario.getText());
                funcionario.setTelefoneFuncionario(txt_TelefoneFuncionario.getText());
                funcionario.setEnderecoFuncionario(txt_EndFuncionario.getText());
                funcionario.setNomeFuncionario(txt_NomeFuncionario.getText());
                funcionario.setSexoFuncionario(txt_SexoFuncionario.getText());
                

                funcionarioFachada.inserirFuncionario(funcionario);
                Uteis.AlertInfo(this,"Funcionario inserido com Sucesso!!!");
            } catch (Exception ex) {
                Uteis.AlertError(this,ex.getMessage());
            }

        }
        
        txt_CpfFuncionario.setText("");
        txt_TelefoneFuncionario.setText("");
        txt_EndFuncionario.setText("");
        txt_NomeFuncionario.setText("");
        txt_SexoFuncionario.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed

          ListarFuncionario Lfuncionario = new ListarFuncionario();
          Lfuncionario.setVisible(true);
          this.setVisible(false);
          Runtime.getRuntime().runFinalization();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        //Listarfuncionario listarLivro = new ListarLivro();
//        listarLivro.setVisible(true);
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
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario(CadastrarFuncionario.TELA_MODO_CADASTRAR, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel End_Func;
    private javax.swing.JLabel Nome_Func;
    private javax.swing.JLabel Sexo_Func;
    private javax.swing.JLabel Tele_Func;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Func;
    private javax.swing.JLabel lbl_Func1;
    private javax.swing.JLabel lbl_tela;
    private javax.swing.JTextField txt_CpfFuncionario;
    private javax.swing.JTextField txt_EndFuncionario;
    private javax.swing.JTextField txt_NomeFuncionario;
    private javax.swing.JTextField txt_SexoFuncionario;
    private javax.swing.JTextField txt_TelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}