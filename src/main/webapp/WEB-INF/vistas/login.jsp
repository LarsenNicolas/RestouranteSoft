<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/login.css" rel="stylesheet" >
</head>
<body>
    <div class="log-form">
        <h2>Inicia sesion</h2>
        <form:form action="validar-login" method="POST" modelAttribute="datosLogin">
            <form:input path="email" id="email" type="email" class="form-control" />
            <form:input path="password" type="password" id="password" class="form-control"/>
            <button type="submit" class="btn">Inicia sesion</button>
            <a href="registrar-usuario"	>Registrarme</a>
        </form:form>
    </div>
</body>
</html>
