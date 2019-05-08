//--------------------------------------------------------------//
// MyServer.java 2011�~04��15��
//--------------------------------------------------------------//
import java.io.*;
import java.net.*;
import java.util.*;
//--------------------------------------------------------------//
//�{���y�{
//---MyServer  --�D���O��
//-1-main  --�D�{���i�J�I
//-2-go()   --��k  --�ئ�s�u  --���ݽШD�s�u
//     --���o�s�u�᩹�U����
//-3-Process  --�������O --�B�z�{��
//-3.1-Process  --�غc�l --�Ѱ�����I�s --�إ߱���
//-3.2-run()  --��k  --��������
//-3.3-tellApiece() --��k  --�i�D�C�H
//--------------------------------------------------------------//
//MyServer�D���O��
//--------------------------------------------------------------//
public class MyServer{
 
     Vector output;//output
//--------------------------------------------------------------//
//-1-�D�{���i�J�I
//--------------------------------------------------------------//
     public static void main (String args[])
     {
          new MyServer().go();     
     }
//--------------------------------------------------------------//
//-2-�ئ�s�u
//--------------------------------------------------------------//
     public void go() 
     {
          //�إߪ���}�C
          output = new Vector();          
          try
          {
               //����ServerSocket�]�wport:5000
               ServerSocket serverSock = new ServerSocket(8888);  
               while(true)
               {
                    //���ݳs�u���ШD--��y
                    Socket cSocket = serverSock.accept();    
                    //�إ�I/O�޹D
                    PrintStream writer = new PrintStream(cSocket.getOutputStream()); 
                    //���oSocket����X��Ƭy
                    System.out.println(writer); 
                    //����[�JVector
                    output.add(writer);         
                    //�ǤJ�@��Runnable����ä����@�ӷs�������
                    //�إߦ��A���D�����
                    Thread t = new Thread(new Process(cSocket));
                    //�Ұʰ����
                    t.start();   
                    //���o�s�u��ip       
                    System.out.println(cSocket.getLocalSocketAddress()+ "��"+(t.activeCount()-1)+ "�ӳs��");
                    //��������b�u���� //��ܳs�u�H��
               } 
          }
          catch(Exception ex)
          {
               System.out.println("�s������");
          }
     }
//--------------------------------------------------------------//
//-3-Process�B�z�{��
//--------------------------------------------------------------//
public class Process implements Runnable{   
     //�Ȧs��ƪ�Buffered
     BufferedReader reader;  
     //�إߤ@��Socket�ܼ�  
     Socket sock;            
     //----------------------------------------------------------//
     //-3.1-�Ѱ�����I�s---�إ߱���
     //----------------------------------------------------------//
     public Process(Socket cSocket)
     {
          try
          {
               System.out.println("Process new");
               sock = cSocket;
               //���oSocket����J��Ƭy
               InputStreamReader isReader = new InputStreamReader(sock.getInputStream()); 
               reader = new BufferedReader(isReader);
          }
          catch(Exception ex)
          {
               System.out.println("�s������Process");
          } 
     }
     //--------------------------------------------------------------//
     //-3.2-��������
     //--------------------------------------------------------------//
     public void run()
     {
          String message;
          try
          {
               System.out.println("message new");
               //Ū�����
               while ((message = reader.readLine())!=null)
               {  
                    System.out.println("while"); 
                    System.out.println("����"+message);
                    tellApiece(message);
               }
          }
          catch(Exception ex)
          {
               System.out.println("���@�ӳs�����}");
          }
     }
     //--------------------------------------------------------------//
     //-3.3-�i�D�C�H
     //--------------------------------------------------------------//
     public void tellApiece(String message)
     {
          //����iterator�i�H�s�����X�����������    
          Iterator it = output.iterator(); 
          //�V�UŪ������   
          while(it.hasNext())
          {          
               try
               {
                    //�����X�����
                    PrintStream writer = (PrintStream) it.next();  
                    //�L�X
                    writer.println(message); 
                    //��s�Ӧ�y���w�ġC
                    writer.flush();           
               }
               catch(Exception ex)
               {
                    System.out.println("�s������Process");
               }
          }
     }
} 
}
