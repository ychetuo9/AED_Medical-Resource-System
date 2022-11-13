/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Hospital;
import model.User;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyanchen
 */
public class HospitalDirectoryDao {
    public static void save(Hospital hospital){
        String query = "insert into hospital(name,community,city) values('"+hospital.getName()+"','"+hospital.getCommunity()+"','"+hospital.getCity()+"')";
        DbOperations.setDataOrDelete(query, "Hospital Added Successfully!");
    }
    
    public static ArrayList<Hospital> getAllRecords(){
        ArrayList<Hospital> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from hospital");
            while(rs.next()){
                Hospital hospital = new Hospital();
                hospital.setId(rs.getString("id"));
                hospital.setName(rs.getString("name"));
                hospital.setCommunity(rs.getString("community"));
                hospital.setCity(rs.getString("city"));
                arrayList.add(hospital);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
     
    }
    
    public static void delete(String id){
        String query ="delete from hospital where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Hospital Deleted Successfully!");
    }
}
