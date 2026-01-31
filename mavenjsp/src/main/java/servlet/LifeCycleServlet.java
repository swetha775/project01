package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet
{
	public void init() 
	{
		System.out.println("init method is initialized..");
	}
	
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("service() method work");
		System.out.println("service handled the method");
	}
	
	public void destroy()
	{
		System.out.println("destroyed..");
	}

}
