# JTextComponent
* * *
- JTextField
    ```java
    import javax.swing.JTextField;
    /*──────────────────────────────────────────*/
    JTextField jtextfield = new JTextField();
    /*──────────────────────────────────────────*/
    jtextfield.getText(); //取得輸入欄的文字
    jtextfield.setText(String text); //設定輸入欄的文字
    jtextfield.setFont(Font font); //設定文字字體
    jtextfield.setForeground(Color fg); //設定文字顏色
    jtextfield.setCaretColor(Color c); //設定光標顏色
    jtextfield.setSelectionColor(Color c); //設定選取中文字的背景顏色
    jtextfield.setSelectedTextColor(Color c); //設定選取中文字的顏色
    jtextfield.setDisabledTextColor(Color c); //設定不可用時的文字顏色
    jtextfield.setHorizontalAlignment(int alignment); //設定文字水平對齊方式
    jtextfield.setEditable(boolean b); //設定是否可以編輯
    jtextfield.setEnabled(boolean b); //設定是否可使用
    jtextfield.setSelectionStart(int selectionStart); //設定光標開始位置
    jtextfield.setSelectionEnd(int selectionEnd); //設定光標結束位置
    jtextfield.isFocusOwner(); //判斷此輸入欄是否擁有焦點
    jtextfield.copy(); //複製選取的文本
    jtextfield.cut(); //剪下選取的
    jtextfield.paste(); //貼上複製的內容
    jtextfield.getDocument().addDocumentListener(DocumentListener listener)
    ```

- JTextArea
    ```java
    import javax.swing.JTextArea;
    /*──────────────────────────────────────────*/
    JTextArea jtextarea= new JTextArea();
        // 是否自动换行，默认为 false
    void setLineWrap(boolean wrap)

    // 设置自动换行方式。如果为 true，则将在单词边界（空白）处换行; 如果为 false，则将在字符边界处换行。默认为 false。
    void setWrapStyleWord(boolean word)

    // 获取文本框中的文本
    String getText()

    // 追加文本到文档末尾
    void append(String str)

    // 替换部分文本
    void replaceRange(String str, int start, int end)

    // 设置文本框的 文本、字体 和 字体颜色
    void setText(String text)
    void setFont(Font font)
    void setForeground(Color fg)

    // 获取内容的行数（以换行符计算，满行自动换下一行不算增加行数）
    int getLineCount()

    // 获取指定行（行数从0开始）的行尾（包括换行符）在全文中的偏移量
    int getLineEndOffset(int line)

    // 获取指定偏移量所在的行数（行数从0开始）
    int getLineOfOffset(int offset)
    ```

- JTextArea
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