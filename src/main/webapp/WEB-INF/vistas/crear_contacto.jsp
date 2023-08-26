<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Contacto</title>
	<%-- Boostrap. --%>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
	<body class="p-3 mb-2 bg-secondary text-white">
	
	<%-- Incluimos el menú. --%>
	<%@ include file='menu.jsp'%>
	
	<%-- Formulario de contacto.--%>
		<div class="container-fluid" align="center">
		    <div class="row">
		        <div class="col-md-12">
		            <div class="well well-sm">
		                <form action="contacto_enviado" method="post" class="form-horizontal">
		                    <fieldset>
		                        <legend class="text-center header">Contáctanos</legend>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input id="fname" name="nombre" type="text" placeholder="Nombre" class="form-control">
		                            </div>
		                        </div>
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input id="email" name="email" type="text" placeholder="Email" class="form-control">
		                            </div>
		                        </div>
								<br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input id="phone" name="telefono" type="text" placeholder="Teléfono" class="form-control">
		                            </div>
		                        </div>
								 <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
		                            <div class="col-md-8">
		                                <textarea class="form-control" name="mensaje" placeholder="Ingresa tu mensaje para nosotros. Te responderemos a la brevedad." rows="7"></textarea>
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
</html>