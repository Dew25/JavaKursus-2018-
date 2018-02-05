import java.io.*;
import java.net.*;
public class Server1{
  public static void main(String[] args) throws Exception{
     ServerSocket ss=new ServerSocket(3001);
	 boolean working=true;
	 while(working){
 	   Socket sc=ss.accept();
	   PrintWriter pw=new PrintWriter(sc.getOutputStream(), true);
	   BufferedReader br=new BufferedReader(
	     new InputStreamReader(sc.getInputStream()));
	   pw.println("HTTP/1.1 200 OK\n"+
	    "Content-type text/plain\n\nHello from machine Jaagup");
	   /*pw.println("Your name, please: ");
	   String firstname=br.readLine();
	   pw.println("Hello, "+firstname);
	   if(firstname.equals("stop")){working=false;}*/
	   System.out.println(sc);
	   Thread.sleep(2000);
	   sc.close();
	 }
  }
}

//192.168.2.231 : 3001
