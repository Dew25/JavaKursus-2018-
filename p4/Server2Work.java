import java.io.*;
import java.net.*;
import java.util.*;
public class Server2Work implements Runnable{
   List<Server2User> users=new ArrayList<Server2User>();
   boolean running=true;
   public void add(Server2User user){
	   synchronized(users){
		   users.add(user);
		   for(Server2User userToWrite: users){
			 userToWrite.pw.println(user.username+" entered");
		   }
	   }
   }
   public void run(){
	   while(running){
		   try{
			   Thread.sleep(500);
			   synchronized(users){
				   System.out.println(new java.util.Date());
				   for(Server2User user: users){
					   if(user.br.ready()){
						   System.out.println("read "+user.username);
						   //String line=user.br.readLine();
						   //String line="";
						   while(user.br.ready()){
							   char c=(char)user.br.read();
							   if(c=='\n'){
						         System.out.println("readed "+user.username);
						         for(Server2User userToWrite: users){
							       userToWrite.pw.println(
								       user.username+": "+user.linepart);
						         }
                                 user.linepart="";								 
							   } else {
							     user.linepart+=c;
							   }
						   }
					   }
				   }
			   }
		   } catch(Exception e){e.printStackTrace();}
	   }
   }
}