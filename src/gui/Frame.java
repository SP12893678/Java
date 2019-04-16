package gui;

import javax.swing.*;
import java.awt.*;

import imageicon.*;

public class Frame extends JFrame {
    
    private static final long serialVersionUID = 1L;
    public Frame(int Width,int Height)
    {
        super();
        setVisible(false);
        setSize(Width,Height);
        setTitle("Bao Title");
        setIconImage(Toolkit.getDefaultToolkit().getImage("../res/image/icon.png"));
        setResizable(false);
        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) (ScreenSize.getWidth() / 2) - Width / 2, (int) (ScreenSize.getHeight() / 2) - Height / 2);
    }

    public void CreatObject()
    {
        JButton Text_button = new JButton();
        Text_button.setText("Bao");
        Text_button.setBounds(5, 5, 100, 105);
        add(Text_button);

        JButton Icon_button = new JButton();
        Icon_button.setIcon(imageIcon.getImageIcon("../res/image/bao.png", 96, 105));
        Icon_button.setContentAreaFilled(false);
        Icon_button.setBorderPainted(false);
        Icon_button.setBounds(110, 5, 96, 105);
        add(Icon_button);
    }

    public void run()
    {
        setVisible(true);
    }
}