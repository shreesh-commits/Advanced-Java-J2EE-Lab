// 5.a Swing program using JList to display selected country on console

import javax.swing.*;
import javax.swing.event.*;

public class Program5A implements ListSelectionListener
{
    JFrame f;
    JList<String> list;

    Program5A()
    {
        f = new JFrame("Country List");

        String countries[] =
        {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan",
            "Africa", "Greenland", "Singapore"
        };

        list = new JList<String>(countries);

        list.setBounds(100, 30, 200, 180);
        list.addListSelectionListener(this);

        f.add(list);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent e)
    {
        System.out.println("Selected Country : " + list.getSelectedValue());
    }

    public static void main(String args[])
    {
        new Program5A();
    }
}