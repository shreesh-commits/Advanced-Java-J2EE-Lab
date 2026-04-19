// 5.d Swing program using JTabbedPane for Cyan Magenta Yellow

import javax.swing.*;
import java.awt.*;

public class Program5D
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Tabbed Pane Colors");

        JTabbedPane tp = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        tp.addTab("Cyan", p1);
        tp.addTab("Magenta", p2);
        tp.addTab("Yellow", p3);

        tp.setBounds(50, 30, 320, 220);

        f.add(tp);

        f.setSize(450, 330);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}