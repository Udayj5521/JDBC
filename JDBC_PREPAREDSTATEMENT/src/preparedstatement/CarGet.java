package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarGet {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/supercars";
		String username = "root";
		String password = "root";
		String query = "Select * from car";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = conn.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt(1));
				System.out.println("Brand: " + rs.getString(2));
				System.out.println("GearBox: " + rs.getString(3));
				System.out.println("FuelType: " + rs.getString(4));
				System.out.println("Mileage: " + rs.getString(5));
				System.out.println("---------------------------");
			}
			conn.close();
			ps.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
