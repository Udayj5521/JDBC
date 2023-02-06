package tablecreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "root";
		String table = "Create table student " + "(id INTEGER not NULL, " + "name VARCHAR(45), "
						+ "address VARCHAR(45), " + " PRIMARY KEY (id))";

		String query = "Insert into student values (1, 'Dinga', 'Bangalore')";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();
			st.executeUpdate(table);
			System.out.println("Created table in Database");

			st.execute(query);

			conn.close();
			st.close();
			System.out.println("Data Inserted");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

	}
}
