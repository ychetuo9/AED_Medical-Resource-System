/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.House;

/**
 *
 * @author yanyanchen
 */
public class HouseDao {
    public static void save(House house){
        String query = "insert into house(name,community) values('"+house.getName()+"')";
        DbOperations.setDataOrDelete(query, "House Added Successfully!");
    }
    
    public static ArrayList<House> getAllRecords(){
        ArrayList<House> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from house");
            while(rs.next()){
                House house = new House();
                house.setId(rs.getString("id"));
                house.setName(rs.getString("name"));
                house.setCommunity(rs.getString("community"));
                arrayList.add(house);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from house where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "House Deleted Successfully!");
    }
    
    public static void update(House house){
        String query = "update house set name='"+house.getName()+"',community='"+house.getCommunity()+"' where id='"+house.getId()+"'";
        DbOperations.setDataOrDelete(query, "House Updated Successfully!");
    }
   
    
}
