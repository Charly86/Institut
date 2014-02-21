<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registre d'usuaris</title>
</head>
<body>
		<div align="center">
		<table>
		
		<tr>
		<td>
		<form action="ServletRegistre" method="Post">
			<table>
			<tr>
			<td>Usuari:</td>
			<td><input type="text" size="20" name="nomUser"></td>
			</tr>
			<tr>
			<td>Password:</td>
			<td><input type="password" size="20" name="password"></td>
			</tr>
			<tr>
			<td>Nom:</td>
			<td><input type="text" size="20" name="nom"></td>
			</tr>
			<tr>
			<td>Cognoms:</td>
			<td><input type="text" size="20" name="cognoms"></td>
			</tr>
			<tr>
			<td>Edat:</td>
			<td><input type="text" size="20" name="edat"></td>
			</tr>
			
			<td colspan="2" align="center"><input type="submit" value="Registrar"></td>
			
			</table>
		</form>
		
		</div>
		
		<table>
		
		<tr>
		<td>
		
		<form action="comprovarUsuari" method="Post">
			<table>
			<tr>
			<td>Usuari:</td>
			<td><input type="text" size="20" name="user"></td>
			</tr>
			<tr>
			<td>Password:</td>
			<td><input type="password" size="20" name="password"></td>
			</tr>
			
			
			<td colspan="2" align="center"><input type="submit" value="Entrar"></td>
			
			</table>
		</form>
		</body>
</html>