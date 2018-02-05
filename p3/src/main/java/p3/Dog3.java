package p3;
import java.sql.*;
import java.io.*;
public class Dog3 {
  public static void main(String[] args) throws Exception{
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Name of dog?");
    String dogname=reader.readLine();
    System.out.println("Breed of dog?");
    String dogbreed=reader.readLine();
    Connection conn=DriverManager.getConnection(
     "jdbc:mysql://localhost/kursjava?user=kursjava&password=kursjava");
    PreparedStatement st= conn.prepareStatement(
              "INSERT INTO dogs VALUES(DEFAULT, ?, ?)");
    st.setString(1, dogname);
    st.setString(2, dogbreed);
    st.executeUpdate();
    conn.close();
    //make program to insert one dog
    //show all dogs
    //show count dogs for each breed
    
  }    
}
