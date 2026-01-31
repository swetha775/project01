package Task01_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

//@WebServlet("/connect")
public class DB_Connection 
{
	
	public static Connection getConnection(String url, String username, String password) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
	}
	
    
	
	
	
//	public void getDetails()
//	{
//		ServletConfig config = super.getServletConfig();
//		//ServletContext context = super.getServletContext();
//		
//		String url = config.getInitParameter("url");
//		String username = config.getInitParameter("username");
//		String password = config.getInitParameter("password");
//		
//		
//	}
//}
//
//class Database
//{
//	public static Connection getConnection(String url, String username, String password) throws SQLException
//	{
//		return DriverManager.getConnection(url, username, password);
//	}
	
}

