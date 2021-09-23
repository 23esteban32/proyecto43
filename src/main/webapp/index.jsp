
<%@page import="controlador.Coneccion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String cod="", nombre="";
if(request.getParameter("co")!=null){
cod=request.getParameter("co");
nombre=request.getParameter("no");
}
%>
<form action="Servletgestionlineas" method="post">
<input type="text" name="codigolinea" value="<%=cod %>"  placeholder="codigo de la linea">
<input type="text" name="nombrelinea" value="<%=nombre %>"   placeholder="codigo del nombre ">

<input type="submit" name="btnins" value="registrar">
<input type="submit" name="btncon" value="consultar">
<input type="submit" name="btnact" value="actualizar">
<input type="submit" name="btneli" value="eliminar">



</form>

</body>
</html>