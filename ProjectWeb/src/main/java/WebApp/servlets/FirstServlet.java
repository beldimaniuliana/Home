package WebApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException
	{
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html");
		
		String title = "My Site - Beldiman Iuliana - First Servlet";
		String docType = "<!DOCTYPE html>";
		out.println(docType 
				+ "<html>"
				+ "<head><title>"	+	title	+	"</title></head>"
				+ "<body>	"
				+ "<h1>Hello World! - " 	+ 	title 	+	"</h1>	"
				+ "<form method=GET action=secondservlet>	<hr>"
				+ "<label>First Name : </label>	<input type=text name=fname> <br><br>"
				+ "<label>Last Name : </label> <input type=text name=lname> <br><br>"
				+ "<label>Password</label>	<input type=password name=password> <br><br>"
				+ "<label>Do you have a car:</label> <br>"
				+ "<input type=checkbox name=yes checked=checked /> YES"
				+ "<input type=checkbox name=no /> NO"		
				+ "<input type=submit name=submit value=SEND>"
				+ "<hr>"
				+ "</body>"
				+ "</html>");
		out.close();
	}
}
