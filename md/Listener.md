# Listener
* * *
- ActionListener
    ```java
    import java.awt.event.ActionListener;
    import java.awt.event.ActionEvent;
    /*──────────────────────────────────────────*/
    component.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) //執行動作
        {
                                
        }
    });

    /*──────────────────────────────────────────*/
    public class Listener implements ActionListener {

        public Listener() //可以不寫，括號裡可以按自己需求操作
        {

        }

        public void actionPerformed(ActionEvent e) 
        {
            
        }
    }
    component.addActionListener(new Listener());
    //依照上方方式可以不用新增一堆addActionListener,配合e.getActionCommand()與switch;可以節省許多[component.setActionCommand(String s);記得要設定]
    ```

- MouseListener
    ```java
    import java.awt.event.MouseAdapter;
    import java.awt.event.MouseEvent;
    /*──────────────────────────────────────────*/
    component.addMouseListener(new MouseAdapter()
    {
        public void mouseEntered(MouseEvent e) //滑鼠進入
        {

        }
        public void mouseExited(MouseEvent e) //滑鼠離開
        {

        }
        public void mousePressed(MouseEvent e) //滑鼠按下
        {
       
        }
        public void mouseReleased(MouseEvent e) //滑鼠釋放
        {

        }
        public void mouseClicked(MouseEvent e) //滑鼠點擊
        {

        }
    });
    ```

- MouseMotionListener
    ```java
    import java.awt.event.MouseMotionAdapter;
    import java.awt.event.MouseEvent;
    /*──────────────────────────────────────────*/
    component.addMouseMotionListener(new MouseMotionListener() 
    {
        public void mouseMoved(MouseEvent e) //滑鼠移動
        {

        }
        public void mouseDragged(MouseEvent e) //滑鼠拖曳
        {

        }
    });
    ```
- KeyListener
    ```java
    import java.awt.event.KeyListener;
    import java.awt.event.KeyEvent;
    /*──────────────────────────────────────────*/
    component.addKeyListener(new KeyListener() 
    {
        public void keyPressed(KeyEvent e) 
        {
            
        }
        public void keyTyped(KeyEvent e) 
        {

        }
        public void keyReleased(KeyEvent e) 
        {

        }
    });
    //在使用這3個function時可以加入int keyCode = e.getKeyCode(); 、 char KeyChar = e.getKeyChar() 來取得被使用的按鍵值或符號
    ```
    
