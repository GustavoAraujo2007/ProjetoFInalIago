<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/minhaConta.css"> 
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="container container-inf">
        <div class="table-responsive">
            <table class="table table-bordered table-hover">
                <tbody>
                    <c:forEach items="${usuario}" var="usuarios">
                        <tr>
                            <th>Nome:</th>
                        </tr>
                        <tr>
                            <td>${usuarios.nome}</td>
                        </tr>
                        <tr>
                            <th>E-mail:</th>
                        </tr>
                        <tr>
                            <td>${usuarios.email}</td>
                        </tr>
                        <tr>
                            <th>Telefone:</th>
                        </tr>
                        <tr>
                            <td>${usuarios.telefone}</td>
                        </tr>
                        <tr>
                            <th>CPF:</th>
                        </tr>
                        <tr>
                            <td>${usuarios.cpf}</td>
                        </tr>
                        
                       
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
