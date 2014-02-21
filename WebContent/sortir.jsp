<%@ page session="true" %>
<%
	HttpSession sesion = request.getSession();
	
	sesion.invalidate();
%>
<jsp:forward page="index.jsp"/>