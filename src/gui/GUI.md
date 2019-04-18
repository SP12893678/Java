# GUI
* * *
- JFrame
    ```java
    JFrame frame = new JFrame(); //新增視窗
    /*──────────────────────────────────────────*/
    frame.setSize(int width,int height); //設定視窗大小
    frame.setTitle(String s); //設定視窗標題
    frame.setIconImage(Image image); //設定設窗圖示
    frame.setResizable(boolean b); //設定視窗可否縮放
    frame.setFocusable(boolean b); //設定可否獲得焦點
    frame.setDefaultCloseOperation(int operation); //設定視窗關閉方式
    frame.setLayout(LayoutManager manager); //設定排版布局
    frame.setVisible(boolean b); //設定視窗可否看見
    frame.setBounds(int x, int y, int width, int height); //設定視窗位置、大小
    frame.setLocation(int x,int y); //設定視窗位置
    ```
    > 當在該class使用extends JFrame時，可以省略新增視窗(一切有frame可不必多打)，若要額外開心視窗則必須按照上述規則或是再新增一個class(extends JFrame)

- JMenu
    ```java
    JMenuBar menubar = new JMenuBar(); //新增選單欄
    /*──────────────────────────────────────────*/
    menubar.setBackground(Color color); //設定選單欄背景顏色
    frame.setJMenuBar(menubar); //將選單欄設定到視窗上
    
    JMenu menu = new JMenu();
    /*──────────────────────────────────────────*/
    menu.setIcon(Icon icon); //設定選單圖示
    menu.setPreferredSize(Dimension preferredSize); //設定選單初始尺寸
    menu.setMargin(Insets margin); //設定選單文字外距
    menu.setFont(Font font); //設定選單文字字體
    menu.addSeparator(); //在選單裡新增分隔線
    menubar.add(menu); //將選單設定到選單欄上
    
    JMenuItem menuitem = new JMenuItem();
    /*──────────────────────────────────────────*/
    menuitem.setPreferredSize(Dimension preferredSize); //設定選單項目初始尺寸
    menuitem.setHorizontalTextPosition(int textPosition); //設定水平方向文字位置
    menuitem.setAccelerator(KeyStroke keyStroke); //設定鍵盤快捷鍵，使其點被點選
    menuitem.setMnemonic(char mnemonic); //設定鍵盤快捷鍵，使其點被點選
    menuitem.setActionCommand(String s); //設定動作名稱(用法在下方)
    String s = e.getActionCommand(); //透過此方法可取得當前的動作名稱
    menuitem.addActionListener(ActionListener listener); //設定選單項目點擊事件
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
    button.addActionListener(ActionListener listener); //設定按鈕點擊事件
    button.setVisible(boolean b); //設定按鈕可否看見
    button.setBounds(int x, int y, int width, int height); //設定按鈕位置、大小
    button.setLocation(int x,int y); //設定按鈕位置
    ```
- JLabel
    ```java
    JLabel label = new JLabel(); //新增標籤
    /*──────────────────────────────────────────*/
    label.setText(String text); // 設定按鈕文字
    label.setFont(Font font); //設定文字字體
    label.setForeground(Color color); //設定文字顏色
    label.setIcon(Icon icon); //設定按鈕圖示
    label.setHorizontalTextPosition(int textPosition) //設定水平方向文字位置
    label.setVerticalTextPosition(int textPosition) //設定垂直方向文字位置
    label.setToolTipText(String text) //設定提示文字(滑鼠移到上方)
    label.setIconTextGap(int iconTextGap) //設定圖片和文字之間的間距
    ```