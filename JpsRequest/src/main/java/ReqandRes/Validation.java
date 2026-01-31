package ReqandRes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validation extends HttpServlet
{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		String s1 = req.getParameter("username");
		String s2 = req.getParameter("password");
		
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		out.println(s1+" - "+s2);
		//System.out.println(s1+" - "+s2);
	}

}
