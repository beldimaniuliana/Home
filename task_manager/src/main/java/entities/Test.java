package entities;

import javax.servlet.http.HttpServlet;

//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class Test extends HttpServlet {

public void doGet(HttpServletRequest request,
                 HttpServletResponse response)
         throws ServletException, IOException
{
   // Set response content type
   response.setContentType("text/html");

   PrintWriter out = response.getWriter();
   String title = "Using GET Method to Read Form Data";
   String docType =
   "<!DOCTYPE html>\n";
   out.println(docType 
		   + "<html>\n"
		   + "<head>\n"
		   + "<title>" + title + "<title>\n"
		   + "</head>\n"
		   + "<body>\n"
		   + "<p>Username : "+ request.getParameter("user") +  "Password: " + request.getParameter("pass") + "</p>"
		   + "</body>\n"
		   + "</html>\n" 
        );
}
}
