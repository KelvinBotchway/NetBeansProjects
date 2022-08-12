/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintanalien;

import java.awt.*;
import javax.swing.*;

public class PaintAnAlienInAJframe extends JFrame
{
    public PaintAnAlienInAJframe()
    {
        super("Alien in a JFrame");
        setSize(400, 300);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xabcdef));
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        int[] xs = {60, 110, 110, 104, 93, 85, 73, 66, 60};
       int[] ys = {115, 115, 145, 115, 145, 115, 145, 115, 145};
        
        g.setColor(Color.YELLOW);
        //draw the top of head
        g.fillOval(60, 60, 50, 60);
        //draw the middle of head
        g.fillRect(60, 90, 50, 30);
        //draw the bottom of head
        g.fillPolygon(xs, ys, 6);
        
        g.setColor(Color.BLACK);
        //draw the eyes
        g.fillOval(72, 75, 10, 10);
        g.fillOval(88, 75, 10, 10);
        //draw the mouth
        g.fillOval(75, 90, 20, 10);
    }
    
   
}