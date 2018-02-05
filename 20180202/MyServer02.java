import java.io.*;
import java.net.*;
import java.util.*;

public class MyServer02
{
	public static void main(String[] args)
	{
		ServerSocket servsock = null;
  		Socket clientsock = null;

  		try{

  			servsock = new ServerSocket(6000,300);

  			while(true){
  				clientsock = servsock.accept();
  				System.out.println("接続を受け付けました");

  				InetAddress iaClient = clientsock.getInetAddress();
  				String ipClient = iaClient.toString();
  				System.out.println("クライアントIP "+"ipClient");
  			}
  		}catch(IOException e){
  			System.err.println("サーバーエラーです。");
  			System.exit(1);
  		}
	}
}