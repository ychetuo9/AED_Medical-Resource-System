/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalresourcesystem;

import javax.swing.JOptionPane;

/**
 *
 * @author yanyanchen
 */
public class CommunityAdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdminHomePage
     */
    public CommunityAdminHomePage() {
        initComponents();
    }
    
    public CommunityAdminHomePage(String email) {
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

        jButton1 = new javax.swing.JButton();
        btnCreateCity = new javax.swing.JButton();
        btnCreateCommunity = new javax.swing.JButton();
        btnCreateHouse = new javax.swing.JButton();
        btnViewCommunity = new javax.swing.JButton();
        btnViewHouse = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateCity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCreateCity.setText("Create City");
        btnCreateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCityActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 316, 55));

        btnCreateCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCreateCommunity.setText("Create Community");
        btnCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommunityActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 316, 55));

        btnCreateHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCreateHouse.setText("Create House");
        btnCreateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHouseActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 293, 316, 56));

        btnViewCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnViewCommunity.setText("View Update & Delete Community");
        btnViewCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, 56));

        btnViewHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnViewHouse.setText("View Upadate & Delete House");
        btnViewHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 316, 55));

        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 320, 55));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCityActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CreateDeleteCity in=new CreateDeleteCity();
        in.setVisible(true);
    }//GEN-LAST:event_btnCreateCityActionPerformed

    private void btnCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommunityActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CreateDeleteCommunity in=new CreateDeleteCommunity();
        in.setVisible(true);
    }//GEN-LAST:event_btnCreateCommunityActionPerformed

    private void btnCreateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHouseActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CreateDeleteHouse in=new CreateDeleteHouse();
        in.setVisible(true);
    }//GEN-LAST:event_btnCreateHouseActionPerformed

    private void btnViewCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewUpdateDeleteCommunity in=new ViewUpdateDeleteCommunity();
        in.setVisible(true);
    }//GEN-LAST:event_btnViewCommunityActionPerformed

    private void btnViewHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewUpdateDeleteHouse in=new ViewUpdateDeleteHouse();
        in.setVisible(true);    
    }//GEN-LAST:event_btnViewHouseActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCity;
    private javax.swing.JButton btnCreateCommunity;
    private javax.swing.JButton btnCreateHouse;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnViewCommunity;
    private javax.swing.JButton btnViewHouse;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
