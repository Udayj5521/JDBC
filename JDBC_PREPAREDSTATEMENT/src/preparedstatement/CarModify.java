package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarModify {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/supercars";
		String username = "root";
		String password = "root";
//		String query = "Update car set brand=? where id=?";
//		String query = "Update car set gearbox=? where id=?";
//		String query = "Update car set fueltype=? where id=?";
//		String query = "Update car set mileage=? where id=?";
		String query = "Update car set brand=? where id=?";
		

		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = conn.prepareStatement(query);
/*
			// Index position and Column Values
			ps.setString(1, "Lamborghini");
			// Index position and Primary key -> 1
			ps.setInt(2, 1);
*/		
			
/*
			ps.setString(1, "Manual");
			ps.setInt(2, 2);
*/	
			
/*			
			ps.setString(1, "Diesel");
			ps.setInt(2, 3);
*/		

/*
			ps.setString(1, "12.65 kmpl");
			ps.setInt(2, 4);
*/
			
			ps.setString(1, "Ferrari");
			ps.setInt(2, 5);
			
			ps.execute();
			System.out.println("Updated");

			conn.close();
			ps.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
