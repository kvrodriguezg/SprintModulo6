<%@ page import="FullStackJava.Modulo6_KRodriguez.Modelo.bean.Cliente"%>
<%@ page import="FullStackJava.Modulo6_KRodriguez.Modelo.bean.Profesional"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Crear Visita</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	<body class="p-3 mb-2 bg-secondary text-white">
	
	<%-- Incluimos el menú. --%>
	<%@ include file='menu.jsp'%>
	
	<%-- Formulario para crear usuario.--%>
		<div class="container-fluid" align="center">
		    <div class="row">
		        <div class="col-md-12">
		            <div class="well well-sm">
		                <form class="form-horizontal" action="visitaCreada" method="post">
		                    <fieldset>
		                        <legend class="text-center header">Ingrese datos de visita:</legend>
		                        
		                        <br>
		                        
		                     	<div class="form-group">
		                        	<span class="col-md-1 col-md-offset-2 text-center">
		                            		<i class="fa fa-user bigicon"></i>
		                        	</span>
									  <div class="col-md-8">
										  <select name="cliente_id" id="tipo" class="form-select" onchange="seleccion()">										  
										 	<option value="0" selected>ID Cliente</option>
										 	<%
											ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("clientes");
											for(Cliente cliente : clientes){
											%>
												<option><%= cliente.getId_us()%></option>
											<%}%>	
										  </select>
									    </div>
								</div>
								<br>
		                        
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="fecha_visita" type="text" placeholder="Fecha de Visita" class="form-control">
		                            </div>
		                        </div>		                        
								<br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="detalle_visita" type="text" placeholder="Detalle de Visita" class="form-control">
		                            </div>
		                        </div>		 
		                        <br>
		                        <div class="form-group">
		                        	<span class="col-md-1 col-md-offset-2 text-center">
		                            		<i class="fa fa-user bigicon"></i>
		                        	</span>
									  <div class="col-md-8">
										  <select name="profesional_id" id="tipo" class="form-select" onchange="seleccion()">										  
										 	<option value="0" selected>ID Profesional</option>
										 	<%
											ArrayList<Profesional> profesionales = (ArrayList<Profesional>) request.getAttribute("profesionales");
											for(Profesional profesional : profesionales){
											%>
												<option><%= profesional.getId_us() %></option>
											<%}%>	
										  </select>
									    </div>
								</div>
								<br>
		                       							            
		                        <div class="form-group">
		                            <div class="col-md-12 text-center">
		                                <button type="submit" class="btn btn-primary btn-lg">Enviar</button>
		                            </div>
		                        </div>
		                    </fieldset>
		                </form>
		            </div>
		        </div>
		    </div>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
	</body>

</body>
</html>