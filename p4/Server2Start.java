import java.io.*;
import java.net.*;
public class Server2Start{
   public static void main(String[] args) throws IOException{
	   ServerSocket ss=new ServerSocket(3001);
	   Server2Work worker=new Server2Work();
	   new Thread(worker).start();
	   boolean working=true;
	   while(working){
		   new Server2User(ss.accept(), worker);
	   }
   }
}