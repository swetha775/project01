package Task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validation extends HttpServlet
{
	private ArrayList<Users> userList = null;
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		String s1 = req.getParameter("username");
		String s2 = req.getParameter("age");
		String s3 = req.getParameter("gender");
		String s4 = req.getParameter("email");
		
		Users user = new Users(s1,s2,s3,s4);
		
		this.userList = new ArrayList<>();
		userList.add(user);
		
		PrintWriter out = res.getWriter();
		out.println("added in list..");		
		
	}
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
        StringBuilder sb = new StringBuilder("User:[ ");
		
		int last = userList.size()-1;
		for(int i=0;i<userList.size();i++)
		{
			Users emp = userList.get(i);
			String line = String.format("{ \"username\" : \"%s\" , \"age\" :\" %s\" , \"gender\" :\" %s\" ,\"email\" : \"%s\"}",
					emp.getUsername(),emp.getAge(),emp.getGender(),emp.getEmail());
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
