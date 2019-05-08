# JPopupMenu
* * *
- JPopupMenu
    ```java
    JPopupMenu popupMenu = new JPopupMenu(); //新增彈出式選單欄
    /*──────────────────────────────────────────*/
    JMenuItem menuitem1 = new JMenuItem(); //新增選單項目
    JMenu menu2 = new JMenu(); //新增選單
    JMenuItem menuitem21 = new JMenuItem();
    JMenuItem menuitem22 = new JMenuItem();
    /*──────────────────────────────────────────*/
    frame.add(popupMenu); //將彈出式選單欄新增到視窗上
    popupMenu.add(menuitem1); //將選單項目加入到彈出式選單欄
    popupMenu.addSeparator(); //可以加分隔線
    popupMenu.add(menu2); //可以在彈出式選單欄加入選單
    menu2.add(menuitem21);
    menu2.add(menuitem22);
    /*──────────────────────────────────────────*/
    component.addActionListener(listener l); //可以加入Listener,選單項目被點擊時發生事件
    public void mouseReleased(MouseEvent e)
    { 
        checkPopup(e);
    }
    private void checkPopup(MouseEvent me)
    {
        if(e.isMetaDown()) //檢測滑鼠右鍵單擊
        {
	      popupMenu.show(e.getComponent(), e.getX(), e.getY()); //秀出彈出式選單欄在設定的座標
	    }
	}
    ```
    > 