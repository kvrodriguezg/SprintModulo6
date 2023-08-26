<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Profesional.</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
	<body class="p-3 mb-2 bg-secondary text-white">
		
		<%--Incluimos el menú.--%>
		<%@ include file='menu.jsp'%>
			
			<h2 align="center">Editar Profesional</h2>
			
			<div class="container-fluid" align="center">
		    <div class="row">
		        <div class="col-md-12">
		            <div class="well well-sm">
		                <form action="prof_editado" method="post" class="form-horizontal" >
		                    <fieldset>
		                        <legend class="text-center header">Ingrese los datos del usuario a editar:</legend>

		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="id" type="number" placeholder="ID" class="form-control">
		                            </div>
		                        </div>
		                        
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="nombre" type="text" placeholder="Nombre" class="form-control">
		                            </div>
		                        </div>
		                        
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="run" type="number" placeholder="RUN" class="form-control">
		                            </div>
		                        </div>
		                        
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="fecha_nac" type="text" placeholder="Fecha de Nacimiento" class="form-control">
		                            </div>
		                        </div>
								<br>
									
								<div id="campos_prof"">
										<div id="titulo" class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="titulo" type="text" placeholder="Titulo" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group" id="f_ingreso">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="f_ingreso" type="text" placeholder="Fecha de ingreso" class="form-control">
				                            </div>
				                        </div>
				                        <br>
									</div>
	
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
</html>