<%@ page import="FullStackJava.Modulo6_KRodriguez.Modelo.bean.Pago"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Listado de Pagos.</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
	<body class="p-3 mb-2 bg-secondary text-white">
		
		<%--Incluimos el menú.--%>
		<%@ include file='menu.jsp'%>
		

		<h1 align="center">Lista de Pagos.</h1>
		
		<table class="table">
				<thead class="table-dark">
					<tr>
						<th>ID</th>
						<th>ID Cliente</th>
						<th>Monto</th>
						<th>Fecha de pago</th>
					</tr>			
				</thead>
				<tbody>
					<%--Enviamos datos a la lista de usuarios y los mostramos.--%>
					<%
					ArrayList<Pago> pagos = (ArrayList<Pago>)request.getAttribute("pagos");
					for(Pago pago : pagos){
						%>
							<tr>
								<td><%= pago.getId()%></td>
								<td><%= pago.getClienteId()%></td>
								<td><%= pago.getMonto() %></td>
								<td><%= pago.getFechaPago() %></td>
							</tr>
						<%
					}
					%>			
				</tbody>		
			</table>

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
	</body>

</body>
</html>