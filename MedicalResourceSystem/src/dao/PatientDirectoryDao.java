/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
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
        String queryToPatient = "insert into patient(name,email,mobileNumber,password,status,address,house,community,age,gender) values('"+patient.getName()+"','"+patient.getEmail()+"','"+patient.getMobileNumber()+"','"+patient.getPassword()+"','false','"+patient.getAddress()+"','"+patient.getHouse()+"',"+patient.getCommunity()+"','"+patient.getAge()+"','"+patient.getGender()+"')";
        DbOperations.setDataOrDelete(queryToPatient, "New Patient Account Added!");
    }
    
    public static User login(String email,String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user= new User();
                user.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static void delete(String id){
        String query ="delete from patient where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Patient Deleted Successfully!");
    }
    
    public static ArrayList<Patient> getAllRecords(){
        ArrayList<Patient> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from patient");
            while(rs1.next()){
                Patient patient = new Patient();
                patient.setId(rs1.getString("id"));
                patient.setName(rs1.getString("name"));
                patient.setEmail(rs1.getString("email"));
                patient.setGender(rs1.getString("gender"));
                patient.setAge(rs1.getString("age"));
                patient.setMobileNumber(rs1.getString("mobileNumber"));
                patient.setHouse(rs1.getString("house"));
                patient.setCommunity(rs1.getString("community"));
                patient.setAddress(rs1.getString("address"));

                arrayList.add(patient);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Patient> getOneRecord(String id){
        ArrayList<Patient> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from patient where id='"+id+"'");
            while(rs1.next()){
                Patient patient = new Patient();
                patient.setId(rs1.getString("id"));
                patient.setName(rs1.getString("name"));
                patient.setEmail(rs1.getString("email"));
                patient.setGender(rs1.getString("gender"));
                patient.setAge(rs1.getString("age"));
                patient.setMobileNumber(rs1.getString("mobileNumber"));
                patient.setHouse(rs1.getString("house"));
                patient.setCommunity(rs1.getString("community"));
                patient.setAddress(rs1.getString("address"));

                arrayList.add(patient);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
    public static void update(Patient patient){
        String query = "update patient set name='"+patient.getName()+"',email='"+patient.getEmail()+"',gender='"+patient.getGender()+"',age='"+patient.getAge()+"',mobileNumber='"+patient.getMobileNumber()+"',house='"+patient.getHouse()+"',community"+patient.getCommunity()+"',address='"+patient.getAddress()+"' where id='"+patient.getId()+"'";
        DbOperations.setDataOrDelete(query, "Patient Updated Successfully!");
    }
    
    
    
    
}
