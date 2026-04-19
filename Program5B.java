// 5.b Swing program using JTabbedPane for RED BLUE GREEN

import javax.swing.*;
import java.awt.*;

public class Program5B
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Tabbed Pane");

        JTabbedPane tp = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.RED);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.GREEN);

        tp.addTab("RED", p1);
        tp.addTab("BLUE", p2);
        tp.addTab("GREEN", p3);

        tp.setBounds(50, 30, 300, 200);

        f.add(tp);

        f.setSize(420, 320);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}