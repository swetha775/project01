package ReqandRes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginPage")
public class LoginPage extends HttpServlet
{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
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
				+ "        <form action=\"validate\" method = \"get\">\r\n"
				+ "            <label for=\"username\">username</label>\r\n"
				+ "            <input type=\"text\" name=\"username\" id=\"username\">\r\n"
				+ "\r\n"
				+ "            <label for=\"password\">password</label>\r\n"
				+ "            <input type=\"text\" name=\"password\" id=\"password\">\r\n"
				+ "\r\n"
				+ "            <button type=\"submit\">submit</button>\r\n"
				+ "        </form>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}

}
