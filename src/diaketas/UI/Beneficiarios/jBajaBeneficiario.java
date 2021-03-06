/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Beneficiarios;

import diaketas.UI.UI;
import diaketas.Modelo.Gestores.Gestor_de_beneficiarios;
import javax.swing.JOptionPane;

/**
 *
 * @author kesada
 */
public class jBajaBeneficiario extends javax.swing.JPanel {

    public int fase;
    /**
     * Creates new form jAltaBeneficiario
     */
    public jBajaBeneficiario() {
        initComponents();
        fase = 0;
        jLabel4.setVisible(false);
        NIF_Voluntario.setVisible(false);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        NIF_CIF = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        botonCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NIF_Voluntario = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiarios");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Dar de baja a un beneficiario");

        jLabel2.setText("DNI/NIF del beneficiario");

        NIF_CIF.setColumns(9);
        NIF_CIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_CIFKeyTyped(evt);
            }
        });

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI voluntario");

        NIF_Voluntario.setBackground(new java.awt.Color(255, 255, 153));
        NIF_Voluntario.setColumns(9);
        NIF_Voluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_VoluntarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(botonOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NIF_Voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        boolean correcto;
        
        if (fase == 0){
            if (NIF_CIF.getText().compareTo("") != 0){
                
                /*Introducir DNI Beneficiario*/
                correcto = diaketas.diaketas.gestorBeneficiarios.introducirDNIBeneficiario(NIF_CIF.getText());

                /*Beneficiario correcto*/
                if (correcto == true){
                    
                    /*Cambios esteticos*/
                    NIF_CIF.setVisible(false);
                    jLabel2.setText("¿Desea borrar el beneficiario con NIF-CIF " + NIF_CIF.getText()+ "?");
                    jLabel4.setVisible(true);
                    NIF_Voluntario.setVisible(true);
                    fase = 1;
                    
                }else   /*No se encuentra el beneficiario*/
                    JOptionPane.showMessageDialog(this, "No se ha encontrado ningún beneficiario con ese NIF.",
                            "NIF Beneficiario", JOptionPane.ERROR_MESSAGE);
                
            }else{
                    JOptionPane.showMessageDialog(this, "El NIF del beneficiario no se ha introducido.",
                            "NIF Beneficiario", JOptionPane.ERROR_MESSAGE);
            }
        }else if (fase ==1){
            if (NIF_Voluntario.getText().compareTo("") != 0){
                
                /*IntroducirDNIVoluntario*/
                correcto = diaketas.diaketas.gestorBeneficiarios.introducirDNIVoluntario(NIF_Voluntario.getText());
                
                if (correcto == true){
                    
                    /* ConfirmarBajaBeneficiario*/
                    diaketas.diaketas.gestorBeneficiarios.confirmarBajaBeneficiario();
                    
                    /*Cambios esteticos*/
                    NIF_Voluntario.setVisible(false);
                    jLabel2.setText("El beneficiario ha sido dado de baja correctamente.");
                    jLabel4.setVisible(false);
                    fase = 2;
                    
                }else{
                     JOptionPane.showMessageDialog(this, "No se ha encontrado ningún voluntario con ese NIF.",
                            "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "El NIF del voluntario no se ha introducido.",
                        "NIF Voluntario", JOptionPane.ERROR_MESSAGE);
            }
        }else
            UI.cl.show(UI.jPrincipal, "Beneficiarios");
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
            UI.cl.show(UI.jPrincipal, "Beneficiarios");
            // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelActionPerformed

    private void NIF_CIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_CIFKeyTyped
        if (NIF_CIF.getText().length()>=9){
            evt.consume();
        } 
// TODO add your handling code here:
    }//GEN-LAST:event_NIF_CIFKeyTyped

    private void NIF_VoluntarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_VoluntarioKeyTyped
        if (NIF_Voluntario.getText().length()>=9){
            evt.consume();
        }
    }//GEN-LAST:event_NIF_VoluntarioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIF_CIF;
    private javax.swing.JTextField NIF_Voluntario;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
