package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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

			CallableStatement cs = conn.prepareCall(query);
			
			// Index position and Primary key -> 1
//			cs.setInt(1, 1);
			
//			cs.setInt(1, 2);
			
//			cs.setInt(1, 3);
			
//			cs.setInt(1, 4);
			
			cs.setInt(1, 5);
			
			cs.execute();
			System.out.println("Deleted");

			conn.close();
			cs.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
