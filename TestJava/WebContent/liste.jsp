<%@page import="fr.dawan.domain.Stagiaire"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<% List<Stagiaire> donnees = (List<Stagiaire>)request.getAttribute("liste"); 
for (Stagiaire s:donnees) {%>
	<tr>
		<td><%=s.getGenre().toString() %></td>
		<td><%=s.getNom() %></td>
		<td><%=s.getPrenom() %></td>
		<td><%=s.getSociete() %></td>
	</tr>
<% } %>
</table>
</body>
</html>