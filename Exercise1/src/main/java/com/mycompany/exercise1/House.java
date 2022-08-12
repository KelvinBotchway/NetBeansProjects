/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise1;

/**
 *
 * @author Kelvin
 */
import javax.swing.*;
import java.awt.*;

public class House extends JFrame {
    public House(){
        super("House in a JFrame");
        setSize(500,250);
        setLocation(866,100);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.green);
        g.drawLine(0,145,45,120);
        g.drawLine(45,120,80,135);
        g.drawLine(230,135,310,145);
        g.drawLine(320,145,400,125);
        g.fillOval(255,50,120,50);


        g.setColor(Color.black);
        g.drawRect(80,100,150,120);
        g.drawRect(100,120,30,30);
        g.drawRect(180,120,30,30);
        g.drawRect(145,170,25,50);

        g.setColor(Color.darkGray);
        g.fillRect(310,100,10,120);
        g.drawRect(310,100,10,120);


          //g.setColor(Color.green);
        int[]x = {80,150,230};
        int[]y = {100,40,100};
        g.drawPolygon(x,y,3);

  
    }
}
