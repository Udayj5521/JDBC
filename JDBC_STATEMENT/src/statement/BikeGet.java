package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BikeGet {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/superbikes";
		String username = "root";
		String password = "root";
		String query = "Select * from bike";
//		String query = "Insert into bike values(2,'Suzuki Hayabusa','998 cc','16.41 Lakh','Green')";
//		String query = "Insert into bike values(3,'BMW S 1000 RR','999 cc','20.25 Lakh','Blue')";
//		String query = "Insert into bike values(4,'Ducati Panigale V4','998 cc','27.41 Lakh','Red')";
//		String query = "Insert into bike values(5,'Honda CBR1000RR-R','1000 cc','23.11 Lakh','Black')";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
//				System.out.println("ID: "+rs.getInt(1));
//				System.out.println("Brand: "+rs.getString(2));
//				System.out.println("CC: "+rs.getString(3));
//				System.out.println("Cost: "+rs.getString(4));
//				System.out.println("Color: "+rs.getString(5));
				System.out.println("----------------------------------");
				System.out.println("ID: "+rs.getInt("id"));
				System.out.println("Brand: "+rs.getString("brand"));
				System.out.println("CC: "+rs.getString("cc"));
				System.out.println("Cost: "+rs.getString("cost"));
				System.out.println("Color: "+rs.getString("color"));
			}
			conn.close();
			st.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
