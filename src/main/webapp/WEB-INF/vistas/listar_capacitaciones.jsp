<%@ page import="FullStackJava.Modulo6_KRodriguez.Modelo.bean.Capacitacion"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Capacitaciones.</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
	<body class="p-3 mb-2 bg-secondary text-white">
		
		<%--Incluimos el menú.--%>
		<%@ include file='menu.jsp'%>
		
		
		<h1 align="center">Lista de capacitaciones.</h1>
		
		<table class="table">
				<thead class="table-dark">
					<tr>
						<th>Id</th>
						<th>Rut Cliente</th>
						<th>Nombre</th>
						<th>Lugar</th>
						<th>Día</th>
						<th>Hora</th>
						<th>Duración</th>
						<th>Asistentes</th>	
				</thead>
				<tbody>
					<%--Enviamos datos a la lista de capacitaciones y los mostramos.--%>
					<%
					
					
					ArrayList<Capacitacion> capacitaciones = (ArrayList<Capacitacion>) request.getAttribute("capacitaciones");
					for(Capacitacion cap : capacitaciones){
						%>
							<tr>
								<td><%= cap.getId_cap() %></td>
								<td><%= cap.getRut() %></td>
								<td><%= cap.getNombre() %></td>
								<td><%= cap.getLugar() %></td>
								<td><%= cap.getDia() %></td>
								<td><%= cap.getHora() %></td>
								<td><%= cap.getDuracion() %></td>
								<td><%= cap.getCant_a()%></td>
							</tr>
						<%
					}
					%>			
				</tbody>		
			</table>

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
	</body>
</html>