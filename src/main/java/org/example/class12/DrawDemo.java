package org.example.class12;

import javax.swing.*;
import java.awt.*;

public class DrawDemo {
    public static void main(String[] args) {

        JFrame j=new JFrame();
        j.setSize(1000,1000);
        MyCanvas myCanvas=new MyCanvas();
        j.add(myCanvas);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}

class MyCanvas extends Canvas{

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(350,350,400,400);
    }
}
