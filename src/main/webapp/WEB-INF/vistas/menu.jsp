<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%--Menú--%>
<html>
	<header>	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="inicio">Menú</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNavDropdown">
	      <ul class="navbar-nav">
	      <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="login">Login</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="inicio">Inicio</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" href="contacto">Contacto</a>
	        </li>
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Usuarios
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	            <li><a class="dropdown-item" href="crear_usuario" >Crear Usuario</a></li>
	            <li><a class="dropdown-item" href="listar_usuarios" >Lista de Usuarios</a></li>
	            <li><a class="dropdown-item" href="editar_admin" >Editar Administrativo</a></li>
	            <li><a class="dropdown-item" href="editar_cliente" >Editar Cliente</a></li>
	            <li><a class="dropdown-item" href="editar_prof" >Editar Profesional</a></li>
	          </ul>
	        </li>
	        
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Capacitación
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	            <li><a class="dropdown-item" href="crear_capacitacion">Crear Capacitación</a></li>
	             <li><a class="dropdown-item" href="listar_capacitaciones">Lista de Capacitaciones</a></li>
	          </ul>
	        </li>
	       <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Visitas
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	         	<li><a class="dropdown-item" href="crear_visita" >Crear Visita</a></li>
	            <li><a class="dropdown-item" href="listar_visitas" >Lista de Visitas</a></li>
	            <li><a class="dropdown-item" href="listar_chequeos" >Lista de Chequeos</a></li>
	          </ul>
	        </li>
	       	<li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Pagos
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	         	<li><a class="dropdown-item" href="crear_pago" >Crear Pago</a></li>
	            <li><a class="dropdown-item" href="listar_pagos" >Lista de Pagos</a></li>
	          </ul>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="logout">Logout</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
</header>
</html>