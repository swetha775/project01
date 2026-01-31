package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jar")
public class ResponseToXML extends HttpServlet
{
//    private ArrayList<Employee> ars = null;
//	
//	public void loadData()
//	{
//		ars.add(new Employee(101,"nandhu","IT",80000.00));
//		ars.add(new Employee(102,"nila","clerk",20000.00));
//		ars.add(new Employee(103,"narayanan","assistant",10000.00));
//		ars.add(new Employee(104,"nakul","dev",60000.00));
//		ars.add(new Employee(105,"ram","IT",20000.00));
//		ars.add(new Employee(106,"gayathri","cleanner",18000.00));
//		ars.add(new Employee(107,"ranjani","staff",30000.00));
//		
//	}
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/xml");
		PrintWriter out = res.getWriter();
		ArrayList<Employee> ars = new ArrayList<>();
		ars.add(new Employee(101,"nandhu","IT",80000.0));
		ars.add(new Employee(102,"nila","clerk",20000.0));
		ars.add(new Employee(103,"narayanan","assistant",10000.00));
		ars.add(new Employee(104,"nakul","dev",60000.00));
		ars.add(new Employee(105,"ram","IT",20000.00));
		ars.add(new Employee(106,"gayathri","cleanner",18000.00));
		ars.add(new Employee(107,"ranjani","staff",30000.00));
		
		out.println("<Employees>");
		
		for(Employee emp:ars)
		{
			out.println("<Employee>");
			out.println("<emp_id>"+emp.getEmp_id()+"/<emp_id>");
			out.println("<emp_name>"+emp.getEmp_name()+"/<emp_name>");
			out.println("<emp_dept>"+emp.getEmp_dept()+"/<emp_dept>");
			out.println("<salary>"+emp.getSalary()+"/<salary>");
			out.println("</Employee>");
		}
		out.println("</Employees>");
	}


}
