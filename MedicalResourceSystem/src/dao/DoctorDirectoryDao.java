/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doctor;
import model.User;

/**
 *
 * @author yanyanchen
 */
public class DoctorDirectoryDao {
    
    public static void save(Doctor doctor){
        String query = "insert into user(name,email,mobileNumber,password,status) values('"+doctor.getName()+"','"+doctor.getEmail()+"','"+doctor.getMobileNumber()+"','"+doctor.getPassword()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
        String queryToDoctor = "insert into doctor(name,email,mobileNumber,password,status,hospital,position,specialty,age,gender) values('"+doctor.getName()+"','"+doctor.getEmail()+"','"+doctor.getMobileNumber()+"','"+doctor.getPassword()+"','false','"+doctor.getHospital()+"','"+doctor.getPositionTitle()+"','"+doctor.getSpecialty()+"','"+doctor.getAge()+"','"+doctor.getGender()+"')";
        DbOperations.setDataOrDelete(queryToDoctor, "New Doctor Account Added!");
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
    
    public static void delete(String id){
        String query ="delete from doctor where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Doctor Deleted Successfully!");
    }
    
    public static ArrayList<Doctor> getAllRecords(){
        ArrayList<Doctor> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from doctor");
            while(rs1.next()){
                Doctor doctor = new Doctor();
                doctor.setId(rs1.getString("id"));
                doctor.setName(rs1.getString("name"));
                doctor.setEmail(rs1.getString("email"));
                doctor.setGender(rs1.getString("gender"));
                doctor.setAge(rs1.getString("age"));
                doctor.setMobileNumber(rs1.getString("mobileNumber"));
                doctor.setHospital(rs1.getString("hospital"));
                doctor.setPositionTitle(rs1.getString("position"));
                doctor.setSpecialty(rs1.getString("specialty"));

                arrayList.add(doctor);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
     
    }
    
    public static void update(Doctor doctor){
        String query = "update doctor set name='"+doctor.getName()+"',email='"+doctor.getEmail()+"',gender='"+doctor.getGender()+"',age='"+doctor.getAge()+"',mobileNumber='"+doctor.getMobileNumber()+"',hospital='"+doctor.getHospital()+"',position='"+doctor.getPositionTitle()+"',specialty='"+doctor.getSpecialty()+"' where id='"+doctor.getId()+"'";
        DbOperations.setDataOrDelete(query, "House Updated Successfully!");
    }
    
    
}
