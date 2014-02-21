<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="vo.*" %>
	<%@ page import="dao.*" %>
	<%@ page import="java.io.*,java.util.*,java.sql.*"%>
	<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
	<%@ page import="javax.servlet.http.HttpSession;" %>
	<%@ page session="true" %>
	<% 
		//Creo una sesio
		HttpSession sesion=request.getSession();
		
	//Li asigno el nom d'suari a la sesio
		//sesion.setAttribute("usuari",request.getParameter("ID"));
		
		String usuari = (String)sesion.getAttribute("usuari");
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Afegir Asignatures</title>
</head>
<body>
	<b>Usuari: </b> <%= usuari %>
	<form action="afegirAsignatura" method="Post">
			<table>
			<tr>
			<td>Nom de l'asignatura:</td>
			<td><input type="text" size="20" name="nom"></td>
			</tr>
			<tr>
			<td>credits</td>
			<td><input type="text" size="20" name="credits"></td>
			</tr>
			
			<td colspan="2" align="center"><input type="submit" value="Afegeix asignatura"></td>
			
			</table>
		</form>
</body>
</html>