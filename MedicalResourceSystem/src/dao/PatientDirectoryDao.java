/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Patient;
import model.User;

/**
 *
 * @author yanyanchen
 */
public class PatientDirectoryDao {
    public static void save(Patient patient){
        String query = "insert into user(name,email,mobileNumber,password,status) values('"+patient.getName()+"','"+patient.getEmail()+"','"+patient.getMobileNumber()+"','"+patient.getPassword()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }
    
    public static Patient login(String email,String password){
        Patient patient = null;
        try{
            ResultSet rs = DbOperations.getData("select *from patient where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                patient = new Patient();
                patient.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return patient;
    }
}
