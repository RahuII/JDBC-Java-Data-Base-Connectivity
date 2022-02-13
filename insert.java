import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class insert {

  public static void main(String[] args) {
  try
  {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //sun.jdbc.odbc.jdbcOdbcDriver
    Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107138","mef190570107138");
    
    // jdbc:odbc:DB2018
    PreparedStatement pst =cn.prepareStatement("select * from employe where empdpt=?");
    
    pst.setString(1, "CE");
    ResultSet rs = pst.executeQuery();
    
    while(rs.next())
    {
      System.out.println(rs.getString(1) + "\t " +rs.getString(2) + "\t " + rs.getString(3)+ "\t" + rs.getString(4));
    }

    System.out.println("*****************************");
    
    
    pst.setString(1, "IT");
    rs = pst.executeQuery();
    
    while(rs.next())
    {
      System.out.println(rs.getString(1) + "\t " +rs.getString(2) + "\t " + rs.getString(3) + "\t" + rs.getString(4));
    }
    PreparedStatement pstInsert = cn.prepareStatement("INSERT INTO employe VALUES(?,?,?,?)");
    
    pstInsert.setInt(1,12);
    pstInsert.setString(2, "Kunal");
    pstInsert.setString(3, "IT");
    pstInsert.setString(4, "40000");
    pstInsert.executeUpdate();
    
    pstInsert.setInt(1,13);
    pstInsert.setString(2, "Abhi");
    pstInsert.setString(3, "CE");
    pstInsert.setString(4, "50000");
    pstInsert.executeUpdate();
    
    pstInsert.setInt(1,14);
    pstInsert.setString(2, "Sunil");
    pstInsert.setString(3, "IT");
    pstInsert.setString(4, "35000");
    pstInsert.executeUpdate();
    
    pstInsert.setInt(1,15);
    pstInsert.setString(2, "Rajveer");
    pstInsert.setString(3, "IT");
    pstInsert.setString(4, "45000");
    pstInsert.executeUpdate();
    
    pstInsert.setInt(1,16);
    pstInsert.setString(2, "Raj");
    pstInsert.setString(3, "IT");
    pstInsert.setString(4, "55000");
    pstInsert.executeUpdate();
    
    
    cn.close();
    rs.close();
    pst.close();
  } catch (Exception e) {
    e.printStackTrace();
  }
  
  }

}