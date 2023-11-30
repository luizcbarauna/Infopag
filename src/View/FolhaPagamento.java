/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FolhadePagamentoController;

/**
 *
 * @author luizf
 */
public class FolhaPagamento extends javax.swing.JFrame {

    /**
     * Creates new form FolhaPagamento
     */
    public FolhaPagamento() {
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

        jLabel1 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtCpf = new javax.swing.JTextField();
        txtSalarioBruto = new javax.swing.JTextField();
        TxtSalarioLiquido = new javax.swing.JTextField();
        TxtInss = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        TxtIrrf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoucers/folhaadm.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        TxtNome.setEditable(false);
        TxtNome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(TxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, -1));

        TxtCpf.setEditable(false);
        getContentPane().add(TxtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, -1));

        txtSalarioBruto.setEditable(false);
        txtSalarioBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioBrutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalarioBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 40, 10));

        TxtSalarioLiquido.setEditable(false);
        getContentPane().add(TxtSalarioLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 40, 10));

        TxtInss.setEditable(false);
        getContentPane().add(TxtInss, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 40, 10));

        txtMes.setEditable(false);
        getContentPane().add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 50, -1));

        txtAno.setEditable(false);
        getContentPane().add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 50, -1));

        TxtIrrf.setEditable(false);
        getContentPane().add(TxtIrrf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 40, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setText("Salario Liquido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalarioBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioBrutoActionPerformed

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
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FolhaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FolhaPagamento().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtInss;
    private javax.swing.JTextField TxtIrrf;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtSalarioLiquido;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtSalarioBruto;
    // End of variables declaration//GEN-END:variables
}
