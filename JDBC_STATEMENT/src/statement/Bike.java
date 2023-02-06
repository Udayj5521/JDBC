package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bike {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
//		String query = "Insert into bike values(1,'Kawasaki Ninja H2','998 cc','79.90 Lakh','White')";
//		String query = "Insert into bike values(2,'Suzuki Hayabusa','998 cc','16.41 Lakh','Green')";
//		String query = "Insert into bike values(3,'BMW S 1000 RR','999 cc','20.25 Lakh','Blue')";
//		String query = "Insert into bike values(4,'Ducati Panigale V4','998 cc','27.41 Lakh','Red')";
		String query = "Insert into bike values(5,'Honda CBR1000RR-R','1000 cc','23.11 Lakh','Black')";
		
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
