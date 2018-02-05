import java.io.*;
import java.net.*;
import java.util.*;
  
  public class  MyServer04{

   	private static int portNum = 5000;
  	public static void main (String[] args) {

  		ServerSocket servSock = null;
  		Socket clientSock = null;
  		OutputStream os = null;
  		PrintWriter pw = null;
  
  		try {
  
  			servSock = new ServerSocket(portNum, 30);
  
  			while (true) {
  				clientSock = servSock.accept();
  				System.out.println("接続を受付ました.");
  
  				InetAddress iaClient = clientSock.getInetAddress();

  				String ipClient = iaClient.toString();
  				System.out.println("クライアントIP: "+ipClient);

  				os = clientSock.getOutputStream();
  				pw = new PrintWriter(os);
  
  				pw.println("HELLO");
  				pw.flush();		
  			}
  		} catch (IOException e) {
  			System.err.println("サーバエラー");
  			System.exit(1);
  	}
  }
}