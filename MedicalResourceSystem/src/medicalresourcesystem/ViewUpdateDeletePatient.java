/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalresourcesystem;

import dao.CommunityDao;
import dao.HouseDao;
import dao.PatientDirectoryDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Community;
import model.House;
import model.Patient;

/**
 *
 * @author yanyanchen
 */
public class ViewUpdateDeletePatient extends javax.swing.JFrame {

    /**
     * Creates new form ViewUpdateDeletePatient
     */
    public ViewUpdateDeletePatient() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    public void validateFields(){
        String name=txtName.getText();
        String email=txtEmail.getText();
        String mobileNumber=txtMobileNumber.getText();
        String address=txtAddress.getText();
        String house=(String)cbbHouse.getSelectedItem();
        String community=(String)cbbCommunity.getSelectedItem();
        String age=(String)cbbAge.getSelectedItem();
        String gender="";
        if(rbtnFemale.isSelected()){
            gender="Female";
        }
        if(rbtnMale.isSelected()){
            gender="Male";
        }
        
        if(!name.equals("")&&!age.equals("")&& !email.equals("")&& !mobileNumber.equals("")&& !address.equals("")&& !house.equals("")&& !community.equals("")&& !gender.equals(""))
            btnUpdate.setEnabled(true);
        else
            btnUpdate.setEnabled(false);
    }
    
    public void setComboBox(String i){
        int x=Integer.parseInt(i);
        cbbAge.setSelectedIndex(x+1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        cbbAge = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        cbbHouse = new javax.swing.JComboBox<>();
        cbbCommunity = new javax.swing.JComboBox<>();
        btnClear1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Add new Patient");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("*Click on row to Delete Patient");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, -1, -1));

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Gender", "Age", "Mobile ", "House", "Community", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 186, 790, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("View Patient");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        jLabel1.setText("View Update&Delete Patient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 48, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 280, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 280, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Mobile Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txtMobileNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        rbtnMale.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbtnMale.setText("Male");
        getContentPane().add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        rbtnFemale.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbtnFemale.setText("Female");
        getContentPane().add(rbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        cbbAge.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cbbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        getContentPane().add(cbbAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Age");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("House");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Community");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 280, -1));

        getContentPane().add(cbbHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 280, -1));

        getContentPane().add(cbbCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 280, -1));

        btnClear1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));

        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        lblId.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        lblId.setText("00");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here
        
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id = model.getValueAt(index,0).toString();
        lblId.setText(id);
        String name = model.getValueAt(index,1).toString();
        txtName.setText(name);
        String email = model.getValueAt(index,2).toString();
        txtEmail.setText(email);
        String gender = model.getValueAt(index,3).toString();
        if(gender.equals("Female")){
            rbtnFemale.isSelected();
        }
        if(gender.equals("Female")){
            rbtnMale.isSelected();
        }
        String age = model.getValueAt(index,4).toString();
        setComboBox(age);
        String mobileNumbder = model.getValueAt(index,5).toString();
        txtMobileNumber.setText(mobileNumbder);

        String house = model.getValueAt(index,6).toString();
        String community = model.getValueAt(index, 7).toString();
        String address = model.getValueAt(index,8).toString();
        txtAddress.setText(address);

        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        
        cbbHouse.removeAllItems();
        cbbHouse.addItem(house);
        
        ArrayList<House> houseList = HouseDao.getAllRecords();
        Iterator<House> houseItr=houseList.iterator();
        while(houseItr.hasNext()){
            House houseObj = houseItr.next();
            if(!houseObj.getName().equals(house))
                cbbHouse.addItem(houseObj.getName());
        }
        
        cbbCommunity.removeAllItems();
        cbbCommunity.addItem(community);
        
        ArrayList<Community> communityList = CommunityDao.getAllRecords();
        Iterator<Community> communityItr=communityList.iterator();
        while(communityItr.hasNext()){
            Community communityObj = communityItr.next();
                if(!communityObj.getName().equals(community))
                cbbCommunity.addItem(communityObj.getName());
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HospitalAdminHomePage in=new HospitalAdminHomePage();
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewUpdateDeletePatient().setVisible(true);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Patient patient = new Patient();
        String id =lblId.getText();
        patient.setId(id);
        patient.setName(txtName.getText());
        patient.setEmail(txtEmail.getText());
        patient.setMobileNumber(txtMobileNumber.getText());
        patient.setAddress(txtAddress.getText());
        patient.setAge((String)cbbAge.getSelectedItem());
        patient.setCommunity((String)cbbCommunity.getSelectedItem());
        patient.setHouse((String)cbbHouse.getSelectedItem());
        String gender="";
        if(rbtnFemale.isSelected()){
            gender="Female";
        }
        if(rbtnMale.isSelected()){
            gender="Male";
        }
        patient.setGender(gender);

        PatientDirectoryDao.update(patient);
        setVisible(false);
        new CreateDeletePatient().setVisible(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = lblId.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Patient?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            PatientDirectoryDao.delete(id);
            setVisible(false);
            new ViewUpdateDeletePatient().setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<Patient> patientList = PatientDirectoryDao.getAllRecords();
        Iterator<Patient> itrPatient = patientList.iterator();
        while(itrPatient.hasNext()){
            Patient patientObj = itrPatient.next();
            dtm.addRow(new Object[]{patientObj.getId(),patientObj.getName(),patientObj.getEmail(),patientObj.getAge(),patientObj.getMobileNumber(),patientObj.getHouse(),patientObj.getCommunity(),patientObj.getAddress()});
        }
        
        ArrayList<Community> communityList = CommunityDao.getAllRecords();
        Iterator<Community> itrCommunity = communityList.iterator();
        while(itrCommunity.hasNext()){
            Community communityObj = itrCommunity.next();
            cbbCommunity.addItem(communityObj.getName());
        }
        
        ArrayList<House> houseList = HouseDao.getAllRecords();
        Iterator<House> itrHouse = houseList.iterator();
        while(itrHouse.hasNext()){
            House hosueObj = itrHouse.next();
            cbbHouse.addItem(hosueObj.getName());
        }
        
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ViewUpdateDeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUpdateDeletePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbAge;
    private javax.swing.JComboBox<String> cbbCommunity;
    private javax.swing.JComboBox<String> cbbHouse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblId;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}