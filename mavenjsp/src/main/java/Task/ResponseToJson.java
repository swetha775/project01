package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/say")
public class ResponseToJson extends HttpServlet
{
	private ArrayList<Employee> ars = null;
	
	public void list()
	{		
		this.ars = new ArrayList<>(Arrays.asList((new Employee(101,"nandhu","IT",80000.00)),
				(new Employee(102,"nila","clerk",20000.00)),
				(new Employee(104,"nakul","dev",60000.00))));
	}
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		list();
		
		StringBuilder sb = new StringBuilder("Employee:[ ");
		
		int last = ars.size()-1;
		for(int i=0;i<ars.size();i++)
		{
			Employee emp = ars.get(i);
			String line = String.format("{ \"emp_id\" : \"%d\" , \"emp_name\" :\" %s\" , \"emp_dept\" :\" %s\" ,\"salary\" : \"%f\"}",
					emp.getEmp_id(),emp.getEmp_name(),emp.getEmp_dept(),emp.getSalary());
			if(i == last)
			{
				sb.append(line).append("]");
			}
			else
			{
				sb.append(line).append(",");
			}
		}
		
		String response = sb.toString();
		res.setContentType("Apllication/json");
		PrintWriter out = res.getWriter();
		out.println(response);
		
		
		
	}

}
