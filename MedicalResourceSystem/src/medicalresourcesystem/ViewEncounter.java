/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalresourcesystem;

import dao.EncounterDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Encounter;

/**
 *
 * @author yanyanchen
 */
public class ViewEncounter extends javax.swing.JFrame {

    /**
     * Creates new form ViewEncounter
     */
    public ViewEncounter() {
        initComponents();
    }
    public void getAllRecords(String patientId){
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Encounter> list = EncounterDao.getAllRecords(patientId);
        Iterator<Encounter> itr = list.iterator();
        while(itr.hasNext()){
            Encounter encounterObj = itr.next();
            dtm.addRow(new Object[]{encounterObj.getId(),encounterObj.getPatientId(),encounterObj.getName(),encounterObj.getGender(),encounterObj.getAge(),encounterObj.getEmail(),encounterObj.getHouse(),encounterObj.getCommunity(),encounterObj.getHeartBeat(),encounterObj.getBloodPressure(),encounterObj.getDiagnose(),encounterObj.getDoctor(),encounterObj.getSpecialty(),encounterObj.getPositionTitle(),encounterObj.getStatus(),encounterObj.getDate()});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblSpecialty = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblHeartBeat = new javax.swing.JLabel();
        lblPressure = new javax.swing.JLabel();
        lblDiagnose = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Id", "Name", "gender", "age", "email", "house", "community", "heartBeat", "bloodPressure", "diagnose", "doctor", "specialty", "positionTitle", "status", "date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });

        jLabel1.setText("Input your patient ID");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("House");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Community");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setText("ID");

        lblPatientId.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        lblPatientId.setText("00");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel14.setText("Specialty");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel15.setText("Position");

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel16.setText("Doctor");

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel17.setText("Status");

        lblName.setText("--");

        lblGender.setText("--");

        lblAge.setText("--");

        lblHouse.setText("--");

        lblCommunity.setText("--");

        lblPosition.setText("--");

        lblEmail.setText("--");

        lblDoctor.setText("--");

        lblSpecialty.setText("--");

        lblStatus.setText("--");

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel18.setText("HeartBeat");

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel19.setText("Pressure");

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel20.setText("Diagnose");

        lblHeartBeat.setText("--");

        lblPressure.setText("--");

        lblDiagnose.setText("--");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel11.setText("Date");

        lblDate.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(lblEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(lblGender))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(lblHouse)
                            .addComponent(lblCommunity)
                            .addComponent(lblDoctor)
                            .addComponent(lblSpecialty)
                            .addComponent(lblStatus)
                            .addComponent(lblPosition)
                            .addComponent(lblHeartBeat)
                            .addComponent(lblPressure)
                            .addComponent(lblDiagnose)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblPatientId)
                            .addComponent(lblDate))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblDate))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblName))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblEmail))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblGender))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblAge))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblHouse))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblCommunity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblDoctor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblSpecialty))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblPosition))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblStatus))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblHeartBeat))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressure)
                    .addComponent(jLabel19))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiagnose)
                    .addComponent(jLabel20))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String patientId=txtId.getText();
        getAllRecords(patientId);
        
        
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        int index = jTable1.getSelectedRow();
//        TableModel model=jTable1.getModel();
//        String id = (String)model.getValueAt(index,0).toString();
//        String status = model.getValueAt(index,14).toString();
//        if(status.equals("true"))
//            status="false";
//        else
//            status="true";
//        int a =JOptionPane.showConfirmDialog(null,"Do you want to change status of "+id+"?","Select",JOptionPane.YES_NO_OPTION);
//        if(a==0){
//            EncounterDao.changeStatus(id,status);
//            setVisible(false);
//            new ViewEncounter().setVisible(true);
//        }
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id = model.getValueAt(index,1).toString();
        lblPatientId.setText(id);
        String name = model.getValueAt(index,2).toString();
        lblName.setText(name);
        String gender = model.getValueAt(index,3).toString();
        lblGender.setText(gender);
        String age = model.getValueAt(index,4).toString();
        lblAge.setText(age);
        String email = model.getValueAt(index,5).toString();
        lblEmail.setText(email);
        String house = model.getValueAt(index,6).toString();
        lblHouse.setText(house);
        String community = model.getValueAt(index, 7).toString();
        lblCommunity.setText(community);
        String heartBeat = model.getValueAt(index, 8).toString();
        lblHeartBeat.setText(heartBeat);
        String bloodPressure = model.getValueAt(index, 9).toString();
        lblPressure.setText(bloodPressure);
        String diagnose = model.getValueAt(index, 10).toString();
        lblDiagnose.setText(diagnose);
        String docotor = model.getValueAt(index, 11).toString();
        lblDoctor.setText(docotor);
        String specialty = model.getValueAt(index, 12).toString();
        lblSpecialty.setText(specialty);
        String position = model.getValueAt(index, 13).toString();
        lblPosition.setText(position);
        String date = (String)model.getValueAt(index, 15).toString();
        lblDate.setText(date);
        String status = model.getValueAt(index, 14).toString();
        lblStatus.setText(status);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        // TODO add your handling code here:
        String patientId=txtId.getText();
        getAllRecords(patientId);
    }//GEN-LAST:event_txtIdKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PatientHomePage in=new PatientHomePage();
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEncounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEncounter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiagnose;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeartBeat;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPressure;
    private javax.swing.JLabel lblSpecialty;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
