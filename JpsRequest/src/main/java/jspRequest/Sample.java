package jspRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class Sample extends HttpServlet
{
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
//		//Request -> read() -> Asci value((return))
//		BufferedReader buf = req.getReader();
//		int i;
//		while ((i=buf.read())!=-1)
//		{
//			char ch = (char)i;
//			System.out.print(ch);
//			
//		}
//		
//		//Request -> readLine() -> String(return)
//		BufferedReader buf1 = req.getReader();
//		String str;
//		while ((str = buf1.readLine())!= null)
//		{
//			System.out.println(str);	
//		}
		
		//Request and Response
		res.setContentType("Aplication/html");
		BufferedReader buf2 = req.getReader();
		PrintWriter out = res.getWriter();
		
		String line ;
		while((line = buf2.readLine()) != null)
		{
		out.println(line);
		}
	}
}
