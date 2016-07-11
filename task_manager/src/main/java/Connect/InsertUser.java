package Connect;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class InsertUser extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out = res.getWriter();
	
        String user=req.getParameter("user");
        String pass=req.getParameter("pass");

        Connection con=null;
        Statement stmt=null;
        
        try
        {
              Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/practica","iuliana","panama" );
              stmt=con.createStatement();
              int i = stmt.executeUpdate("insert into user(username,password) values('"+user+"','"+pass+"')");
              if(i>0)
              {
            	  System.out.println("Inserted Successfully: " + user + " " + pass);
            	  res.setStatus(res.SC_MOVED_TEMPORARILY);
                  res.setHeader("Location", "http://localhost:8080/task_manager/jsp/UserOperations.jsp"); 
              }
              else
            	  System.out.println("Insert Unsuccessful");
        }
        catch(Exception e)
        {
          out.println(e);       
        }      
    }
} 
        
