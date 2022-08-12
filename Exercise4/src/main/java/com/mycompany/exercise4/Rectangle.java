/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise4;

/**
 *
 * @author Kelvin
 */
public class Rectangle extends GeometricObject
{
    private double width;
    private double height;
    
    public Rectangle()
    {
        this(10,10);
        
    }
    
    public Rectangle(double width, double height)
    {
        super();
        this.width=width;
        this.height=height;
        
    }
    
    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        
        this.width=width;
        this.height=height;
        
    }
    
    public double getWidth()
    {
        return this.width;
    }
    
    public void setWidth(double width)
    {
        this.width=width;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    
    public void setHeight(double height)
    {
        this.height=height;
    }
    
    @Override
    public double getArea()
    {
        return getHeight()*getWidth();
    }
    
    @Override
    public double getPerimeter()
    {
        return 2*getHeight()+2*getWidth();
    }
    
    
}
