/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;

/**
 *
 * @author kesada
 */
public class UI extends javax.swing.JFrame {
     
    /**
     * Creates new form Main
     */
    public UI() {
        initComponents();
        Container contentPane = getContentPane();
        
        /*Paneles acciones */
        JPanel beneficiarios = new jBeneficiarios();
        JPanel diaketas = new jDiaketas();
        JPanel donaciones = new jDonaciones();
        JPanel empleo = new jEmpleo();
        JPanel socios = new jSocios();
        
        
        /*JPrincipal*/
        jPrincipal.add("Socios", socios);
        jPrincipal.add("Empleo", empleo);
        jPrincipal.add("Donaciones", donaciones);
        jPrincipal.add("Diaketas", diaketas);
        jPrincipal.add("Beneficiarios", beneficiarios);
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBotones = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(550, 400));

        jMenuBotones.setLayout(new java.awt.GridLayout(1, 0));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/UI/Home.png"))); // NOI18N
        jButton5.setText("Diaketas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jMenuBotones.add(jButton5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/UI/Socios.gif"))); // NOI18N
        jButton1.setText("Socios");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setPreferredSize(new java.awt.Dimension(118, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jMenuBotones.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/UI/beneficiarios.png"))); // NOI18N
        jButton2.setText("Beneficiarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jMenuBotones.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/UI/Donaciones.png"))); // NOI18N
        jButton3.setText("Donaciones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jMenuBotones.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/UI/empleo.png"))); // NOI18N
        jButton4.setText("Empleo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jMenuBotones.add(jButton4);

        getContentPane().add(jMenuBotones, java.awt.BorderLayout.NORTH);

        jPrincipal.setLayout(new java.awt.CardLayout());

        jLabel1.setText("LOGOTIPO GRANDE / ESTADISTICAS / NOSE");
        jPrincipal.add(jLabel1, "card2");

        getContentPane().add(jPrincipal, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Diaketas");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Socios");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Beneficiarios");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Donaciones");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Empleo");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Ayuda");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Modificamos zona principal*/
        CardLayout cl = (CardLayout)(jPrincipal.getLayout());
        cl.show(jPrincipal, "Socios");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*Modificamos zona principal*/
        CardLayout cl = (CardLayout)(jPrincipal.getLayout());
        cl.show(jPrincipal, "Beneficiarios");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /*Modificamos zona principal*/
        CardLayout cl = (CardLayout)(jPrincipal.getLayout());
        cl.show(jPrincipal, "Diaketas");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*Modificamos zona principal*/
        CardLayout cl = (CardLayout)(jPrincipal.getLayout());
        cl.show(jPrincipal, "Donaciones");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            /*Modificamos zona principal*/
        CardLayout cl = (CardLayout)(jPrincipal.getLayout());
        cl.show(jPrincipal, "Empleo");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jMenuBotones;
    private javax.swing.JPanel jPrincipal;
    // End of variables declaration//GEN-END:variables
}
