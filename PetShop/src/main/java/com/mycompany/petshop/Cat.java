/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author Kelvin
 */

public class Cat extends Pet
{
    private int numberOfTeeth;
    private int lengthOfTail;
    
    public Cat(String name, String ownerName, int numberOfTeeth, int lengthOfTail)
    {
        super(name,ownerName);
        
        this.numberOfTeeth=numberOfTeeth;
        this.lengthOfTail=lengthOfTail;
        
    }

    public int getNumberOfTeeth()
    {
        return this.numberOfTeeth;
    }
    
    public int getLengthOfTail()
    {
        return this.lengthOfTail;
    }
    
}
