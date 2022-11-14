/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.Hospital;

/**
 *
 * @author yanyanchen
 */
public class Tables {
    public static void main(String[] args){
        try{
//            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),password varchar(200),status varchar(20),UNIQUE(email))";
//            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
//            
////            added admin account information
//            String adminDetails = "insert into user(name,email,mobileNumber,password,status) values('Admin','admin@gmail.com','1234567890','admin','true')";
//            DbOperations.setDataOrDelete(adminDetails, "Admin Detials Added Successfully");
////            
//            String hospitalTable="create table hospital(id int AUTO_INCREMENT primary key,name varchar(200),community varchar(200),city varchar(200),UNIQUE(name))";
//            DbOperations.setDataOrDelete(hospitalTable, "Hospital Table Created Successfully");
//            
//////          name city  zipcode house
//            String communityTable="create table community(id int AUTO_INCREMENT primary key,name varchar(200),city varchar(200),zipcode varchar(200),house varchar(200),UNIQUE(name))";
//            DbOperations.setDataOrDelete(communityTable, "Community Table Created Successfully");
////
//            String patientTable="create table patient(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),password varchar(200),status varchar(20),address varchar(200),house varchar(200),community varchar(100),age int,gender varchar(20),UNIQUE(email))";
//            DbOperations.setDataOrDelete(patientTable, "Patient Table Created Successfully");
////
////            
//            String doctorTable="create table doctor(id int AUTO_INCREMENT primary key,name varchar(200),age int,gender varchar(20),email varchar(200),mobileNumber varchar(10),password varchar(200),status varchar(20),hospital varchar(200),specialty varchar(200),position varchar(100),UNIQUE(email))";
//            DbOperations.setDataOrDelete(doctorTable, "Doctor Table Created Successfully");
//
//
//            String cityTable="create table city(id int AUTO_INCREMENT primary key,name varchar(200),UNIQUE(name))";
//            DbOperations.setDataOrDelete(cityTable, "City Table Created Successfully");
//            
//            String houseTable="create table house(id int AUTO_INCREMENT primary key,name varchar(200),community varchar(200),UNIQUE(name))";
//            DbOperations.setDataOrDelete(houseTable, "House Table Created Successfully");

            String encounterTable="create table encounter(id int AUTO_INCREMENT primary key,patientId varchar(20),name varchar(200),gender varchar(20),age varchar(20),email varchar(200),house varchar(200),community varchar(200),heartBeat varchar(200),bloodPressure varchar(200),diagnose varchar(200),doctor varchar(20),specialty varchar(200),positionTitle varchar(200),status varchar(20),date varchar(200))";
            DbOperations.setDataOrDelete(encounterTable, "Encounter Table Created Successfully");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e);
        }
    }
    
}
