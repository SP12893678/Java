package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import listener.*;
import imageicon.*;

public class Frame extends JFrame {
    
    private static final long serialVersionUID = 1L;


    /*Creat Object----------------------------------------------------------------*/
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("menu1");
    JMenuItem menuitem = new JMenuItem("menuitem1", imageIcon.getImageIcon("../res/image/bao.png", 16, 16));
    JMenu menu_in_menu = new JMenu("menu_in_menu");
    JMenuItem menuitem11 = new JMenuItem("menuitem11", imageIcon.getImageIcon("../res/image/bao.png", 16, 16));
    JMenuItem menuitem12 = new JMenuItem("menuitem12", imageIcon.getImageIcon("../res/image/bao.png", 16, 16));
    JMenuItem menuitem2 = new JMenuItem("menuitem2", imageIcon.getImageIcon("../res/image/bao.png", 16, 16));
    public static JButton Icon_button = new JButton();
    JButton Text_button = new JButton();
    /*Creat Object----------------------------------------------------------------*/

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
        
        menubar.setBackground(Color.WHITE);
        setJMenuBar(menubar);

        menu.setIcon(imageIcon.getImageIcon("../res/image/bao.png", 16, 16));
        menu.setPreferredSize(new Dimension(80, 20));
        menu.setMargin(new Insets(0, 3, 0, 3));
        menu.setFont(new Font("SansSerif", Font.PLAIN, 16));
        menubar.add(menu);

        menuitem.setPreferredSize(new Dimension(200, 25));
        menuitem.setHorizontalTextPosition(SwingConstants.RIGHT);
        menuitem.setMnemonic('Q');
        menuitem.setAccelerator(KeyStroke.getKeyStroke('M', java.awt.Event.CTRL_MASK, false));
        menuitem.setActionCommand("menuitem(ActionCommand)");
        menuitem.addActionListener(new Listener("menuitem"));
        menu.add(menuitem);

        menu.add(menu_in_menu);
        menu_in_menu.add(menuitem11);
        menu_in_menu.add(menuitem12);

        menu.addSeparator();

        menu.add(menuitem2);

        Text_button.setText("Bao");
        Text_button.setFont(new Font("SansSerif", Font.PLAIN, 16));
        Text_button.setForeground(Color.BLUE);
        Text_button.setBounds(5, 5, 100, 105);
        add(Text_button);

        Icon_button.setIcon(imageIcon.getImageIcon("../res/image/bao.png", 96, 105));
        Icon_button.setPressedIcon(imageIcon.getImageIcon("../res/image/pressed_bao.png", 96, 105));
        Icon_button.setDisabledIcon(imageIcon.getImageIcon("../res/image/disabled_bao.png", 96, 105));
        Icon_button.setContentAreaFilled(false);
        Icon_button.setBorderPainted(false);
        Icon_button.setBounds(110, 5, 96, 105);
        Icon_button.addMouseListener(new MouseAdapter() 
        {   
            public void mouseExited(MouseEvent e) 
            {    
                Icon_button.setIcon(imageIcon.getImageIcon("../res/image/bao.png", 96, 105));
            }
            public void mouseEntered(MouseEvent e) 
            {
                Icon_button.setIcon(imageIcon.getImageIcon("../res/image/pressed_bao.png", 96, 105));
            }
        });
        Icon_button.addActionListener(new Listener("button"));
        add(Icon_button);
    }

    public void run()
    {
        setVisible(true);
    }
}