package org.example;
import java.awt.*;
import javax.swing.*;

public class Jframe extends JFrame{
    public Jframe(){
        super("Jframe Box");
        setLocation(100,100);
        setSize(300,200);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(50,100,60,70);

        int [] x = {40,60,80};
        int [] y = {60,40,60};
        g.fillPolygon(x,y,3);
    }
}