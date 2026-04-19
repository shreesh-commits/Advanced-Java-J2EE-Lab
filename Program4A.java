// 4.a Basic hello program of Swing using JFrame and JLabel

import javax.swing.*;
import java.awt.*;

public class Program4A
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Swing Program");

        JLabel l = new JLabel("Hello! VI C, Welcome to Swing Programming");

        l.setBounds(30, 100, 700, 50);
        l.setForeground(Color.BLUE);
        l.setFont(new Font("Arial", Font.PLAIN, 32));

        f.add(l);

        f.setSize(800, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}