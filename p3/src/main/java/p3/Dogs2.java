package p3;
import java.sql.*;
import java.io.*;
public class Dogs2 {
  public static void main(String[] args) throws Exception{
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Minimum value for lifespan?");
    int value=Integer.parseInt(reader.readLine());
    Connection conn=DriverManager.getConnection(
     "jdbc:mysql://localhost/kursjava?user=kursjava&password=kursjava");
    PreparedStatement st= conn.prepareStatement(
              "SELECT dogbreed, maxlifespan FROM dogbreeds "+
                      "WHERE maxlifespan>?");
    st.setInt(1, value);
    ResultSet rs=st.executeQuery();
    while(rs.next()){
       System.out.println(rs.getString("dogbreed")+" "+
               rs.getInt("maxlifespan"));
    }     
    conn.close();
    //make program to insert one dog
  }    
}
