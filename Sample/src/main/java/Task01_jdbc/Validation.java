package Task01_jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet
{
	//Database Connection
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String username = req.getParameter("username");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String email = req.getParameter("email");
		
		ServletConfig context = super.getServletConfig();
		String url = context.getInitParameter("url");
        String dbUser = context.getInitParameter("username");
        String dbPass = context.getInitParameter("password");
			
	
		try(Connection connect = DB_Connection.getConnection(url, dbUser, dbPass)) 
		{
			PreparedStatement ps = connect.prepareStatement("insert into Users01(username, age, gender, email) values(?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, age);
			ps.setString(3, gender);
			ps.setString(4, email);
			
			int row = ps.executeUpdate();
			if (row > 0) 
			{
				out.println("rows affected.. ");	
			}else {
				out.println("rows not affected.. ");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("Not connecting to DB ");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
	
	//Database toConvert JSON
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/json");
		PrintWriter out =res.getWriter();
		
		ServletConfig context = super.getServletConfig();
		String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        
		try {
			Connection con = DB_Connection.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement("select * from Users01;");
			ResultSet row = ps.executeQuery();
			
			out.print("[");
			boolean first = true;
			
			while(row.next())
			{
				if (!first) {
	                out.print(",");
				}
				String line = String.format("{ \"username\" : \"%s\" , \"age\" :\" %s\" , \"gender\" :\" %s\" ,\"email\" : \"%s\"}",
						row.getString("username"),row.getString("age"),row.getString("gender"),row.getString("email"));
				
				out.println(line);
				first = false;
			}
			out.print("] }");
			first = false;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
