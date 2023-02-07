package preparedstatement.scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Car {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/supercars";
		String username = "root";
		String password = "root";
		String query = "Insert into car values(?,?,?,?,?)";

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Car ID: ");
		int id = s.nextInt();
		
		System.out.println("Enter Brand: ");
		String brand = s.next();
		
		System.out.println("Enter Gearbox: ");
		String gearbox = s.next();
		
		System.out.println("Enter FuelType: ");
		String fueltype = s.next();
		
		System.out.println("Enter Mileage: ");
		String mileage = s.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, brand);
			ps.setString(3, gearbox);
			ps.setString(4, fueltype);
			ps.setString(5, mileage);
			
			ps.execute();
			System.out.println("Data Inserted");

			conn.close();
			ps.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
