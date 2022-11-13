/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.City;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyanchen
 */
public class CityDao {
    public static void save(City city){
        String query = "insert into city(name) values('"+city.getName()+"')";
        DbOperations.setDataOrDelete(query, "City Added Successfully!");
    }
    
    public static ArrayList<City> getAllRecords(){
        ArrayList<City> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from city");
            while(rs.next()){
                City city = new City();
                city.setId(rs.getString("id"));
                city.setName(rs.getString("name"));
                arrayList.add(city);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
     
    }
    
    public static void delete(String id){
        String query ="delete from city where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "City Deleted Successfully!");
    }
}
