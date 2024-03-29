/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author saikumarganga
 * 
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        jSplitPane = new javax.swing.JSplitPane();
        ctrlPanel = new javax.swing.JPanel();
        btnAddPatientDetails = new javax.swing.JButton();
        btnViewPatientData = new javax.swing.JButton();
        btnAddVitalSigns = new javax.swing.JButton();
        btnViewVitalSigns = new javax.swing.JButton();
        btndeletePatientDetails = new javax.swing.JButton();
        btnViewVitalSigns1 = new javax.swing.JButton();
        dsplyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        ctrlPanel.setBackground(new java.awt.Color(0, 204, 204));

        btnAddPatientDetails.setText("Add Patient Details");
        btnAddPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientDetailsActionPerformed(evt);
            }
        });

        btnViewPatientData.setText("View Patient Details");
        btnViewPatientData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDataActionPerformed(evt);
            }
        });

        btnAddVitalSigns.setText("Add Vital Sign Details");
        btnAddVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalSignsActionPerformed(evt);
            }
        });

        btnViewVitalSigns.setText("Vital Signs History");
        btnViewVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignsActionPerformed(evt);
            }
        });

        btndeletePatientDetails.setText("Delete Patient Details");
        btndeletePatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletePatientDetailsActionPerformed(evt);
            }
        });

        btnViewVitalSigns1.setText("Community Report");
        btnViewVitalSigns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSigns1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ctrlPanelLayout = new javax.swing.GroupLayout(ctrlPanel);
        ctrlPanel.setLayout(ctrlPanelLayout);
        ctrlPanelLayout.setHorizontalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAddPatientDetails)
                    .addComponent(btnViewPatientData)
                    .addComponent(btndeletePatientDetails)
                    .addComponent(btnAddVitalSigns)
                    .addComponent(btnViewVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewVitalSigns1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ctrlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPatientDetails, btnAddVitalSigns, btnViewPatientData, btnViewVitalSigns, btnViewVitalSigns1, btndeletePatientDetails});

        ctrlPanelLayout.setVerticalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnAddPatientDetails)
                .addGap(18, 18, 18)
                .addComponent(btnViewPatientData)
                .addGap(18, 18, 18)
                .addComponent(btndeletePatientDetails)
                .addGap(18, 18, 18)
                .addComponent(btnAddVitalSigns)
                .addGap(18, 18, 18)
                .addComponent(btnViewVitalSigns)
                .addGap(18, 18, 18)
                .addComponent(btnViewVitalSigns1)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        ctrlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddPatientDetails, btnAddVitalSigns, btnViewPatientData, btnViewVitalSigns, btndeletePatientDetails});

        jSplitPane.setLeftComponent(ctrlPanel);

        dsplyPanel.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout dsplyPanelLayout = new javax.swing.GroupLayout(dsplyPanel);
        dsplyPanel.setLayout(dsplyPanelLayout);
        dsplyPanelLayout.setHorizontalGroup(
            dsplyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        dsplyPanelLayout.setVerticalGroup(
            dsplyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(dsplyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientDetailsActionPerformed
        // TODO add your handling code here:
        AddPatientDataJPanel addPatientData = new AddPatientDataJPanel();
        jSplitPane.setRightComponent(addPatientData);
    }//GEN-LAST:event_btnAddPatientDetailsActionPerformed

    private void btnViewPatientDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDataActionPerformed
        // TODO add your handling code here:
        ViewPatientDataJPanel viewPatientData = new ViewPatientDataJPanel();
        jSplitPane.setRightComponent(viewPatientData);
    }//GEN-LAST:event_btnViewPatientDataActionPerformed

    private void btnAddVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalSignsActionPerformed
        // TODO add your handling code here:
        AddVitalSignsPanel addVitalSigns = new AddVitalSignsPanel();
        jSplitPane.setRightComponent(addVitalSigns);
    }//GEN-LAST:event_btnAddVitalSignsActionPerformed

    private void btnViewVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignsActionPerformed
        // TODO add your handling code here:
        ViewVitalSignsJPanel viewVitalSigns = new ViewVitalSignsJPanel();
        jSplitPane.setRightComponent(viewVitalSigns);
    }//GEN-LAST:event_btnViewVitalSignsActionPerformed

    private void btndeletePatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletePatientDetailsActionPerformed
        // TODO add your handling code here:
        DeletePatientDetails deletePatientDetails = new DeletePatientDetails();
        jSplitPane.setRightComponent(deletePatientDetails);
    }//GEN-LAST:event_btndeletePatientDetailsActionPerformed

    private void btnViewVitalSigns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSigns1ActionPerformed
        // TODO add your handling code here:
        CommunityReportJPanel communityReport  = new CommunityReportJPanel();
        jSplitPane.setRightComponent(communityReport);
    }//GEN-LAST:event_btnViewVitalSigns1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatientDetails;
    private javax.swing.JButton btnAddVitalSigns;
    private javax.swing.JButton btnViewPatientData;
    private javax.swing.JButton btnViewVitalSigns;
    private javax.swing.JButton btnViewVitalSigns1;
    private javax.swing.JButton btndeletePatientDetails;
    private javax.swing.JPanel ctrlPanel;
    private javax.swing.JPanel dsplyPanel;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
