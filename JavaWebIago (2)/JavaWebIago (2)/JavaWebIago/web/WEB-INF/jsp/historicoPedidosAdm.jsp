<%-- 
    Document   : historicoPedidosAdm
    Created on : 16/06/2024, 20:46:58
    Author     : Hellen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0R7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="styles/header.css">
        <link rel="stylesheet" href="styles/footer.css"> 
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="nav-item">
          <a href="./indexAdm"><i class="fa-solid fa-right-from-bracket" style="color: black; font-size: 25px"></i></a>
        </div>
        <div class="container container-inf">
            <h2 class="text-center mb-4">Histórico de Pedidos</h2>
            <div class="table-responsive">
                <table class="table table-bordered table-hover">
                    <thead class="thead-light">
                        <tr>

                            <th>id User</th>
                            <th>id Produto</th>
                            <th>Produto</th>
                            <th>Qtd</th>
                            <th>Preço Uni</th>
                            <th>Tamanho</th>  
                            <th>total</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${historico}" var="historicos">
                            <tr>
                                <td>${historicos.idUsuario}</td>
                                <td>${historicos.idProdutos}</td>
                                <td>${historicos.nome_pedido}</td>
                                <td>${historicos.quantidade_pedido}</td>
                                <td>${historicos.preco_pedido}</td>
                                <td>${historicos.tamanho_pedido}</td>
                                <td>${historicos.total_precoPedido}</td>
                            </tr>

                        </c:forEach>


                    </tbody>
                </table>
            </div>
        </div>
        <jsp:include page = "footer.jsp"></jsp:include>
        <!-- Bootstrap JS, Popper.js, and jQuery -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
