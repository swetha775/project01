package Tasks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Video_command 
{
	public static void addVideo() throws SQLException
	{
		Connection con = DB_Connection.getConnection();
		Statement std = con.createStatement();
		int rows = std.executeUpdate("insert into video (video_name,likes,Views) values ('friends vlog',300,600)");
		System.out.println(rows +" rows affected");
		
	}
	
	public static void videoId_toget_commands() throws SQLException
	{
		Connection con = DB_Connection.getConnection();
		Statement std = con.createStatement();
		ResultSet  res = std.executeQuery("select v.video_name,c.comments from video v inner join junction_table j on v.v_id = j.video_id inner join command c on c.c_id = j.command_id where v.v_id = 3 ;");
		while (res.next())
		{
		System.out.println(res.getString(1)+" -  "+res.getString(2));
		}
	}
	
	public static void max_views() throws SQLException
	{
		Connection con = DB_Connection.getConnection();
		Statement std = con.createStatement();
		ResultSet  res = std.executeQuery("select video_name from video where Views in (Select max(views) from video);");
		while (res.next())
		{
		System.out.println(res.getString(1));
		}
	}
	
	public static void addCommand() throws SQLException
	{
		Connection con = DB_Connection.getConnection();
		Statement std = con.createStatement();
		int  rows = std.executeUpdate("insert into junction_table (video_id,command_id) values (5,4);");
		System.out.println(rows +" rows affected");
	}

	public static void main(String[] args) throws SQLException
	{
		//addVideo();
		//videoId_toget_commands();
		max_views();
		//addCommand();

	}

}
