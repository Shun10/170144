import java.io.*;
import java.net.*;
import java.util.*;
 
public class MyClient02{

	private static String ipAddr = "172.16.21.47";
  	private static int portNum = 5999;

 	public static void main(String[] args){
 		byte[] buff = new byte[1024];
 		Socket sock = null;
 		InputStream is = null;
 		OutputStream os = null;
 		boolean	count= true;
 
try {
 	sock = new Socket(ipAddr,portNum);
 	is = sock.getInputStream();
 	os = sock.getOutputStream();
 
 	int n = is.read(buff);
 	System.out.write(buff,0,n);
 
 	String msg = "Hello";
 	
 	is.close();
 
 	}	catch (IOException e){
 		System.err.println("ネットワークエラー");
 		System.exit(1);
 		}
 	}
}