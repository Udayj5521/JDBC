package statement.sqlquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BikeCount {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
		String query = "SELECT COUNT(*) FROM bike";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				System.out.println("Number of Bikes: "+rs.getInt(1));
			}
			conn.close();
			st.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
