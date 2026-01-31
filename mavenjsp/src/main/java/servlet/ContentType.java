package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Content")
public class ContentType extends HttpServlet
{
//	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
//	{
//		res.setContentType("text/html");
//		PrintWriter out = res.getWriter();
//		out.println("<h1>heloo sri</h1>");
//	}
	
//	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
//	{
//		res.setContentType("text/plain");
//		PrintWriter out = res.getWriter();
//		out.println("<h1>heloo sri</h1>");
//	}
	
//	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
//	{
//		res.setContentType("Application/json");
//		PrintWriter out = res.getWriter();
//		out.println("{\"id\" : 101 , \"name\" : \"Gopal\"}");
//	}
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		res.setContentType("Application/xml");
		PrintWriter out = res.getWriter();
		out.println("<emp> <id> 1 </id> <name> swweet </name> </emp>");
	}

}
