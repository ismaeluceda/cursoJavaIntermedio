<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hola ${usuarioObj.nombre}</h1>
	<h1>su edad es ${usuarioObj.edad}</h1>
	<h1>usuarioSesion es ${usuarioSession}</h1>
	<a href="verSaludo2">ir a la segunda pagina</a>
</body>
</html>