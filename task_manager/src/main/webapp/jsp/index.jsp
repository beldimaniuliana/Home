<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/PageInterface.css">
		<link rel="stylesheet" type="text/css" href="css/User.css">
		<title>TASK MANAGER</title>
	</head>
	<body>
		<div id="page">
		
			<div id="header">
				<h1>Task Manager</h1>	
				<h2>Header</h2>
			</div>
			
			<div id="menu">
				<h2>Menu</h2>
			</div>

			<div id="right_column">
				<div id="left_column">
					<h2>Left_Column</h2>
				</div>
			
				<h2>Right_Column</h2>
				
				<form action="http://localhost:8080/task_manager/userlogin" method="POST">
					<fieldset>
						<legend>User Authentication</legend>
						<br><br>
						<label>First name:</label>
						<input type="text" name="username"> 
						
						<br><br>
						
						<label>Password:</label> 
						<input type="password" name="password">
						
						<br><br>
						
						<input type="submit" value="Submit">
						<br><br>
					</fieldset>
				</form>
				
				
			</div>
			
			<div id="footer">
				<h2>Footer</h2>
			</div>
			
		</div>
	</body>
</html>