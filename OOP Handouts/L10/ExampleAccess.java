import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleAccess {
	
	// enter your own account name, password, and database here
	static String account = "...";
	static String password = "...";
	static String server = "mysql-user.stanford.edu";
	static String database = "...";

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection
				( "jdbc:mysql://" + server, account ,password);
			
			Statement stmt = con.createStatement();
			stmt.executeQuery("USE " + database);
			ResultSet rs = stmt.executeQuery("SELECT * FROM metropolises");
			
			rs.absolute(3);
			System.out.println(rs.getString("metropolis"));
//			while(rs.next()) {
//				String s = rs.getString("metropolis");
//				int i = rs.getInt("population");
//				System.out.println(s + "\t" + i);
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			  

	}

}
