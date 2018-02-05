package p3;
import java.sql.*;
public class Dogs1 {
  public static void main(String[] args) throws Exception{
     //Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection(
     "jdbc:mysql://localhost/kursjava?user=kursjava&password=kursjava");
    PreparedStatement st= conn.prepareStatement(
              "SELECT dogbreed, maxlifespan FROM dogbreeds");
    ResultSet rs=st.executeQuery();
    while(rs.next()){
       System.out.println(rs.getString("dogbreed")+" "+
               rs.getInt("maxlifespan"));
    }     
    conn.close();
  }    
}
