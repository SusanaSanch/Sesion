<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function redirigirSalida ()
{
	  open("Salida", "_self");
	  
}

function redirigirInicio ()
{
	  open("Inicio", "_self");
	  
}

</script>

</head>
<body>

<h2 align="center"> HOLA ${nombre_usuario} </h2>

<div>



<h3 align="center" dir="ltr">NÚMERO DE LLAMADAS:</h3>
<br>
<h3 align="center"> ${numero_llamadas} </h3>



<br>
<div align="center">
<input type = submit value= "N_VECES" onclick="redirigirInicio()">     <input type = submit value= "Log-Out" onclick="redirigirSalida()">
</div>
</div>

</body>
</html>