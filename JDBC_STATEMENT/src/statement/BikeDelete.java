package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BikeDelete {
public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
//		String query = "Delete from bike where id=1";
//		String query = "Delete from bike where id=2";
//		String query = "Delete from bike where id=3";
//		String query = "Delete from bike where id=4";
		String query = "Delete from bike where id=5";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();

			st.execute(query);

			conn.close();
			st.close();
			System.out.println("Deleted");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}


}
