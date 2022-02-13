
import java.sql.*;

public class jdbc {

  public static void main(String[] args)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver loaded: \n");
      //sun.jdbc.odbc.JdbcOdbcDriver
      Connection cn = DriverManager.getConnection
          ("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
              "mef190570107138","mef190570107138");
      System.out.println("Connection established: \n");
      
      Statement st = cn.createStatement();
      ResultSet rs = st.executeQuery("Select * from Student");
        
      while(rs.next()) {
        System.out.println(rs.getString(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
        
      }
      rs.close();
      st.close();
      cn.close();
        
    } 
    catch (ClassNotFoundException e) {
          System.out.println("Driver not loaded: \n");
      }
      catch (SQLException e) {
          System.out.println("connection not established: \n");
      }

  }

}