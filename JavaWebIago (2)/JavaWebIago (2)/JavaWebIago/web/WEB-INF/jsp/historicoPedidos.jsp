<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="styles/historicosPedidos.css"> 
    <title>Histórico de Pedidos</title>
</head>
<body>
     <jsp:include page = "header.jsp"></jsp:include>
    <div class="container container-inf">
        <h2 class="text-center mb-4">Histórico de Pedidos</h2>
        <div class="table-responsive">
            <table class="table table-bordered table-hover">
                <thead class="thead-light">
                    <tr>
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
    <script src="./js/carrinho.js"></script>
    <script src="./js/perfil.js"></script>
</body>
</html>
