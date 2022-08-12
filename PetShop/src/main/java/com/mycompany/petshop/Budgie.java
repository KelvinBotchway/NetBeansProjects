/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author Kelvin
 */
public class Budgie extends Pet
{
    private String colourOfFeathers;
    
    public Budgie(String name, String ownerName, String colourOfFeathers)
    {
        super(name,ownerName);
        
        this.colourOfFeathers=colourOfFeathers;
        
    }
    
    public String getColourOFFeathers()
    {
        return this.colourOfFeathers;
    }
    
}

