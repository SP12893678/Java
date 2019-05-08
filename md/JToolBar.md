# JToolBar
* * *
- JToolBar
    ```java
    JToolBar toolBar = new JToolBar(); //新增工具欄
    /*──────────────────────────────────────────*/
    JButton button = new JButton(); //新增按鈕
    JButton button2 = new JButton(); //新增按鈕
    /*──────────────────────────────────────────*/
    frame.add(toolBar); //將工具欄新增到視窗上
    toolBar.add(button); //將按鈕新增工具欄上
    toolBar.addSeparator(); //增加分隔物件
    toolBar.addSeparator((new Dimension(20, 20)); //增加分隔物件(可調大小)
    toolBar.add(button2);
    /*──────────────────────────────────────────*/
    toolBar.setFloatable(boolean b) //設定工具欄是否可以拖動
    toolBar.setOrientation(int orientation) //SwingConstants.HORIZONTAL 或 SwingConstants.VERTICAL
    toolBar.setMargin(Insets m) //設置工具欄的內距
    toolBar.setBorderPainted(boolean b) //設定工具欄是否繪製邊框
    ```
    > 不只按鈕可加入工具欄,Label、JComboBox等等也可以加上