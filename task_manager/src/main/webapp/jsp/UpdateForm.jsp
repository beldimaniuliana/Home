<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User</title>
</head>
<body>
	<%
    String idUser = request.getParameter( "u" );
    if ( idUser == null )
    {
	%>
    <p>No parameter foo given to this page.</p>
<%
    }
    else
    {
%>
    <p>The user's id  is <%= idUser.toString() %>.</p>
<%
    }
    String k=idUser;
%>

 	<form action=http://localhost:8080/task_manager/updateuser method=GET>
		<Label>Change Username</label>
		<input type=text name=username>
		<br>
		<label>Change Password</label>
		<input type=text name=password>
		<input type=hidden name=idUser value=<%= idUser.toString() %>>
		<input type=submit name=submit value=Update>
	</form>
</body>
</html>