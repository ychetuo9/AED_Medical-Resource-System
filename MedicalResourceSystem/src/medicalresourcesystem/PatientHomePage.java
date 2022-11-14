/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalresourcesystem;

import dao.CommunityDao;
import dao.DoctorDirectoryDao;
import dao.EncounterDao;
import dao.HouseDao;
import dao.PatientDirectoryDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Community;
import model.Doctor;
import model.Encounter;
import model.House;
import model.Patient;

/**
 *
 * @author yanyanchen
 */
public class PatientHomePage extends javax.swing.JFrame {

    /**
     * Creates new form PatientHomePage
     */
    public PatientHomePage() {
        initComponents();
    }
    
    public PatientHomePage(String email) {
        initComponents();
    }
    
    
    public void validateFields(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dataChooser.getDate());
        
        if(!date.equals("")){
            btnBook.setEnabled(true);
        }
        else{
            btnBook.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClear1 = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dataChooser = new com.toedter.calendar.JDateChooser();
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
        btnEncounter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Person Detail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 28, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Age");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("House");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Community");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        btnClear1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, -1, -1));

        btnBook.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBook.setText("Book Encounter");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, -1, -1));

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Gender", "Age", "Mobile ", "House", "Community"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 790, 60));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        lblPatientId.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        lblPatientId.setText("00");
        getContentPane().add(lblPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jTable2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Gender", "Age", "Mobile ", "Hospital", "Position Title", "Specialty"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 790, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("View Doctor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 190, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel13.setText("Search Doctor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel14.setText("Specialty");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel15.setText("Position");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        dataChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataChooserKeyReleased(evt);
            }
        });
        getContentPane().add(dataChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 280, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel16.setText("Doctor");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        lblName.setText("--");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        lblGender.setText("--");
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        lblAge.setText("--");
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        lblHouse.setText("--");
        getContentPane().add(lblHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        lblCommunity.setText("--");
        getContentPane().add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        lblPosition.setText("--");
        getContentPane().add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        lblEmail.setText("--");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        lblDoctor.setText("--");
        getContentPane().add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        lblSpecialty.setText("--");
        getContentPane().add(lblSpecialty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        btnEncounter.setText("See Encounter Records");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 633, 280, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PatientHomePage().setVisible(true);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        Encounter encounter = new Encounter();
        encounter.setPatientId(lblPatientId.getText());
        encounter.setName(lblName.getText());
        encounter.setEmail(lblEmail.getText());
        encounter.setAge(lblAge.getText());
        encounter.setCommunity(lblCommunity.getText());
        encounter.setHouse(lblHouse.getText());

        encounter.setDoctor(lblDoctor.getText());
        encounter.setGender(lblGender.getText());
        encounter.setSpecialty(lblSpecialty.getText());
        encounter.setPositionTitle(lblPosition.getText());
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(dataChooser.getDate());
        encounter.setDate(date);

        EncounterDao.book(encounter);
        setVisible(false);
        new PatientHomePage().setVisible(true);

    }//GEN-LAST:event_btnBookActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<Patient> patientList = PatientDirectoryDao.getAllRecords();
        Iterator<Patient> itrPatient = patientList.iterator();
        while(itrPatient.hasNext()){
            Patient patientObj = itrPatient.next();
            dtm.addRow(new Object[]{patientObj.getId(),patientObj.getName(),patientObj.getEmail(),patientObj.getGender(),patientObj.getAge(),patientObj.getMobileNumber(),patientObj.getHouse(),patientObj.getCommunity()});
        }
        
        DefaultTableModel dtm1 = (DefaultTableModel)jTable2.getModel();
        ArrayList<Doctor> doctorList = DoctorDirectoryDao.getAllRecords();
        Iterator<Doctor> itrDoctor = doctorList.iterator();
        while(itrDoctor.hasNext()){
            Doctor doctorObj = itrDoctor.next();
            dtm1.addRow(new Object[]{doctorObj.getId(),doctorObj.getName(),doctorObj.getEmail(),doctorObj.getGender(),doctorObj.getAge(),doctorObj.getMobileNumber(),doctorObj.getHospital(),doctorObj.getPositionTitle(),doctorObj.getSpecialty()});
        }
        
        
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here

        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id = model.getValueAt(index,0).toString();
        lblPatientId.setText(id);
        String name = model.getValueAt(index,1).toString();
        lblName.setText(name);
        String email = model.getValueAt(index,2).toString();
        lblEmail.setText(email);
        String gender = model.getValueAt(index,3).toString();
        lblGender.setText(gender);
        String age = model.getValueAt(index,4).toString();
        lblAge.setText(age);
        String mobileNumbder = model.getValueAt(index,5).toString();
        String house = model.getValueAt(index,6).toString();
        lblHouse.setText(house);
        String community = model.getValueAt(index, 7).toString();
        lblCommunity.setText(community);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here

        int index = jTable2.getSelectedRow();
        TableModel model=jTable2.getModel();
        
        String name = model.getValueAt(index,1).toString();
        lblDoctor.setText(name);
        String Specailty = model.getValueAt(index,8).toString();
        lblSpecialty.setText(Specailty);
        String position = model.getValueAt(index,7).toString();
        lblPosition.setText(position);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void dataChooserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataChooserKeyReleased
        // TODO add your handling code here:
        validateFields();
        
    }//GEN-LAST:event_dataChooserKeyReleased

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewEncounter in=new ViewEncounter();
        in.setVisible(true);
        
    }//GEN-LAST:event_btnEncounterActionPerformed

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
            java.util.logging.Logger.getLogger(PatientHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnEncounter;
    private com.toedter.calendar.JDateChooser dataChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSpecialty;
    // End of variables declaration//GEN-END:variables
}
