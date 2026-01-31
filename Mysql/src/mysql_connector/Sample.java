package mysql_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class Student 
{

	String emp_name;
	String location; 
	Double salary;
	
	public Student( String emp_name, String location, Double salary) 
	{
		super();
		this.emp_name = emp_name;
		this.location = location;
		this.salary = salary;
	}
	
	
	public String getEmp_name() {
		return emp_name;
	}
	public String getLocation() {
		return location;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}

public class Sample 
{
	//Connections
	public static Connection connection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/test_jdbc";
		String userName = "root";
		String password = "nithi";
		
		return DriverManager.getConnection(url, userName, password);
	}
	
	//Select
	public static void selectAll() throws SQLException
	{
		Connection con = connection();
		Statement std = con .createStatement();
		String query = "Select * from employee";
		ResultSet rst = std.executeQuery(query);
		System.out.println("Fetched Records: ");
		while(rst.next()) 
		{
		System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+ rst.getString(3)+" "+rst.getDouble(4));		}
	}
	
	
	//Insertion without parameter
	public static void insertion() throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter the User_name :");
		String emp_name = scan.next();
		
		System.out.println("Enter the User_loc :");
		String emp_loc = scan.next();
		
		System.out.println("Enter the User_sal :");
		Double emp_sal = scan.nextDouble();
		
		String query = "insert into employee (emp_name,location , salary) values ('"+emp_name+"','"+emp_loc+"',"+emp_sal+")";
		String quer = "insert into employee (emp_name,location , salary) values ('gopal','bihar' , 55000.00)";
		int rst = std.executeUpdate(query);
		System.out.println(rst+" row affected");
	}
	
	//Insertion with parameter
	public static void insert_para(String emp_name,String location,Double salary) throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String query = "insert into employee (emp_name,location , salary) values ('"+emp_name+"','"+location+"',"+salary+")";
		int rst = std.executeUpdate(query);
		System.out.println(rst+" row affected");
	}
	
	//Update
	public static void updation(int emp_id ,String location) throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String query = "update employee set location = 'coimbatore' where emp_id = 3"; //without parameter
		String query1 = "update employee set location ='"+location+" 'where emp_id= "+emp_id+";";  //with parameter
		int row = std.executeUpdate(query1);
		System.out.println(row +" rows affected.");
	}
	
	//Delete
	public static void deletion(String emp_name) throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String query = "delete from employee where emp_id = 2"; //without parameter
		String query1 = "delete from employee where emp_name = '"+emp_name+"';"; // with parameter
		int row = std.executeUpdate(query1);
		System.out.println(row +" rows affected.");
	}
	//Drop
	public static void droping() throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String query = "alter table employee drop location"; //without parameter
		int row = std.executeUpdate(query);
		System.out.println(row +" rows affected.");
	}
	
	//Create
	public static void createTable() throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String query = "create table product(id int, name varchar(20))"; //without parameter
		int row = std.executeUpdate(query);
		System.out.println(row +" rows affected.");
	}
	
	//Batch Process
	public static void batchProcess() throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String q = "insert into product values (1,'sharu')"; //without parameter
		String q1 = "insert into product values (2,'shruthi')";
		String q2 = "alter table product add column dept varchar(20)";
		String q3 = "update product set name = 'swetha s' where id = 1";
		
		std.addBatch(q2);
		std.addBatch(q3);
		
		int arr[] = std.executeBatch();
		for(int a : arr)
		{
			System.out.println(a +" row affected");
		}
		
	}
	
	//Prepare Statement
	public static void sqlInjection() throws SQLException
	{
		Connection con = connection();
		Statement std = con.createStatement();
		String query = "delete from employee where emp_name ='fjfu' or 1 = 1 ;"; 
		int row = std.executeUpdate(query);
		System.out.println(row +"row affected");
		
	}
	
	//Insert Using ClearParameter
	public static void PrepareStatement_insert(String emp_name,String location,Double salary) throws SQLException
	{
		Connection con = connection();
		String query = "insert into employee (emp_name,location , salary) values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setString(1, emp_name);
		pst.setString(2, location);
		pst.setDouble(3, salary);
		Boolean res = pst.execute();
		
		pst.clearParameters();
		pst.setString(1, emp_name);
		pst.setString(2, location);
		pst.setDouble(3, salary);
		int res1 = pst.executeUpdate();
		
		System.out.println(res1 +" row affected");
		
	}
	
	//Updation
	public static void PrepareStatement_Update(String emp_name,String location) throws SQLException
	{
		Connection con = connection();
		String query = "update employee set location = ? where emp_name = ?";
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setString(1, emp_name);
		pst.setString(2, location);
		
		int res = pst.executeUpdate();
		System.out.println(res + " row affected");	
	}
	
	//Deletion
	public static void PrepareStatement_Delete(String emp_name) throws SQLException
	{
		Connection con = connection();
		String query = "delete from employee where emp_name = ?";
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setString(1, emp_name);
		
		int res = pst.executeUpdate();
		System.out.println(res + " row affected");
		
	}
	
	//BulkInsertion Using ExecuteBatch()
		static ArrayList<Student> list =  new ArrayList<>();
		
		public static void addList()
		{
			list.add(new Student("xyz","chennai",29000.00));
			list.add(new Student("UYI","chennai",29000.00));
			list.add(new Student("XSE","chennai",29000.00));
			list.add(new Student("DFD","chennai",29000.00));
			list.add(new Student("VOC","chennai",29000.00));
			list.add(new Student("MAN","chennai",29000.00));
			list.add(new Student("xyz","chennai",29000.00));
			list.add(new Student("AHG","chennai",29000.00));
			list.add(new Student("xyz","chennai",29000.00));
			list.add(new Student("SYJ","chennai",29000.00));
			list.add(new Student("XAW","chennai",29000.00));
			list.add(new Student("IUU","chennai",29000.00));
			list.add(new Student("XGG","chennai",29000.00));	
		}
		
		public static void bulkInsert() throws SQLException
		{
			Connection con = connection();
			
			String query = "insert into employee (emp_name,location , salary) values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			for(Student std : list) {
			pst.setString(1, std.emp_name);
			pst.setString(2, std.location);
			pst.setDouble(3, std.salary);
			pst.addBatch();
			}
			
			int[] arr = pst.executeBatch();
			
			for(int st :arr)
			{
				System.out.println(st +"rows affected");
			}
		}
		
		public static void bulkDeletion() throws SQLException
		{
			Connection con = connection();
			
			String query = "delete from employee where emp_name = ?";
		}

	public static void main(String[] args) throws SQLException 
	{
		//selectAll();
		insertion();
		//insert_para("raja","vellore" , 35000.00);
		//updation(4,"kpm");
		//deletion("Ramesh");
		//droping();
		//createTable();
		//batchProcess();
		//sqlInjection();
		
		//PrepareStatement_insert("sharvathan" , "vellore" , 95000.00);
		//PrepareStatement_Update("londan" , "suresh");
		//PrepareStatement_Delete("Mahesh");
		//addList();
		//bulkInsert();
		bulkDeletion();

	}

}
