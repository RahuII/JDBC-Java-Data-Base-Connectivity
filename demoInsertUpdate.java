import java.sql.*;

public class demoInsertUpdate {

  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi", "mef190570107138",
          "mef190570107138");

      // try to search data using department
      PreparedStatement pst = cn.prepareStatement("select * from employe where empdpt=?");

      pst.setString(1, "CE");
      ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        System.out
            .println(rs.getString(1) + "\t " + rs.getString(2) + "\t " + rs.getString(3) + "\t" + rs.getString(4));
      }

      // Insert data in dataBase

      PreparedStatement pstInsert = cn.prepareStatement("INSERT INTO employe VALUES(?,?,?,?)");

      pstInsert.setInt(1, 12);
      pstInsert.setString(2, "Kunal");
      pstInsert.setString(3, "IT");
      pstInsert.setString(4, "40000");
      pstInsert.executeUpdate();

      cn.close();
      rs.close();
      pst.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}