package statement.scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bike {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = s.nextInt();
		System.out.println("Enter Brand: ");
		String brand = s.next();
		System.out.println("Enter CC: ");
		String cc = s.next();
		System.out.println("Enter Cost: ");
		String cost = s.next();
		System.out.println("Enter Color: ");
		String color = s.next();
		
		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
		
//		Note: Inserting character value to the table, it should be in a single quote. Therefore, to store this
//		"name" value to the query we have to convert this variable as name
//		 name = "\'" + name + "\'";
		
		
		String query = "Insert into bike values( " + id + "," 
						+ "\'" + brand + "\' ,"+
						"\'" + cc + "\' ,"+
						"\'" + cost + "\' ,"+
						"\'" + color + "\')";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();

			st.execute(query);

			conn.close();
			st.close();
			System.out.println("Data Inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
