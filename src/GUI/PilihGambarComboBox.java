/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author ACER
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
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

        imagepanel = new javax.swing.JPanel();
        glassfishLB = new javax.swing.JLabel();
        javaeeLB = new javax.swing.JLabel();
        postgresqlLB = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihanpilihCard = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagepanel.setLayout(new java.awt.CardLayout());

        glassfishLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glassfishLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/glassfish.jpg"))); // NOI18N
        glassfishLB.setToolTipText("null");
        glassfishLB.setName("null"); // NOI18N
        imagepanel.add(glassfishLB, "0");

        javaeeLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/javaee.jpg"))); // NOI18N
        javaeeLB.setToolTipText("null");
        javaeeLB.setName("null"); // NOI18N
        imagepanel.add(javaeeLB, "1");

        postgresqlLB.setBackground(new java.awt.Color(204, 204, 204));
        postgresqlLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgresqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/postgresql.jpg"))); // NOI18N
        postgresqlLB.setToolTipText("null");
        postgresqlLB.setName("null"); // NOI18N
        imagepanel.add(postgresqlLB, "2");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pilih Gambar :");

        pilihanpilihCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pilihanpilihCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GlasFish", "Java EE", "PostgreSQL" }));
        pilihanpilihCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanpilihCardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pilihanpilihCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pilihanpilihCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanpilihCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanpilihCardActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagepanel.getLayout());
        cl.show(imagepanel, String.valueOf(pilihanpilihCard.getSelectedIndex()));
    }//GEN-LAST:event_pilihanpilihCardActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel glassfishLB;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JComboBox<String> pilihanpilihCard;
    private javax.swing.JLabel postgresqlLB;
    // End of variables declaration//GEN-END:variables
}
