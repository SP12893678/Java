//--------------------------------------------------------------//
// MyClient.java 2011�~04��15��
//--------------------------------------------------------------//
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
//--------------------------------------------------------------//
//�{���y�{
//---MyClient   --�D���O��
//-1-main()   --�D�{���i�J�I
//-2-MyClient()   --   --�]�w�Ϋŧi  
//-3-EstablishConnection() --��k   --�إ߳s�u
//-4-class IncomingReader --�������O  --�������
//-5-actionPerformed()  --��k   --���U���ʧ@ 
//--------------------------------------------------------------//
//MyClient�D���O��
//--------------------------------------------------------------//
public class MyClient extends JFrame implements ActionListener{  
     //�ŧi��
     //�]�w�W�l��ip
     String name,ip="";       
     BufferedReader  reader;           
     PrintStream  writer;
     //�إ�Socket�ܼ� 
     Socket sock;
     JLabel jlmane   = new JLabel("�A���W�r�G");   
     JLabel jlip  = new JLabel("��Jip�G");   
     JTextField jfmane   = new JTextField("�L�W",10);
     JTextField jfip   = new JTextField("127.0.0.1",10);
     MenuBar mBar = new MenuBar();      
     //File
     Menu mFile = new Menu("�ɮ�");
     //Save 
     MenuItem mFileSave=new MenuItem("�x�s�ɮ�");
     JButton test = new JButton("����"); 
//--------------------------------------------------------------//
//-1-�D�{���i�J�I
//--------------------------------------------------------------//
     public static void main(String[] args)
     {
          MyClient client = new MyClient(); 
     }
//--------------------------------------------------------------//
//-2-�]�w�Ϋŧi��������
//--------------------------------------------------------------//
MyClient ()
{ 
     //�]�w�Ϋŧi�������� 
     //�إߵ���JFrame
     super("�h�J�s�uClient��");          
     //�Ψө�mane��ip--�]�w�ϰ�
     JPanel maneipPanel  = new JPanel();   
     //�بӳ]�w���� 
     JButton setmaneip = new JButton("�s�u�]�w");
     //���U�]�w
     setmaneip.addActionListener(this);
     //�[�J��JPanel
     maneipPanel.add(jlmane);
     //�W�r
     maneipPanel.add(jfmane);         
     maneipPanel.add(jlip);
     //��l
     maneipPanel.add(jfip); 
     //�]�w
     maneipPanel.add(setmaneip); 
     //�ƪ�BorderLayout�]�w�ϰ�b�W��----  
     getContentPane().add(BorderLayout.NORTH,maneipPanel);  
     //JButton("�e�X")
     JButton sendButton = new JButton("�e�X");
     //���U
     sendButton.addActionListener(this);
     test.addActionListener(this);   
     JPanel mainPanel = new JPanel();       
     mainPanel.add(sendButton);
     mainPanel.add(test);
     //��ܰϰ�b����------
     getContentPane().add(BorderLayout.CENTER,mainPanel);  
     //Menu�ƥ�
     mFileSave.addActionListener(this); 
     //�[�JMenuItem  
     mFile.add(mFileSave);  
     //�[�JMenu
     mBar.add(mFile);
     //MenuBar
     setMenuBar(mBar);   
     setSize(600,450);
     setVisible(true);
     //���} 
     addWindowListener(new WindowAdapter()      
     {
          public void windowClosing(WindowEvent e)
          {
               System.out.println("���}��ѫ�");
               System.exit(0);
          }
     });
}
 
//--------------------------------------------------------------//
//-3-�إ߳s�u
//--------------------------------------------------------------//
private void EstablishConnection()
{
     try
     {
          //�ШD�إ߳s�u
          sock = new Socket(ip,8888);      
          //�إ�I/O��Ƭy
          InputStreamReader streamReader =  new InputStreamReader(sock.getInputStream());   
          //���oSocket����J��Ƭy
          //��J�Ȧs��
          reader = new BufferedReader(streamReader);    
          //���oSocket����X��Ƭy
          writer = new PrintStream(sock.getOutputStream());
          //�s�u���\
          System.out.println("�����إ�-�s�u���\");    
     }
     catch(IOException ex )
     {
          System.out.println("�إ߳s�u����");
     }
}
//--------------------------------------------------------------//
//-4-�������
//--------------------------------------------------------------//
public class IncomingReader implements Runnable{
     public void run()
     {
          String message;
          try
          {
               while ((message = reader.readLine()) != null)
               {

               }
          }
          catch(Exception ex )
          {
               ex.printStackTrace();
          }
     }
} 
//--------------------------------------------------------------//
//-5-���U���ʧ@
//--------------------------------------------------------------//
public void actionPerformed(ActionEvent e){
     String str=e.getActionCommand();   
     //���U�]�w
     if(str.equals("�s�u�]�w"))
     {
          //�]�w�W�r
          name = jfmane.getText();
          //�]�wip�A���{���ثe�L�@��
          ip  = jfip.getText(); 
          //�إ߳s�u----
          EstablishConnection();          
          //�إ߱�����ư����----
          Thread readerThread = new Thread(new IncomingReader());  
          readerThread.start();
          //���U�e�X   
     }
     else if(str.equals("����"))
     {    
          //���i�S��ip�ΰe�X�ť�
          if((ip!=null))    
          {
               try
               {
                    //�e�X���
                    writer.println("true"); 
                    //��s�Ӧ�y���w�ġC
                    writer.flush();         
               }
               catch(Exception ex )
               {
                    System.out.println("�e�X��ƥ���");
               }       
          }
     }
     else if (str.equals("�x�s�ɮ�"))       
     {               
          try
          {              
               FileWriter f = new FileWriter("log.txt");     
               f.write(1);      
               f.close();
          }
          catch (IOException e2)
          {

          }              
     } 
}
}