/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author yanyanchen
 */
public class Tables {
    public static void main(String[] args){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),password varchar(200),status varchar(20),UNIQUE(email))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            
//            added admin account information
            String adminDetails = "insert into user(name,email,mobileNumber,password,status) values('Admin','admin@gmail.com','1234567890','admin','true')";
            DbOperations.setDataOrDelete(adminDetails, "Admin Detials Added Successfully");
//            
            String hospitalTable="create table hospital(id int AUTO_INCREMENT primary key,name varchar(200),community varchar(200),city varchar(200),UNIQUE(name))";
            DbOperations.setDataOrDelete(hospitalTable, "Hospital Table Created Successfully");

//          name city address zipcode
            String communityTable="create table community(id int AUTO_INCREMENT primary key,name varchar(200),city varchar(200),zipcode varchar(200),address varchar(200),UNIQUE(name))";
            DbOperations.setDataOrDelete(communityTable, "Community Table Created Successfully");
            
            


        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e);
        }
    }
    
}
