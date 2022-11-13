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
        String query = "insert into community(name,city,zipcode,address) values('"+community.getName()+"','"+community.getCity()+"','"+community.getZipcode()+"','"+community.getAddress()+")";
        DbOperations.setDataOrDelete(query, "Community Added Successfully!");
    }
    
    public static ArrayList<Community> getAllRecords(){
        ArrayList<Community> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from community");
            while(rs.next()){
                Community community = new Community();
                community.setId("id");
                community.setName("name");
                community.setZipcode("zipcode");
                community.setCity("city");
                community.setAddress("address");
                arrayList.add(community);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
     
    }
    
    public static void delete(String name){
        String query ="delete from community where name='"+name+"'";
        DbOperations.setDataOrDelete(query, "Community Deleted Successfully!");
    }
}
