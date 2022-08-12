/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise4;

/**
 *
 * @author Kelvin
 */
public class Circle extends GeometricObject
{
    private double radius;
    
    public Circle()
            
    {
        this(10.5);
    }
    
    public Circle(double radius)
    {
        super();
        this.radius=radius;
    }
    
    public Circle(double radius, String color, boolean filled)
    {
        super(color,filled);
        
        this.radius=radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius=radius; 
    }
    
    public double getDiameter()
    {
        return this.radius*2;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
    public double getPerimeter()
    {
        return Math.PI*getDiameter();
    }
}
