package DesignPakage;

public class DBconnection 
{
	private static DBconnection connection = null;
	
	public DBconnection()
	{
		System.out.println("connection is started");
	}
	
	public void connect(User01 user)
	{
		System.out.println(user);
		System.out.println("the given details are saves in DBconnection");
	}
	
	public void connect(User02 user2)
	{
		System.out.println(user2);
		System.out.println("the given de2tails are saves in DBconnection");
	}
	
	public static DBconnection getInstance()
	{
		if (connection == null)
		{
		connection = new DBconnection();
		}
		return connection;
		
	}

}
