# Dialog
* * *
- JOptionPane
    ```java
    import javax.swing.JOptionPane;
    /*──────────────────────────────────────────*/
    - showMessageDialog //消息對話框
        JOptionPane.showMessageDialog(Component parentComponent, Object message) //(String title, int messageType, Icon icon)

    - showConfirmDialog //確認對話框
        int answer = JOptionPane.showConfirmDialog(Component parentComponent, Object message) //(String title, int optionType, int messageType, Icon icon)
        //(int answer = [0:Yes] [1:No] [2:Cancel])

    - showInputDialog //輸入對話框
        String input = JOptionPane.showInputDialog(Component parentComponent, Object message) //(String title, int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue)
        //使用 Object[] selectionValues則會變成下拉式選單 (Object[] selectionValues = {};大括弧中可放字串或圖示)

    - showOptionDialog //選項對話框
        int option = showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue)
        //(int option = [-1:關閉])
    /*──────────────────────────────────────────*/
        - parentComponent
            //null或是frame名稱(對話框的父級視窗，決定對話框顯示的位置，對話框的顯示會盡量緊靠視窗的中心，如果傳null，則顯示在螢幕中心)

        - messageType
            JOptionPane.PLAIN_MESSAGE //簡單(不使用圖示)
            JOptionPane.INFORMATION_MESSAGE //資訊(默認)
            JOptionPane.QUESTION_MESSAGE //問題
            JOptionPane.WARNING_MESSAGE //警告
            JOptionPane.ERROR_MESSAGE //錯誤

        - optionType 
            JOptionPane.DEFAULT_OPTION //只有確定
            JOptionPane.YES_NO_OPTION //有是和否
            JOptionPane.OK_CANCEL_OPTION //有確定和取消
            JOptionPane.YES_NO_CANCEL_OPTION //有是、否和取消
    ```

- JColorChooser Dialog
    ```java
    import javax.swing.JColorChooser;
    /*──────────────────────────────────────────*/
    Color color = JColorChooser.showDialog (Component parentComponent, String title, Color initialColor);
    //(Color color 若點擊取消或關閉則回傳null)
    //(Color initialColor 初始選擇顏色,若填null,則默認非透明白色);
    ```

- JFileChooser Dialog
    ```java
    import javax.swing.JFileChooser;
    /*──────────────────────────────────────────*/
    JFileChooser chooser = new JFileChooser(String path);
    ```

- JDialog
    ```java
    
    /*──────────────────────────────────────────*/
    
    ```