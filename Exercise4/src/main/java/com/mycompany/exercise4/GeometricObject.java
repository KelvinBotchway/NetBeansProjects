/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise4;

import java.util.Date;

/**
 *
 * @author Kelvin
 */
public abstract class GeometricObject 
{
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    protected GeometricObject()
    {
        this.dateCreated=new Date();
                
    }
    
    protected GeometricObject(String color, boolean filled)
    {
        this();
        this.color=color;
        this.filled=filled;
        
    }
    
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    
    public boolean isFilled()
    {
        return this.filled;
    }
    
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    
    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ",\n" +
"    @Override\n" +
"    public String toString() {\n" +
"        return \"GeometricObject{\" + \"color=\" + color + \", filled=\" + fi dateCreated=" + dateCreated + '}';
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
}
