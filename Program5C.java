// 5.c Swing program using JList to display capital of selected country

import javax.swing.*;
import javax.swing.event.*;

public class Program5C implements ListSelectionListener
{
    JFrame f;
    JList<String> list;

    String countries[] =
    {
        "USA", "India", "Vietnam", "Canada", "Denmark",
        "France", "Great Britain", "Japan",
        "Africa", "Greenland", "Singapore"
    };

    Program5C()
    {
        f = new JFrame("Country Capitals");

        list = new JList<String>(countries);

        list.setBounds(100, 30, 200, 180);
        list.addListSelectionListener(this);

        f.add(list);

        f.setSize(420, 320);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent e)
    {
        String c = list.getSelectedValue();

        if(c.equals("USA"))
            System.out.println("Capital : Washington D.C.");
        else if(c.equals("India"))
            System.out.println("Capital : New Delhi");
        else if(c.equals("Vietnam"))
            System.out.println("Capital : Hanoi");
        else if(c.equals("Canada"))
            System.out.println("Capital : Ottawa");
        else if(c.equals("Denmark"))
            System.out.println("Capital : Copenhagen");
        else if(c.equals("France"))
            System.out.println("Capital : Paris");
        else if(c.equals("Great Britain"))
            System.out.println("Capital : London");
        else if(c.equals("Japan"))
            System.out.println("Capital : Tokyo");
        else if(c.equals("Africa"))
            System.out.println("Capital : No single capital");
        else if(c.equals("Greenland"))
            System.out.println("Capital : Nuuk");
        else if(c.equals("Singapore"))
            System.out.println("Capital : Singapore");
    }

    public static void main(String args[])
    {
        new Program5C();
    }
}