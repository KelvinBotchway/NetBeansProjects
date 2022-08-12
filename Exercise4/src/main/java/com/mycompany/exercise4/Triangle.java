/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise4;

/**
 *
 * @author Kelvin
 */
public class Triangle extends GeometricObject
{
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle()
    {
        super();
        sideA=10;
        sideB=10;
        sideC=10;
    }
    
    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled)
    {
        super(color,filled);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    
    public double getSideA()
    {
        return this.sideA;
    }
    
    public void setSideA(double sideA)
    {
        this.sideA=sideA;
    }
    
    public double getSideB()
    {
        return this.sideB;
    }
    
    public void setSideB(double sideB)
    {
        this.sideB=sideB;
    }
    
    public double getSideC()
    {
        return this.sideC;
    }
    
    public void setSideC(double sideC)
    {
        this.sideC=sideC;
    }
    
    @Override
    public double getPerimeter()
    {
        return sideA+sideB+sideC;
    }
    
    public double getArea()
    {
        double s=getPerimeter();
        
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
}