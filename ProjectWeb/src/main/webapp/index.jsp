<!DOCKTYE html>
<html>
	<head>
		<title>My First JSP</title>
		<style>
			a{
				text-decoration:none;
			}
			h1{
				text-align:center;
			}
		</style>
	</head>
	
	<body>
		<h1>My First JSP</h1>
		
		<a href=http://localhost:8080/ProjectWeb/firstjsp>My First JSP</a><br>
	
		<jsp:include page="formular.jsp" flush="true"/>
		<jsp:include page="date.jsp" flush="true"/>
	</body>
</html>
