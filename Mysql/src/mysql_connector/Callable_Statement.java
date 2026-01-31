package mysql_connector;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Callable_Statement 
{
	public static Connection getConnection() throws SQLException
	{
		String url ="jdbc:mysql://localhost:3306/test_jdbc";
		String username ="root";
		String password ="nithi";
		
		return DriverManager.getConnection(url, username, password);
	}
	
	public static void selectAll() throws SQLException
	{
		Connection con = getConnection();
		CallableStatement cst = con.prepareCall("{call showAll()}");
		ResultSet rst = cst.executeQuery();
		
		while(rst.next())
		{
			System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getString(3)+" "+rst.getDouble(4));
		}
	}
	
	public static void getById(int emp_id) throws SQLException
	{
		Connection con = getConnection();
		CallableStatement cst = con.prepareCall("{call getById(?)}");
		cst.setInt(1, emp_id);
		ResultSet rst = cst.executeQuery();
		
		rst.next();
		System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getString(3)+" "+rst.getDouble(4));
	}
	
	public static void getName(int emp_id ) throws SQLException
	{
		Connection con = getConnection();
		CallableStatement cst = con.prepareCall("{call getName(?,?)}");
		cst.setInt(1, emp_id);
		cst.registerOutParameter(2, Types.VARCHAR);
		Boolean b = cst.execute();
		
		System.out.println("Name: "+ cst.getString(2));	
		
	}
	
	public static void getLocation() throws SQLException
	{
		Connection con = getConnection();
		String query = "{call getName(?,?)}";
		CallableStatement cst = con.prepareCall(query);
		cst.setString(1, "Anita");
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.execute();
		
		System.out.println("Location: " + cst.getString(2));
	}
	
	public static void main(String[] args) throws SQLException 
	{
		//selectAll();
		//getById(5);
		//getName(4);
		getLocation();

	}

}
