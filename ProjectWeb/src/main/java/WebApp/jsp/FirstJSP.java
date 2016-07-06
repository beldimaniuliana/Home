package WebApp.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstJSP extends HttpServlet{
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
				+ "<form method=GET action=index.jsp>	<hr>"
				+ "<label>FORMULAR : </label>"
				+ "<input type=submit name=complet value=COMPLETEAZA>"
				+ "<hr>"
				+ "</form>"
				+ "</body>"
				+ "</html>");

		out.close();
	}
	
}
