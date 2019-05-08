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
     //��ܰϰ�
     JTextArea incoming = new JTextArea(15,50); 
     //��J�ϰ�
     JTextField outgoing = new JTextField(20);     
     JLabel jlmane   = new JLabel("�A���W�r�G");   
     JLabel jlip  = new JLabel("��Jip�G");   
     JTextField jfmane   = new JTextField("�L�W",10);
     JTextField jfip   = new JTextField("127.0.0.1",10);
     JLabel state  = new JLabel("�п�J�A���W�r�ΧA���W�r"); 
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
     //��ܰϰ�-----
     //�]�m�� true�A�h��檺���פj��Ҥ������e�׮ɡA�N����
     incoming.setLineWrap(true);         
     //�]�m�� true�A�h��檺���פj��Ҥ������e�׮ɡA�N�b�����ɡ]�ťա^�B����
     incoming.setWrapStyleWord(true); 
     //���i�s�誺  
     incoming.setEditable(false); 
     //JScrollPane  
     JScrollPane qScroller = new JScrollPane(incoming);
     //�����u��  
     qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
     //�����u��
     qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
     JPanel mainPanel = new JPanel();       
     mainPanel.add(qScroller);
     mainPanel.add(outgoing);
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
     //���A�ϰ�b�U��----
     getContentPane().add(BorderLayout.SOUTH,state);    
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
          state.setText("�����إ�-�s�u���\");
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
                    incoming.append(message+'\n');
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
          //���A
          state.setText("�]�w"+name+":"+ip); 
          //�إ߳s�u----
          EstablishConnection();          
          //�إ߱�����ư����----
          Thread readerThread = new Thread(new IncomingReader());  
          readerThread.start();
          //���U�e�X   
     }
     else if(str.equals("�e�X"))
     {    
          //���i�S��ip�ΰe�X�ť�
          if((ip!=null)&&(outgoing.getText()!=""))    
          {
               try
               {
                    //�e�X���
                    writer.println((name+":"+outgoing.getText())); 
                    //��s�Ӧ�y���w�ġC
                    writer.flush();         
               }
               catch(Exception ex )
               {
                    System.out.println("�e�X��ƥ���");
               }
               //�M����J���
               outgoing.setText("");        
          }
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
               //�M����J���
               outgoing.setText("");        
          }
     }
     else if (str.equals("�x�s�ɮ�"))       
     {               
          try
          {             
               FileWriter f = new FileWriter("log.txt");     
               f.write(incoming.getText());      
               f.close();
               state.setText("�x�s�ɮצ��\");
          }
          catch (IOException e2)
          {
               state.setText("�x�s�ɮץ���");
          }              
     } 
}
}