/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Community;

/**
 *
 * @author yanyanchen
 */
public class CommunityDao {
    public static void save(Community community){
        String query = "insert into community(name,city,zipcode,house) values('"+community.getName()+"','"+community.getCity()+"','"+community.getZipcode()+"','"+community.getHouse()+"')";
        DbOperations.setDataOrDelete(query, "Community Added Successfully!");
    }
    
    public static ArrayList<Community> getAllRecords(){
        ArrayList<Community> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from community");
            while(rs.next()){
                Community community = new Community();
                community.setId(rs.getString("id"));
                community.setName(rs.getString("name"));
                community.setZipcode(rs.getString("zipcode"));
                community.setCity(rs.getString("city"));
                community.setHouse(rs.getString("house"));
                arrayList.add(community);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
     
    }
    
    public static void delete(String id){
        String query ="delete from community where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Community Deleted Successfully!");
    }
    
    public static void update(Community community){
        String query = "update community set name='"+community.getName()+"',zipcode='"+community.getZipcode()+"',city='"+community.getCity()+"' where id='"+community.getId()+"'";
        DbOperations.setDataOrDelete(query, "Community Updated Successfully!");
    }
    
    
}
