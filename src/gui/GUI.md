* * *
- JFrame
    ```java
    - setVisible(false); //設定視窗可否看見
    - setSize(Width,Height); //設定視窗大小
    - setTitle("Bao Title"); //設定視窗標題
    - setIconImage(Toolkit.getDefaultToolkit().getImage("../res/image/icon.png")); //設定設窗圖示
    - setResizable(false); //設定視窗可否縮放
    - setFocusable(true); //設定可否獲得焦點
    - setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //設定視窗關閉方式
    - setLayout(null); //設定排版布局
    - Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize(); //取得螢幕大小
    - setLocation((int) (ScreenSize.getWidth() / 2) - Width / 2, (int) (ScreenSize.getHeight() / 2) - Height / 2);
    ```
- JButton
    ```java
    JButton button = new JButton(); //新增按鈕
    button.setText(String text); // 設定按鈕文字
    button.setIcon(Icon icon); //設定按鈕圖示
    button.setContentAreaFilled(Boolean boolean); //設定是否去背
    button.setBorderPainted(Boolean boolean); //設定是否去邊框
    button.setBounds(int x, int y, int width, int height); //設定位置
    ```