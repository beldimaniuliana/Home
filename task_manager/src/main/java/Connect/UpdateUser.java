package Connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateUser extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
	    String title = "UPDATE USER";
	    String docType = "<!DOCTYPE html>\n";
	        out.println(docType 
	        		+"<html>\n"
	        		+"<head>\n"
	        		+ "<title>" + title +  "</title>"
	        		+"</head>\n"
	        		+ "<body>\n");
		Connection con;
		PreparedStatement st;
		//ResultSet rs;
		
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver");
			
			String id = req.getParameter("idUser");
			String user = req.getParameter("username");
			String pass = req.getParameter("password");
			
			System.out.print(id + " " + user + " " + pass);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica","iuliana","panama");
			
			String sql = "UPDATE user SET password="+pass+", username="+user+" WHERE id_user="+id+"";
			 
			st = con.prepareStatement(sql);
			/*int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}*/

			//st = con.prepareStatement("update user set password="+pass+", username="+user+" WHERE id_user="+id+"");
			
			//st.setString(1, id);
			st.executeUpdate();
			int i = st.executeUpdate();
			
			if(i!=0)
				System.out.println("Updateing row...");
			else if (i==0)
			{
				System.out.println(" Row has been updated successfully.");
			}
		}
		catch(SQLException sx)
		{
			out.println(sx);
		}
		catch(ClassNotFoundException cx)
		{
			out.println(cx);
		}   
	}
	
	
	
	
	/*
	
	String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
	 
	PreparedStatement statement = conn.prepareStatement(sql);
	statement.setString(1, "123456789");
	statement.setString(2, "William Henry Bill Gates");
	statement.setString(3, "bill.gates@microsoft.com");
	statement.setString(4, "bill");
	 
	int rowsUpdated = statement.executeUpdate();
	if (rowsUpdated > 0) {
	    System.out.println("An existing user was updated successfully!");
	}*/
}