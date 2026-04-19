// 4.c Swing program for Digital Clock and Hour Glass buttons

import javax.swing.*;
import java.awt.event.*;

public class Program4C implements ActionListener
{
    JFrame f;
    JButton b1, b2;
    JLabel l;

    Program4C()
    {
        f = new JFrame("Clock Program");

        b1 = new JButton("Digital Clock");
        b2 = new JButton("Hour Glass");

        l = new JLabel();

        b1.setBounds(70, 50, 150, 40);
        b2.setBounds(250, 50, 150, 40);
        l.setBounds(120, 140, 250, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(l);

        f.setSize(500, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
            l.setText("Digital Clock is pressed");

        if(e.getSource() == b2)
            l.setText("Hour Glass is pressed");
    }

    public static void main(String args[])
    {
        new Program4C();
    }
}