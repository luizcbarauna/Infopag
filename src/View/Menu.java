/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FolhadePagamentoController;
import Controller.FuncionarioController;
import Model.InfopagDAO;

/**
 *
 * @author luizf
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterar = new javax.swing.JButton();
        btnRendimento = new javax.swing.JButton();
        btnDados = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        txtmes = new javax.swing.JTextField();
        txtano = new javax.swing.JTextField();
        jTextPane1 = new javax.swing.JTextPane();
        jTextPane2 = new javax.swing.JTextPane();
        btnRendimento1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlterar.setContentAreaFilled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 130, 105, 15));

        btnRendimento.setContentAreaFilled(false);
        btnRendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(btnRendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 105, 105, 16));

        btnDados.setContentAreaFilled(false);
        btnDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 105, 105, 18));

        btnCadastro.setContentAreaFilled(false);
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 129, 105, 17));

        BtnConsultar.setContentAreaFilled(false);
        BtnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 205, 59, 10));

        txtmes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesActionPerformed(evt);
            }
        });
        getContentPane().add(txtmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 70, -1));

        txtano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanoActionPerformed(evt);
            }
        });
        getContentPane().add(txtano, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextPane1.setText("     Ano");
        getContentPane().add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 70, -1));

        jTextPane2.setEditable(false);
        jTextPane2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextPane2.setText("     Mês");
        getContentPane().add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, -1));

        btnRendimento1.setContentAreaFilled(false);
        btnRendimento1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRendimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendimento1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRendimento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 105, 105, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucers/Menu.jpeg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmesActionPerformed

    private void txtanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanoActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
CadastroFuncionario View = new CadastroFuncionario();
        InfopagDAO model= new InfopagDAO();
            FuncionarioController controller= new FuncionarioController(View,model);
            Menu viewM = new Menu();  
            viewM.dispose();
    View.setVisible(true);
    View.setLocationRelativeTo(null);  
    
  
// TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        FolhaPagamento View = new FolhaPagamento();
        InfopagDAO model= new InfopagDAO();
         String ano = txtano.getText();
         String mes= txtmes.getText();
            FolhadePagamentoController controller= new FolhadePagamentoController();
           
    View.setVisible(true);
    
    View.setLocationRelativeTo(null);  
   
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void btnRendimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendimento1ActionPerformed
        RendimentoAdm View = new RendimentoAdm();
        InfopagDAO model= new InfopagDAO();
            View.setVisible(true);
    View.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnRendimento1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       Alterardado View = new Alterardado();
        InfopagDAO model= new InfopagDAO();
            View.setVisible(true);
    View.setLocationRelativeTo(null); // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosActionPerformed
     Alterardado View = new Alterardado();
        InfopagDAO model= new InfopagDAO();
            View.setVisible(true);
    View.setLocationRelativeTo(null); // TODO add your handling code here:    // TODO add your handling code here:
    }//GEN-LAST:event_btnDadosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnConsultar;
    public javax.swing.JButton btnAlterar;
    public javax.swing.JButton btnCadastro;
    public javax.swing.JButton btnDados;
    public javax.swing.JButton btnRendimento;
    public javax.swing.JButton btnRendimento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    public javax.swing.JTextField txtano;
    public javax.swing.JTextField txtmes;
    // End of variables declaration//GEN-END:variables
}
