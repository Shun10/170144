import java.io.*;
import java.net.*;
import java.util.*;
import java.io.PrintWriter;

  public class MyClient04{

  	private static String ipAddr = "172.16.21.56";
  	private static int portNum = 4999;
  	// method
  	// main
  	public static void main (String[] args) {
  		// 変数宣言
  		Socket sock = null;
  
  		// サーバに接続して～する
  		try {
  			// サーバに接続する
  			sock = new Socket(ipAddr,portNum);
  			System.out.println("サーバに接続しました.");
        //文字列を送信する
        PrintWriter output = new PrintWriter(sock.getOutputStream());        
        output.println("170144"+"\r\n"+"Shun10"+"\r\n"+"HELLO"+"\r\n");                     
        output.flush();
        //メッセージ受信
        Scanner input = new Scanner(sock.getInputStream());
        System.out.println("サーバーからのメッセージは「" + input.next() + "」");
        input.close();
        output.close();         
        sock.close();
  		} catch (IOException e) {
  		  System.out.println(e);
  		}
  }
}