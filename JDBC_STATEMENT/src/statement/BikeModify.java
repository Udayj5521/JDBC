package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BikeModify {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
//		String query = "Update bike set brand ='BMW S 1000 RR' where id=1";
//		String query = "Update bike set cc = '1000 cc' where id=2";
//		String query = "Update bike set cost= '30 Lakh' where id=3 ";
//		String query = "Update bike set color = 'Green' where id=4";
		String query = "update bike set brand = 'Kawasaki' where id =5";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();

			st.execute(query);

			conn.close();
			st.close();
			System.out.println("Updated");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
