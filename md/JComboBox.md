# JComboBox
* * *
- JComboBox
    ```java
    String ComboStr[] = {"選項1","選項2","選項3","選項4","選項5"};
    JComboBox jComboBox = new JComboBox(ComboStr); //新增下拉式選單欄
    /*──────────────────────────────────────────*/
    frame.add(jComboBox); //將下拉式選單欄新增到視窗上
    /*──────────────────────────────────────────*/
    jComboBox.setSelectedIndex(int index); //設定被選擇的索引
    jComboBox.getSelectedIndex(); //取得被選擇的索引
    jComboBox.getSelectedItem(); //取得被選擇的項目
    jComboBox.setEditable(boolean flag); //設定是否可編輯(默認不可編輯,開啟編輯的話,可自行輸入值)
    /*──────────────────────────────────────────*/
    component.addItemListener(ItemListener listener)
    component.addActionListener(listener l); //可以加入Listener,選單項目被點擊時發生事件

    ```
    > 不一定要增在frame上,也可以新增在選單或是工具欄等等地方