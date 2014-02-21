<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true" %>

<%@ page import="vo.*" %>
	<%@ page import="dao.*" %>
	<%@ page import="java.io.*,java.util.*,java.sql.*"%>
	<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<%

	
		
		else
		%>
		<jsp:forward page="pagUsuari.jsp" />
		<%

		  {

		
		 }
		

		%>

	<jsp:forward page="index.jsp">
	
	<jsp:param name="error" value="L'usuari no existeix al sistema"/>
	
	</jsp:forward>
	
	