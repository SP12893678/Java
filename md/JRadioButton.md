# JRadioButton
* * *
- JRadioButton
    ```java
    ButtonGroup buttonGroup = new ButtonGroup(); //新增按鈕群組
    JRadioButton radioButton = new JRadioButton("選項名稱"); //新增單選按鈕
    JRadioButton radioButton2 = new JRadioButton("選項名稱2");
    /*──────────────────────────────────────────*/
    frame.add(radioButton); //將單選按鈕新增到視窗上
    buttonGroup.add(radioButton); //將單選按鈕綁定在此按鈕群組
    buttonGroup.add(radioButton2);
    radioButton.setText(String text); //設定文字
    radioButton.setFont(Font font); //設定文字字體
    radioButton.setForeground(Color fg); //設定文字顏色
    radioButton.setSelected(boolean b); //設定是否被選擇
    radioButton.isSelected(); //回傳是否被選擇
    radioButton.setEnabled(boolean enable); //設定是否可使用
    radioButton.setIcon(Icon defaultIcon) //設定圖示
    radioButton.setPressedIcon(Icon pressedIcon) //設定被按下圖示
    radioButton.setDisabledIcon(Icon disabledIcon) //設定不可使用圖示
    /*──────────────────────────────────────────*/
    component.addChangeListener(new ChangeListener() //當改變狀態時(被選/取消),則執行事件
    {
        public void stateChanged(ChangeEvent e) 
        {
            //doing somethig...
        }
    });
    ```
    > 不一定要增在frame上,也可以新增在選單或是工具欄等等地方