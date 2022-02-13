import java.sql.*;  


class jdbcv {  
public static void main(String args[])throws Exception{  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con = DriverManager.getConnection(  
		"jdbc:oracle:thin:@192.168.12.82:1521:mefgi", "mef190570107138", "mef190570107153"
);  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}