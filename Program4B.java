// 4.b Swing program using JButton and ActionListener

import javax.swing.*;
import java.awt.event.*;

public class Program4B implements ActionListener
{
    JFrame f;
    JButton b1, b2;
    JLabel l;

    Program4B()
    {
        f = new JFrame("Button Program");

        b1 = new JButton("Srilanka");
        b2 = new JButton("India");
        l = new JLabel();

        b1.setBounds(100, 50, 120, 40);
        b2.setBounds(250, 50, 120, 40);
        l.setBounds(130, 130, 250, 30);

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
            l.setText("Srilanka is pressed");

        if(e.getSource() == b2)
            l.setText("India is pressed");
    }

    public static void main(String args[])
    {
        new Program4B();
    }
}