package Connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteUser extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		Connection con;
		PreparedStatement st;
		//ResultSet rs;
		
		try
		{ 
			//HttpSession session = req.getSession(true);
			Class.forName("com.mysql.jdbc.Driver");
			
			//String id = (String) session.getAttribute("idU");
			String id = req.getParameter("u");
			System.out.print(id);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica","iuliana","panama");
			
			st = con.prepareStatement("delete from user where id_user="+ id);
			//st.setString(1, id);
			st.executeUpdate();
			int i = st.executeUpdate();
			
			if(i!=0)
				System.out.println("Deleting row...");
			else if (i==0)
			{
				System.out.println(" Row has been deleted successfully.");
				res.setStatus(res.SC_MOVED_TEMPORARILY);
                res.setHeader("Location", "http://localhost:8080/task_manager/useroperations");
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
}