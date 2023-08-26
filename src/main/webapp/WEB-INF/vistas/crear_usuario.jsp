<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Crear Usuario</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	
	<%--Script en javascript para solicitar datos según el tipo de usuario.--%>
	<script type="text/javascript">

		function seleccion() {
			  val = tipo.value;
			  cliente = document.getElementById('campos_cliente');
			  admin = document.getElementById('campos_admin');
			  prof = document.getElementById('campos_prof');
			  
			  if (val == "1")
				  {
				  admin.style.display = '';
				  cliente.style.display = "none";
		        prof.style.display = "none";
				  }
			  else if (val == "2")
				  {
		        cliente.style.display = '';
		        prof.style.display = "none";
		        admin.style.display = "none";
				  }
			  else if (val == "3")
				  {
				  prof.style.display= '';
				  cliente.style.display = "none";
		        admin.style.display = "none";
		        
				  }
			  else if (val == "0")
			  	{
				  cliente.style.display = "none";
				  prof.style.display = "none";
		        admin.style.display = "none";
				}
			}
	</script>

	<body class="p-3 mb-2 bg-secondary text-white">
	
	<%-- Incluimos el menú. --%>
	<%@ include file='menu.jsp'%>
	
	<%-- Formulario para crear usuario.--%>
		<div class="container-fluid" align="center">
		    <div class="row">
		        <div class="col-md-12">
		            <div class="well well-sm">
		                <form class="form-horizontal" action="usuarioCreado" method="post">
		                    <fieldset>
		                        <legend class="text-center header">Ingrese datos de usuario:</legend>
		                        
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
		                        <div class="form-group">
		                        	<span class="col-md-1 col-md-offset-2 text-center">
		                            		<i class="fa fa-user bigicon"></i>
		                        	</span>
									  <div class="col-md-8">
										  <select name="tipo" id="tipo" class="form-select" onchange="seleccion()">										  
										 	<option value="0" selected>Tipo de Usuario</option>
										    <option value="1">Administrativo</option>
										    <option value="2">Cliente</option>
										    <option value="3">Profesional</option>
										  </select>
									    </div>
								</div>
								<br>
								
								<%--Campos para crear administrativo. Ocultos por defecto.--%>  
									<div id="campos_admin" style="display:none;">
										<div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="area" type="text" placeholder="Área" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="exp" type="text" placeholder="Experiencia Previa." class="form-control">
				                            </div>
				                        </div>
				                        <br>
									</div>
									
									
									<%--Campos para crear profesional. Ocultos por defecto.--%>  
									<div id="campos_prof" style="display:none;">
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
									
									<%--Campos para crear cliente. Ocultos por defecto.--%>  
									<div id="campos_cliente" style="display:none;">
										<div id="rut" class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="rut" type="number" placeholder="RUT" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group" id="nombres">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="nombres" type="text" placeholder="Nombres" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="apellidos" name="apellidos" type="text" placeholder="Apellidos" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="telefono" name="telefono" type="number" placeholder="Teléfono" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="afp" name="afp" type="text" placeholder="AFP" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="sis_salud" name="sis_salud" type="text" placeholder="Sistema de Salud" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="direccion" name="direccion" type="text" placeholder="Dirección" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="comuna" name="comuna" type="text" placeholder="Comuna" class="form-control">
				                            </div>
				                        </div>	                   
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input id="edad" name="edad" type="number" placeholder="Edad" class="form-control">
				                            </div>
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