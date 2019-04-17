package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

import gui.*;
public class Listener implements ActionListener {

    JFrame frame = new JFrame();
    String type;
    public Listener(String type) 
    {
        this.type = type;
    }

    public Listener(String type,JFrame frame) 
    {
        this.type = type;
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) 
    {
        switch(type)
        {
            case "button":
                System.out.println("Pressed the button");
                Frame.Icon_button.setEnabled(false);
                break;
            case "menuitem":
                System.out.println("Pressed the menuitem");
                break;
            default:
                break;
        }
    }
}