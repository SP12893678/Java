# GUI
* * *
- JFrame
    ```java
    JFrame frame = new JFrame(); //新增視窗
    /*──────────────────────────────────────────*/
    frame.setSize(Width,Height); //設定視窗大小
    frame.setTitle("Bao Title"); //設定視窗標題
    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("../res/image/icon.png")); //設定設窗圖示
    frame.setResizable(false); //設定視窗可否縮放
    frame.setFocusable(true); //設定可否獲得焦點
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //設定視窗關閉方式
    frame.setLayout(null); //設定排版布局
    Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize(); //取得螢幕大小
    frame.setVisible(false); //設定視窗可否看見
    frame.setBounds(int x, int y, int width, int height); //設定視窗位置、大小
    frame.setLocation(int x,int y); //設定視窗位置
    ```
    > 測試
    
- JMenu
    ```java
    JMenuBar menubar = new JMenuBar(); //新增選單欄
    /*──────────────────────────────────────────*/
    menubar.setBackground(Color.WHITE); //設定選單欄背景顏色
    frame.setJMenuBar(menubar); //將選單欄設定到視窗上
    * * *
    JMenu menu = new JMenu();
    /*──────────────────────────────────────────*/
    menu.setIcon(Icon icon); //設定選單圖示
    menu.setPreferredSize(Dimension preferredSize); //設定選單初始尺寸
    menu.setMargin(Insets margin); //設定選單文字外距
    menu.setFont(Font font); //設定選單文字字體
    menubar.add(menu); //將選單設定到選單欄上
    * * *
    JMenuItem menuitem = new JMenuItem();
    /*──────────────────────────────────────────*/
    menuitem.setPreferredSize(Dimension preferredSize); //設定選單項目初始尺寸
    menuitem.setHorizontalTextPosition(); //設定水平方向文字位置
    menuitem.addActionListener(); //設定選單項目點擊事件
    menu.add(menuitem); //將選單項目設定到選單上
    ```
- JButton
    ```java
    JButton button = new JButton(); //新增按鈕
    /*──────────────────────────────────────────*/
    button.setText(String text); // 設定按鈕文字
    button.setFont(Font font); //設定文字字體
    button.setForeground(Color color); //設定文字顏色
    button.setIcon(Icon icon); //設定按鈕圖示
    button.setPressedIcon(Icon icon); //設定按鈕被按下的圖示
    button.setDisabledIcon(Icon icon); //設定按鈕不可用的圖示
    button.setEnabled(boolean b); //設定按鈕是否可用
    button.setContentAreaFilled(boolean b); //設定是否去背
    button.setBorderPainted(boolean b); //設定是否繪製邊框
    button.addActionListener(ActionListener l); //設定按鈕點擊事件
    button.setVisible(boolean b); //設定按鈕可否看見
    button.setBounds(int x, int y, int width, int height); //設定按鈕位置、大小
    button.setLocation(int x,int y); //設定按鈕位置
    ```