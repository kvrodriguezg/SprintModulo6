<%@ page import="FullStackJava.Modulo6_KRodriguez.Modelo.bean.Chequeo"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Chequeos.</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
	<body class="p-3 mb-2 bg-secondary text-white">
		
		<%--Incluimos el menú.--%>
		<%@ include file='menu.jsp'%>
		
		
		<h1 align="center">Lista de Chequeos.</h1>
		
		<table class="table">
				<thead class="table-dark">
					<tr>
						<th>Id</th>
						<th>Visita ID</th>
						<th>Detalle</th>
						<th>Estado</th>
				</thead>
				<tbody>
					<%--Enviamos datos a la lista de capacitaciones y los mostramos.--%>
					<%
					ArrayList<Chequeo> chequeos = (ArrayList<Chequeo>) request.getAttribute("chequeos");
					for(Chequeo chequeo : chequeos){
						%>
							<tr>
								<td><%= chequeo.getId() %></td>
								<td><%= chequeo.getVisitaId() %></td>
								<td><%= chequeo.getDetalle() %></td>
								<td><%= chequeo.getEstado() %></td>								
							</tr>
						<%
					}
					%>			
				</tbody>		
			</table>

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
	</body>