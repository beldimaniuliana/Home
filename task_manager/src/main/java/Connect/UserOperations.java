package Connect;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class UserOperations extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out = res.getWriter();

        Connection con=null;
        Statement stmt=null;

        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/practica","iuliana","panama" );
            System.out.println("Connected to the database");
       
            String query = "select * from user";
            System.out.println("query " + query);
            stmt = con.createStatement();
            ResultSet  rs = stmt.executeQuery(query);
            
            
            out.print("<table>");	
            
         while(rs.next())
         {
        	String id = rs.getObject("id_user").toString();
        	String user = rs.getObject("username").toString();
        	String pass = rs.getObject("password").toString();
        	
        	out.print("<tr><td>" + id  + "</td>");
            out.print("<td>" + user +"</td>");
            out.print("<td>" + pass +"</td>");
            out.print("<td> <a href=deleteuser?u="+id+">Delete</a> </td>");
            out.print("<td> <a href=http://localhost:8080/task_manager/jsp/UpdateForm.jsp?u="+id+">Update</a></td>");//+"&us="+user+"&pass="+pass+">Update</a> </td></tr>");
            
            out.print("<br>");
         }
         out.print(	
        		 "</table>\n"
        		+"<br><br>"
        		+ "<a href=http://localhost:8080/task_manager/jsp/UserOperations.jsp>Back</a>\n"
        		+"</body>\n"
        		+"</html>\n");
         
            con.close();
            System.out.println("Disconnected from database");
        } catch (Exception e) {
          e.printStackTrace();
          }  
    }
} 
        
        
        
        
        /*
        System.out.println("MySQL Connect Example.");
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/practica";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "iuliana"; 
        String password = "panama";

        Statement st;
        try {
          Class.forName(driver).newInstance();
          conn = DriverManager.getConnection(url,userName,password);
          System.out.println("Connected to the database");
     
          String query = "select * from user";
          System.out.println("query " + query);
          st = conn.createStatement();
          ResultSet  rs = st.executeQuery(query);

           out.print("<html><head>");
           out.print("</head><body>");
   
           out.print("<code><pre>");
           out.print("<font color=green>COF_NAME\tSUP_ID ");
           out.println("\t\tPRICE\tSALES\tTOTAL\n</font>");
   
       while(rs.next())
       {
          out.print(rs.getObject("id_user").toString()+"\t");
          out.print(rs.getObject("username").toString()+"\t\t");
          out.print(rs.getObject("password").toString()+"\t");
       }
          conn.close();
          System.out.println("Disconnected from database");
        } catch (Exception e) {
        e.printStackTrace();
        }*/





/*<sql:setDataSource 
			var="dataSource" 
			driver="com.mysql.jdbc.Driver"
			url="jdbc:mysql://localhost:3306/practica"
			user="iuliana"
			password="panama" 
			scope="session"
			/>
			 * 
 	<sql:query var="user" dataSource="${dataSource}">
            select * FROM user
        </sql:query>
        
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>username</th>
                    <th>password</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${user.rows}">            
                <tr>
                    <td><c:out value="${user.id_user}"/></td>
				   	<td><c:out value="${user.username}"/></td>
					<td><c:out value="${user.password}"/></td>
                </tr>
             </c:forEach>   
            </tbody>
        </table>*/













/*

 <% 
			ArrayList<String> arrayList=new ArrayList<String>();
			arrayList.add("First");
			arrayList.add("Second");
			arrayList.add("Third");
			arrayList.add("Fourth");
			arrayList.add("Fifth");
			request.setAttribute("arrayList",arrayList);
		%>
		
		<h2> c:foreach select value logic 1: 
		
		<select id="names" name="names">
		   <c:forEach items="<%=request.getAttribute(\"arrayList\") %>" var="names">
		        <option value="<c:out value="${names}"/>"><c:out value="${names}"/></option>
		    </c:forEach>
		</select>
		
		<br><br>c:foreach select value logic 2: 
		
		<select id="names" name="names">
		   <c:forEach items="${arrayList }" var="names">
		        <option value="<c:out value="${names}"/>"><c:out value="${names}"/></option>
		    </c:forEach>
		</select></h2>
		*/


