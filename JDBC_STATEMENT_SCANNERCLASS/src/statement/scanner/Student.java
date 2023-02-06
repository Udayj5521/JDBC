package statement.scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = s.nextInt();
		System.out.println("Enter Brand: ");
		String name = s.next();
		System.out.println("Enter Color: ");
		String address = s.next();

		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "root";
		
		String query = "Insert into student values( " + id + "," 
						+ "\'" + name + "\' ,"+
						"\'" + address + "\')";
		
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
