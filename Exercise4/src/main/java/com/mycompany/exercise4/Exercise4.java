/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercise4;

import java.util.*;

public class Exercise4
{

    public static void main(String[] args) 
    {
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter Color: ");
        String color=input.nextLine();
        
        System.out.print("Enter Side A: ");
        double a=input.nextDouble();
        
        System.out.print("Enter Side B: ");
        double b=input.nextDouble();
        
        System.out.print("Enter Side C: ");
        double c=input.nextDouble();
        
        System.out.print("Is Filled(true/false): ");
        boolean filled=input.nextBoolean();

        GeometricObject myObj1=new Triangle(a,b,c,color,filled);
        
        printAll(myObj1);
        
        
        
       
    }
    
    public static void printAll(GeometricObject object)
    {
        System.out.println("===========================================");
        System.out.println("Area: "+object.getArea());
        System.out.println("Perimeter: "+ object.getPerimeter());
        System.out.println("Color: "+ object.getColor());
        System.out.println("Is Filled: "+ object.isFilled());
        System.out.println("Date Created: "+object.getDateCreated());
        System.out.println("===========================================");
    }
    
    public static boolean compareArea(GeometricObject obj1, GeometricObject obj2)
    {
        return obj1.getArea()==obj2.getArea();
    }
    
    public static boolean comparePerimeter(GeometricObject obj1, GeometricObject obj2)
    {
        return obj1.getPerimeter()==obj2.getPerimeter();
    }
}