import java.io.*;
 import java.net.*;
 import java.util.*;
  
public class MyServer03{
  	public static void main(String[] args) {
  		byte[] buff = new byte[1024];
  		ServerSocket servsock = null;
  		Socket sock;
  		OutputStream out;
  		InputStream instr;
  		String outstr;
  		int i;
  		Date d;
  		boolean cont = true;
  
  		try{
  			servsock = new ServerSocket(5999,100);
  			while(true)
  			{
  				sock = servsock.accept();

  				System.out.println("kita-");

  				d = new Date();

  					outstr	=	"\n"
   				+	"Hello, this is Shun&Kouta Netclock server."
   				+	"\n"	+	d.toString()	+	"\n"
   				+	"Thank you."	+	"\n";

  				out	= sock.getOutputStream();

  				for(i = 0; i<outstr.length(); i++)
  					out.write((int)	outstr.charAt(i));
  				out.write('\n');
      			
  				instr = sock.getInputStream();
 
  			
  				while(cont){
  					try{
  						int n = instr.read(buff);
  						System.out.write(buff,0,n);
  
  					}catch(Exception e){
  						cont = false;
  					}
  				}
  				
  				sock.close();
  			}
  		}catch(IOException ioe){
  			System.exit(1);
  	}
  }
}