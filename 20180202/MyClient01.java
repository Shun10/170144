import java.io.*;
import java.net.*;
import java.util.*;

public class MyClient01
{
	public static void main(String[] args)
	{
		byte[] buff = new byte[1024];
		Socket readsock = null;
		InputStream instr = null;
		boolean count = true;

		try{
			readsock = new Socket(args[0],Integer.parseInt(args[1]));
			instr = readsock.getInputStream();
			while(count){
				try{
					int n = instr.read(buff);
					System.out.write(buff, 0, n);
				}catch (Exception e){
					count = false;
				}
			}
			instr.close();		
		}catch(Exception e){
			System.err.println("ネットワークエラーです。");
				System.exit(1);
		}
	}
}