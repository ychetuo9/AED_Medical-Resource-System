/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yanyanchen
 */
public class City {
    String id;
    String name;
    ArrayList<Community> arraylist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Community> getArraylist() {
        return arraylist;
    }

    public void setArraylist(ArrayList<Community> arraylist) {
        this.arraylist = arraylist;
    }
    
}
