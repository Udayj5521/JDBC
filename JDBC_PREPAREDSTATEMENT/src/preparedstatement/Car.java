package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Car {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/supercars";
		String username = "root";
		String password = "root";
		String query = "Insert into car values(?,?,?,?,?)";
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = conn.prepareStatement(query);
//			ps.setInt(1, 1);
//			ps.setString(2, "Audi R8");
//			ps.setString(3, "Manual");
//			ps.setString(4, "Petrol");
//			ps.setString(5, "6.71 kmpl");
			
//			ps.setInt(1, 2);
//			ps.setString(2, "Mercedes-Benz");
//			ps.setString(3, "Automatic");
//			ps.setString(4, "Petrol");
//			ps.setString(5, "12.65 kmpl");
			
//			ps.setInt(1, 3);
//			ps.setString(2, "Ferrari 488");
//			ps.setString(3, "Automatic");
//			ps.setString(4, "Petrol");
//			ps.setString(5, "8.77 kmpl");
			
//			ps.setInt(1, 4);
//			ps.setString(2, "Lamborghini Huracan");
//			ps.setString(3, "Automatic");
//			ps.setString(4, "Petrol");
//			ps.setString(5, "11.24 kmpl");
			
			ps.setInt(1, 5);
			ps.setString(2, "Ferrari 812");
			ps.setString(3, "Automatic");
			ps.setString(4, "Petrol");
			ps.setString(5, "14.9 kmpl");

			ps.execute();
			System.out.println("Data Inserted");

			conn.close();
			ps.close();

			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
