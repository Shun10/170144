import java.io.*;
import java.net.*;
import java.util.*;

public class	MyServer01
  {
  	public static void	main(String[]	args)
  	{
  		ServerSocket servsock = null;  
  		try	{
  			servsock = new ServerSocket(6000,300);
  		}
  		catch (IOException	e){
  		System.exit(1);
  	}
  }
}
  