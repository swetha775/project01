package Tasks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Application 
{
	public static void CreateTable() throws SQLException
	{
		Accounts acc = new Accounts();
		Connection con = DB_Connection.getConnection();
		Statement std = con.createStatement();
		String query = "insert into Account_Details values ("+acc.getAcc_No()+",'"+acc.getAcc_holderName()+"',"+acc.getAcc_Bal()+","+acc.getMobile_No()+")";
		int rows = std.executeUpdate(query);
		System.out.println(rows+" rows affected");
		
	}
	
	public static void deposite() throws SQLException
	{
		
		Connection con = DB_Connection.getConnection();
		Statement std = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Deposite API...");
		System.out.println("Sender AccountNo :");
		long sender_No = scan.nextLong();
		
		System.out.println("Receiver AccountNo :");
		long receiver_No = scan.nextLong();
		String Query1 = "select * from Account_Details where acc_No = "+sender_No;
		ResultSet rst = std.executeQuery(Query1);
		rst.next();
		System.out.println(rst.getInt("acc_No")+" "+rst.getString("acc_holderName")+" "+rst.getDouble("acc_Bal")+" "+rst.getInt("mobile_No"));
		
		System.out.println("Enter the deposite_amount: ");
		Double amount = scan.nextDouble();
		
		String query2 = "update Account_Details set acc_Bal = acc_Bal - "+amount+ "where acc_No = "+sender_No+";";
		String query3 = "update Account_Details set acc_Bal = acc_Bal + "+amount+" where acc_No = "+receiver_No+";";
		
		
		std.addBatch(query2);
		std.addBatch(query3);

		int arr[] = std.executeBatch();
		
		for(int a : arr)
		{
			System.out.println(a + "rows affected");
		}

	}

	public static void main(String[] args) throws SQLException
	{
		//CreateTable();
		deposite();

	}

}
