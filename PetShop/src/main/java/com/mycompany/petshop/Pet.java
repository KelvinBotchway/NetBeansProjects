/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author Kelvin
 */
public class Pet {
     private String name;
    private String ownerName;
    
    //constructor
    public Pet(String name, String ownerName)
    {
        this.name=name;
        this.ownerName=ownerName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getOwnerName()
    {
        return this.ownerName;
    }
}
