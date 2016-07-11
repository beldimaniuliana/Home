package Connect;


import entities.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet {

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Login logic
		String username = req.getParameter("username").toString();
		String password = req.getParameter("password").toString();

				User user = new User();
	            if (!user.getUsername().equals(username) || user.getPassword().equals(password)) {
	    			// not correct
	    			// go back to login
	    			doGet(req, resp);
	    		} else {
	    			// correct! Greet!
	    			req.setAttribute("username", username);
	    			req.getRequestDispatcher("/Greeting").forward(req, resp);
	    		}
	         }
}





/*
import entities.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Login logic
		String user1 = req.getParameter("username").toString();
		String pass1 = req.getParameter("password").toString();
		
		System.out.println(user1 + " " + pass1);

		Connection con=null;
        Statement stmt=null;

        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/practica","iuliana","panama" );
            System.out.println("Connected to the database");
       
            String query = //"select * from user";
            "select * from user where username = "
            + "'" + user1 +"'";
            
            System.out.println("query " + query);
            stmt = con.createStatement();
            ResultSet  rs = stmt.executeQuery(query);
            

         while(rs.next())
         {
        	 if (rs.getObject("username").equals(user1) ||rs.getObject("password").equals(pass1)) 
          		System.out.println("E BUN");
          	else
          		System.out.println("NU E BUN");
        	 
        	String id = rs.getObject("id_user").toString();
        	String user = rs.getObject("username").toString();
        	String pass = rs.getObject("password").toString();
        	
        	System.out.println(id + " " + user + " " + pass);
        	
        	if (!user.equals(user1) || pass.equals(pass1)) 
        		System.out.println("E BUN");
        	else
        		System.out.println("NU E BUN");
         }
   
            con.close();
            System.out.println("Disconnected from database");
            
        } catch (Exception e) {
          e.printStackTrace();
          }  
        
		/*
	            if (!employee.getNume().equals(firstName) || employee.getParola().equals(password)) {
	    			// not correct
	    			// go back to login
	    			doGet(req, resp);
	    		} else {
	    			// correct! Greet!
	    			req.setAttribute("firstname", firstName);
	    			req.getRequestDispatcher("/Greeting").forward(req, resp);
	    		}*/

	//}
//}
/*Connection con=null;
        Statement stmt=null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/practica","iuliana","panama" );
            System.out.println("Connected to the database");
       
            String query = "select * from user";
            System.out.println("query " + query);
            stmt = con.createStatement();
            ResultSet  rs = stmt.executeQuery(query);
            out.print("<table>");*/