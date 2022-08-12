/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.petshop;

/**
 *
 * @author Kelvin
 */
public class PetShop {

     public static void main(String[] args) 
    {
        Pet[] pets= new Pet[4];
        
        pets[0]=new Cat("Tom", "Jane", 10,20);
        pets[1]=new Budgie("Jerry", "Ama", "Red");
        pets[2]=new Budgie("John", "Kevin", "Blue");
        pets[3]=new Cat("Tiger", "Will", 20, 50);
        
        printPetDetails(pets);
        
        
        
    }
    
    public static void printPetDetails(Pet[] pets)
    {
        for (Pet pet : pets) 
        {
            System.out.println(pet.getName());
            System.out.println(pet.getOwnerName());
            System.out.println();
        }
    }
}
