import java.io.PrintWriter;
 import java.net.ServerSocket;
 import java.net.Socket;
 import java.util.Scanner;   

 public class MyClient03{

     public static void main(String[] args) {
         try{
             ServerSocket server = new ServerSocket(6000, 5);
             while(true){
                 System.out.println("サーバーは稼働しています。");
                 Socket sock = server.accept();
                 Scanner input = new Scanner(sock.getInputStream());      
                 System.out.println("クライアントから送られてきたメッセージは「" + input.next() + "」です");  
                 PrintWriter output = new PrintWriter(sock.getOutputStream());
                 output.println("こんにちは！こちらはサーバーです！");
                 output.close();
                 sock.close();
             }
         } catch (Exception e){
             System.out.println(e);
         }
     }
 }