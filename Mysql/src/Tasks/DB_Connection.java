package Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	public static Connection getConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/test_jdbc";
		String username = "root";
		String password = "nithi";
		
		return DriverManager.getConnection(url, username, password);
	}

}
