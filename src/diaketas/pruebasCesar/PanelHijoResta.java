/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.pruebasCesar;

/**
 *
 * @author Pc
 */
public class PanelHijoResta extends javax.swing.JPanel {

    /**
     * Creates new form suma
     */
    public PanelHijoResta() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        primer_num = new javax.swing.JTextField();
        segundo_num = new javax.swing.JTextField();
        res = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Resta");

        jLabel2.setText("Primer numero");

        jLabel3.setText("Segundo numero");

        jLabel4.setText("Resultado");

        primer_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primer_numActionPerformed(evt);
            }
        });
        primer_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                primer_numKeyReleased(evt);
            }
        });

        segundo_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                segundo_numKeyReleased(evt);
            }
        });

        res.setEditable(false);
        res.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(primer_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundo_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primer_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundo_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void primer_numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primer_numKeyReleased
        // TODO add your handling code here:

        //Asignamos el texto del textBox a una variable Integer
        int num1 = Integer.parseInt(this.primer_num.getText());

        //Si el otro TextBox no esta vacio, entonces se debe realizar la operación
        if (!this.segundo_num.getText().equals(""))
        {

            int num2 = Integer.parseInt(this.segundo_num.getText());

            //Se realiza la operación, y se coloca en el TextBox del resultado
            this.res.setText(String.valueOf(num2+num1));
        }
            

    }//GEN-LAST:event_primer_numKeyReleased

    private void primer_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primer_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primer_numActionPerformed

    private void segundo_numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundo_numKeyReleased
        // TODO add your handling code here:
        
        //Asignamos el texto del textBox a una variable Integer
        int num1 = Integer.parseInt(this.primer_num.getText());

        //Si el otro TextBox no esta vacio, entonces se debe realizar la operación
        if (!this.segundo_num.getText().equals("")){

        int num2 = Integer.parseInt(this.segundo_num.getText());

        //Se realiza la operación, y se coloca en el TextBox del resultado
        this.res.setText(String.valueOf(num2+num1));
        }

    }//GEN-LAST:event_segundo_numKeyReleased

    private void resKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resKeyReleased
        // TODO add your handling code here:
        
        
        //Asignamos el texto del textBox a una variable Integer
        int num1 = Integer.parseInt(this.primer_num.getText());

        //Si el otro TextBox no esta vacio, entonces se debe realizar la operación
        if (!this.segundo_num.getText().equals("")){

        int num2 = Integer.parseInt(this.segundo_num.getText());

        //Se realiza la operación, y se coloca en el TextBox del resultado
        this.res.setText(String.valueOf(num2+num1));
        }


    }//GEN-LAST:event_resKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField primer_num;
    private javax.swing.JTextField res;
    private javax.swing.JTextField segundo_num;
    // End of variables declaration//GEN-END:variables
}
