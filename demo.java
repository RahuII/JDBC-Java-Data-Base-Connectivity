import java.sql.*;

public class demo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:Oracle:thin:@119.160.199.94:1521:mefgi","mef190570107138","mef190570107138");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("Select * from Student");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			rs.close();
			st.close();
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
