package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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

			CallableStatement cs = conn.prepareCall(query);
/*
			// Index position and Column Values
			cs.setString(1, "Lamborghini");
			// Index position and Primary key -> 1
			cs.setInt(2, 1);
*/		
			
/*
			cs.setString(1, "Manual");
			cs.setInt(2, 2);
*/	
			
/*			
			cs.setString(1, "Diesel");
			cs.setInt(2, 3);
*/		

/*
			cs.setString(1, "12.65 kmpl");
			cs.setInt(2, 4);
*/
			
			cs.setString(1, "Ferrari");
			cs.setInt(2, 5);
			
			cs.execute();
			System.out.println("Updated");

			conn.close();
			cs.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
