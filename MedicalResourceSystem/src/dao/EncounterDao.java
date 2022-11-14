/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Encounter;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyanchen
 */
public class EncounterDao {
//            String encounterTable="create table encounter(id int AUTO_INCREMENT primary key,patientId varchar(20),name varchar(200),gender varchar(20),age varchar(20),email varchar(200),house varchar(200),community varchar(200),heartBeat varchar(200),bloodPressure varchar(200),diagnose varchar(200),doctor varchar(20),specialty varchar(200),positionTitle varchar(200),status varchar(20))";

    public static void book(Encounter encounter){
//                                                                                                                                                                                                                                                 patientId,name,gender,age,email,house,community,heartBeat,bloodPressure,diagnose,doctor,specialty,positionTitle
        String query = "insert into encounter(patientId,name,gender,age,email,house,community,heartBeat,bloodPressure,diagnose,doctor,specialty,positionTitle,status,date) values('"+encounter.getPatientId()+"','"+encounter.getName()+"','"+encounter.getGender()+"','"+encounter.getAge()+"','"+encounter.getEmail()+"','"+encounter.getHouse()+"','"+encounter.getCommunity()+"','"+encounter.getHeartBeat()+"','"+encounter.getBloodPressure()+"','"+encounter.getDiagnose()+"','"+encounter.getDoctor()+"','"+encounter.getSpecialty()+"','"+encounter.getPositionTitle()+"','false','"+encounter.getDate()+"')";
        DbOperations.setDataOrDelete(query, "Encounter Added Successfully!");
    }
    
    
    
    public static ArrayList<Encounter> getAllRecords(String patientId){
        ArrayList<Encounter> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from encounter where patientId='"+patientId+"'");
            while(rs1.next()){
                Encounter encounter = new Encounter();
                encounter.setId(rs1.getString("id"));
                encounter.setPatientId(rs1.getString("patientId"));
                encounter.setName(rs1.getString("name"));
                encounter.setEmail(rs1.getString("email"));
                encounter.setGender(rs1.getString("gender"));
                encounter.setAge(rs1.getString("age"));
                encounter.setEmail(rs1.getString("email"));
                encounter.setHouse(rs1.getString("house"));
                encounter.setCommunity(rs1.getString("community"));
                encounter.setHeartBeat(rs1.getString("heartBeat"));
                encounter.setBloodPressure(rs1.getString("bloodPressure"));
                encounter.setDiagnose(rs1.getString("diagnose"));
                encounter.setDoctor(rs1.getString("doctor"));
                encounter.setSpecialty(rs1.getString("specialty"));
                encounter.setPositionTitle(rs1.getString("positionTitle"));
                encounter.setStatus(rs1.getString("status"));
                encounter.setDate(rs1.getString("date"));

                arrayList.add(encounter);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    
            
    public static ArrayList<Encounter> getAllRecord(){
        ArrayList<Encounter> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from encounter");
            while(rs1.next()){
                Encounter encounter = new Encounter();
                encounter.setId(rs1.getString("id"));
                encounter.setPatientId(rs1.getString("patientId"));
                encounter.setName(rs1.getString("name"));
                encounter.setEmail(rs1.getString("email"));
                encounter.setGender(rs1.getString("gender"));
                encounter.setAge(rs1.getString("age"));
                encounter.setHouse(rs1.getString("house"));
                encounter.setCommunity(rs1.getString("community"));
                encounter.setHeartBeat(rs1.getString("heartBeat"));
                encounter.setBloodPressure(rs1.getString("bloodPressure"));
                encounter.setDiagnose(rs1.getString("diagnose"));
                encounter.setDoctor(rs1.getString("doctor"));
                encounter.setSpecialty(rs1.getString("specialty"));
                encounter.setPositionTitle(rs1.getString("positionTitle"));
                encounter.setStatus(rs1.getString("status"));
                encounter.setDate(rs1.getString("date"));

                arrayList.add(encounter);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void changeStatus(String id,String status){
        String query = "update encounter set status='"+status+"' where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Status Changed Successfully!");
    }
    
    public static void save(Encounter encounter){   
        int id=Integer.parseInt(encounter.getId());
        String query = "update encounter set patientId='"+encounter.getPatientId()+"',name='"+encounter.getName()+"',email='"+encounter.getEmail()+"',gender='"+encounter.getGender()+"',age='"+encounter.getAge()+"',house='"+encounter.getHouse()+"',community='"+encounter.getCommunity()+"',doctor='"+encounter.getDoctor()+"',specialty='"+encounter.getSpecialty()+"',positionTitle='"+encounter.getPositionTitle()+"',heartBeat='"+encounter.getHeartBeat()+"',bloodPressure='"+encounter.getBloodPressure()+"',diagnose='"+encounter.getDiagnose()+"' where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Diagnose Result Saved Successfully!");
    }
}
