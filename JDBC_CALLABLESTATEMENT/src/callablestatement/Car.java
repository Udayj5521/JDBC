package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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

			CallableStatement cs = conn.prepareCall(query);
//			cs.setInt(1, 1);
//			cs.setString(2, "Audi R8");
//			cs.setString(3, "Manual");
//			cs.setString(4, "Petrol");
//			cs.setString(5, "6.71 kmpl");
			
//			cs.setInt(1, 2);
//			cs.setString(2, "Mercedes-Benz");
//			cs.setString(3, "Automatic");
//			cs.setString(4, "Petrol");
//			cs.setString(5, "12.65 kmpl");
			
//			cs.setInt(1, 3);
//			cs.setString(2, "Ferrari 488");
//			cs.setString(3, "Automatic");
//			cs.setString(4, "Petrol");
//			cs.setString(5, "8.77 kmpl");
			
//			cs.setInt(1, 4);
//			cs.setString(2, "Lamborghini Huracan");
//			cs.setString(3, "Automatic");
//			cs.setString(4, "Petrol");
//			cs.setString(5, "11.24 kmpl");
			
			cs.setInt(1, 5);
			cs.setString(2, "Ferrari 812");
			cs.setString(3, "Automatic");
			cs.setString(4, "Petrol");
			cs.setString(5, "14.9 kmpl");

			cs.execute();
			System.out.println("Data Inserted");

			conn.close();
			cs.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
