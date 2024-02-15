<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar</title>
</head>
<body>
    <div class="container">
        <p>${message}</p>
        
        <form action="${pageContext.request.contextPath}/registra"
            method="POST">

            <label for="nome"> Digite seu nome: </label> <input type="text"
                name="receberNome" id="nome"> <label for="login">
                Digite seu login: </label> <input type="text" name="receberLogin" id="login">

            <label for="senha"> Digite sua senha: </label> <input type="text"
                name="receberSenha" id="senha"> <input type="submit"
                value="Clique para cadastrar">
        </form>
    </div>
</body>
</html>