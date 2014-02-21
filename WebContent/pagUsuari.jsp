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
		sesion.setAttribute("usuari",request.getParameter("ID"));
		
		String usuari = (String)sesion.getAttribute("usuari");
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina personal</title>
</head>
<body>
<h3>Sistema de administración de cuentas</h3>

<br>

<b>Usuari: </b> <%= usuari %>

Escull una opcio

<li> <a href="AfegirAssignatura.jsp">Afegir assignatures</a>

<li> <a href="FerMatricula.jsp">Fer matricula</a>

<li> <a href="llistarAlumnes.jsp">Llistar Alumnes</a>

<li> <a href="sortir.jsp">Sortir</a>

</body>
</html>