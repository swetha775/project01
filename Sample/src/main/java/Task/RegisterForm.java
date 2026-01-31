package Task;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterForm extends HttpServlet
{
	public void doGet (HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>\r\n"
				+ "            <h1>Welcome</h1>\r\n"
				+ "        </title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <form action=\"validate\" method = \"post\">\r\n"
				+ "            <label for=\"username\">username</label>\r\n"
				+ "            <input type=\"text\" name=\"username\" id=\"username\">\r\n"
				+ "\r\n"
				+ "            <label for=\"age\">age</label>\r\n"
				+ "            <input type=\"number\" name=\"age\" id=\"age\">\r\n"
				+ "\r\n"
				+ "            <label for=\"gender\">gender</label>\r\n"
				+ "            <input type=\"text\" name=\"gender\" id=\"gender\">\r\n"
				+ "            \r\n"
				+ "            <label for=\"email\">email</label>\r\n"
				+ "            <input type=\"text\" name=\"email\" id=\"email\">\r\n"
				+ "\r\n"
				+ "            <button type=\"submit\">submit</button>\r\n"
				+ "        </form>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}
}
