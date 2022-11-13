/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Doctor;

/**
 *
 * @author yanyanchen
 */
public class DoctorDirectoryDao {
    public static void save(Doctor doctor){
        String query = "insert into user(name,email,mobileNumber,password,status) values('"+doctor.getName()+"','"+doctor.getEmail()+"','"+doctor.getMobileNumber()+"','"+doctor.getPassword()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }
    
    public static Doctor login(String email,String password){
        Doctor doctor = null;
        try{
            ResultSet rs = DbOperations.getData("select *from doctor where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                doctor = new Doctor();
                doctor.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return doctor;
    }
}
