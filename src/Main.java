import javax.swing.UIManager;

import gui.*;
import imageicon.*;
import sound.*;

public class Main
{
    public static void main(String[] args) 
    {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        Frame frame = new Frame(600, 600);
        frame.CreatObject();
        frame.run();
    }
}