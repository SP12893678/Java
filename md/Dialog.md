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
    int alpha = color.getAlpha();
    int r = color.getRed();
    int g = color.getGreen();
    int b = color.getBlue();
    // 獲取顏色的ARGB各個分量值
    ```

- JFileChooser Dialog
    ```java
    import javax.swing.JFileChooser;
    /*──────────────────────────────────────────*/
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(File dir) //new File(String path)設置默認顯示路徑
    chooser.setFileSelectionMode(int mode) //設置文件選擇模式
    chooser.setMultiSelectionEnabled(boolean b) //設置能否同時選擇多個(默認不允許)
    chooser.addChoosableFileFilter(FileFilter filter) //添加可供用戶選擇的文件過濾器添
    chooser.setFileFilter(FileFilter filter)//設置默認使用的文件過濾器
    chooser.setSelectedFile(File file) //設置默認被選擇的文件
    int value = chooser.showOpenDialog(Component parent) //顯示開檔視窗
    int value = chooser.showSaveDialog(Component parent) //顯示存檔視窗
    /*──────────────────────────────────────────*/
    - mode
    JFileChooser.FILES_ONLY: //只能選擇文件
    JFileChooser.DIRECTORIES_ONLY: //只能選擇資料夾
    JFileChooser.FILES_AND_DIRECTORIES: //文件跟資料夾都能選
    - FileFilter
    new FileNameExtensionFilter("zip(*.zip, *.rar)", "zip", "rar");
    new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif");
    - value
    JFileChooser.CANCEL_OPTION: //點擊取消或關閉
    JFileChooser.APPROVE_OPTION: //點擊確認或保存
    JFileChooser.ERROR_OPTION: //出現錯誤
    ```

- JDialog
    ```java
    import javax.swing.JDialog;
    /*──────────────────────────────────────────*/
    JDialog dialog = new JDialog(Dialog owner);
    ```