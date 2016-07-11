<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>MAKE OPERATIONS ON USER TABLE</h1>
        
        <form action="http://localhost:8080/task_manager/insertuser" action="GET">

        	<label>UserName</label>
        	<input type="text" name="user">
        	
        	<label>Password</label>
        	<input type="text" name="pass">
        	
        	<input type="submit" name="submit" value="INSERT">
        </form>
		<br><br>
		<a href=http://localhost:8080/task_manager/useroperations>SEE USER TABLE</a>
    </body>
</html>