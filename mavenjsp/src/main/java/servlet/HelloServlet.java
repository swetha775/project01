package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/helo")
public class HelloServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("get method is handled req..");
	}
	
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("Post method is handled req..");
	}
	
	public void doPut(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("put method is handled req..");
	}
	
	public void doDelete(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("delete method is handled req..");
	}

}
