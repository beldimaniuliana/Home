<!DOCTYPE html>
<html>
	<head>
		<title>Using GET Method to Read Form Data</title>
		<style>
			a{
				text-decoration:none;
			}
		</style>
	</head>
	
	<body>
		<h1>Using GET Method to Read Form Data</h1>

		<ul>
			<li><label>Welcome </label> <%= request.getParameter("firstname")%> <%= request.getParameter("lastname")%></li>
			<li><label>With Car:</label> <%= request.getParameter("yes")%></li>
			<li><label>Without Car:</label> <%= request.getParameter("no")%></li>
		</ul>

		<% 	//Redirectare	
			/*String site = new String("http://www.tutorialspoint.com/jsp/jsp_page_redirect.htm/");
		  	response.setStatus(response.SC_MOVED_TEMPORARILY);
		 	response.setHeader("Location", site); */
		 	
		    Integer hitsCount = 
		      (Integer)application.getAttribute("hitCounter");
		    if( hitsCount ==null || hitsCount == 0 ){
		       /* First visit */
		       out.println("Welcome to my website!");
		       hitsCount = 1;
		    }else{
		       /* return visit */
		       out.println("Welcome back to my website!");
		       hitsCount += 1;
		    }
		    application.setAttribute("hitCounter", hitsCount);
		%>
		<p>Total number of visits: <%= hitsCount%></p>
		
		<a href=index.jsp>BACK</a>
	</body>
</html>