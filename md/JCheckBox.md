# JCheckBox
* * *
- JCheckBox
    ```java
    JCheckBox checkBox = new JCheckBox("選項名稱"); //新增複選框
    /*──────────────────────────────────────────*/
    frame.add(checkBox); //將複選框新增到視窗上
    checkBox.setText(String text); //設定文字
    checkBox.setFont(Font font); //設定文字字體
    checkBox.setForeground(Color fg); //設定文字顏色
    checkBox.setSelected(boolean b); //設定是否被選擇
    checkBox.isSelected(); //回傳是否被選擇
    checkBox.setEnabled(boolean enable); //設定是否可使用
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