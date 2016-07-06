package WebApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException
	{
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html");
		
		String title = "My Site - Beldiman Iuliana - Second Servlet";
		String docType = "<!DOCTYPE html>";
		
		out.println(docType 
				+ "<html>"
				+ "<head><title>"+title+"</title></head>"
				+ "<body>	"
				+ "<h1>Hello World! - " + title +"</h1>"
				+ "<hr>"
				+ "<label>Welcome </label>" + request.getParameter("fname") + " " + request.getParameter("lname") + "<br>"
				+ "<label>With Car: </label>" + request.getParameter("yes") + "<br>"
				+ "<label>Without Car: </label>" + request.getParameter("no") + "<br>"
				+ "<hr>"
				+ "</body>"
				+ "</html>"
				);
		out.close();
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
	doGet(request, response);
	}
}