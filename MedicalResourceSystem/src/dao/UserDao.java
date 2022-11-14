/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author yanyanchen
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,mobileNumber,password,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getPassword()+"','false')";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval!");
    }
    
    public static User login(String email,String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    public static ArrayList<User> getAllRecords(String email){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs1 = DbOperations.getData("select *from user where email like '%"+email+"%'");
            while(rs1.next()){
                User user = new User();
                user.setId(rs1.getInt("id"));
                user.setName(rs1.getString("name"));
                user.setEmail(rs1.getString("email"));
                user.setMobileNumber(rs1.getString("mobileNumber"));
                user.setStatus(rs1.getString("status"));
                arrayList.add(user);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void changeStatus(String email,String status){
        String query = "update user set status='"+status+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "Status Changed Successfully!");
    }
    
}
