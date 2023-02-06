package statement.sqlquery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BikeCostMINOrMAX {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
//		String query = "Select id, brand, cc, cost, color from bike Where cost = (Select MIN(cost) FROM bike)";
		String query = "Select id, brand, cc, cost, color from bike Where cost = (Select MAX(cost) FROM bike)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("Brand: "+rs.getString(2));
				System.out.println("CC: "+rs.getString(3));
				System.out.println("Cost: "+rs.getString(4));
				System.out.println("Color: "+rs.getString(5));
			}
			conn.close();
			st.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
