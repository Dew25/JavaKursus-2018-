import java.io.*;
import java.net.*;
public class Client1{
  public static void main(String[] args) throws IOException{
     Socket sc=new Socket("192.168.2.231", 3001);
	 BufferedReader br=new BufferedReader(new InputStreamReader(
	   sc.getInputStream()
	 ));
	 System.out.println(br.readLine());
  }
}