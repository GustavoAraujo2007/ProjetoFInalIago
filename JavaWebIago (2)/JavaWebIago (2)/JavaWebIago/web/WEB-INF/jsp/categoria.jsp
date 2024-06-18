<%-- 
    Document   : categoria
    Created on : 16/04/2024, 14:52:57
    Author     : Senai
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="model.bean.Produtos" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <link rel="stylesheet" href="styles/header.css">
       
            <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
            <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="styles/index.css">
            <link rel="stylesheet" href="styles/footer.css">
            <title>JSP Page</title>
        </head>
        <body>
 <jsp:include page = "header.jsp"></jsp:include>
            <main>
                <div class="container1">
            <c:forEach items="${produtos}" var="produto">
                <div id="${produto.idProdutos}" class="produto">
                    <h2>${produto.nome_produtos}</h2>
                    <img src="data:image/png;base64,${produto.imagemBase64}" alt="${produto.nome_produtos}" id="imgPrt">
                    <p>R$ ${produto.preco}</p>
                    <button class="confirmar">
                            <a href="./Produto?id=${produto.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
                        </button>

                </div>
            </c:forEach>
                    </div>
                <span> ${abacate}</span>;

            
        </main>
        <jsp:include page = "footer.jsp"></jsp:include>
        <script src="./js/carrinho.js"></script>
    <script src="./js/perfil.js"></script>
    </body>
</html>
