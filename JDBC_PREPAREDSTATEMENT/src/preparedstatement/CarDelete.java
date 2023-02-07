package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDelete {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/supercars";
		String username = "root";
		String password = "root";
		String query = "Delete from car where id =?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = conn.prepareStatement(query);
			
			// Index position and Primary key -> 1
//			ps.setInt(1, 1);
			
//			ps.setInt(1, 2);
			
//			ps.setInt(1, 3);
			
//			ps.setInt(1, 4);
			
			ps.setInt(1, 5);
			
			ps.execute();
			System.out.println("Deleted");

			conn.close();
			ps.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
