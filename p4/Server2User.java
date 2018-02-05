import java.io.*;
import java.net.*;
public class Server2User implements Runnable{
   PrintWriter pw;
   BufferedReader br;
   String username;
   Server2Work worker;
   Socket sc;
   String linepart="";
   public Server2User(Socket sc, Server2Work worker){
	   this.sc=sc;
       this.worker=worker; 
       new Thread(this).start();	  
   }
   public void run(){
	   try{
		   pw=new PrintWriter(sc.getOutputStream(), true);
		   br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
		   pw.println("Your name, please: ");
		   username=br.readLine();
		   worker.add(this);
	   } catch(Exception ex){ex.printStackTrace();}
   }
}