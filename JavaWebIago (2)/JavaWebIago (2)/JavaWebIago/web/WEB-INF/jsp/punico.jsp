<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>
        <!-- Font Awesome -->
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
            rel="stylesheet"
            />
        <!-- Google Fonts -->
        <link
            href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
            rel="stylesheet"
            />
        <!-- MDB -->
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.0/mdb.min.css"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="styles/punico.css">
        <link rel="stylesheet" href="styles/header.css">
        <link rel="stylesheet" href="styles/footer.css"> 
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css"> 

        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
        <c:forEach items="${produtos}" var="produto">
            <div id="produto_${produto.idProdutos}" class="product">
                <div class="product-images">
                    <img id="mainImage" src="data:image/png;base64,${produto.imagemBase64}" alt="Imagem Principal">
                    <div class="thumbnails">      
                        <img class="thumbnail" src="data:image/png;base64,${produto.imagemBase64}"  alt="Miniatura 1">
                        <img class="thumbnail" src="data:image/png;base64,${produto.imagem3Base64}" alt="Miniatura 2">
                        <img class="thumbnail" src="data:image/png;base64,${produto.imagem2Base64}" alt="Miniatura 3">
                        <img class="thumbnail" src="data:image/png;base64,${produto.imagem3Base64}" alt="Miniatura 4">
                    </div>
                </div>
                <div class="product-details">
                    <p class="nomeProduto"> ${produto.nome_produtos}  </p>
                    <div class="rating">
                        <span>⭐⭐⭐⭐☆</span> (20) <a href="#">Avaliar produto</a>
                    </div>
                    <div class="price">
                        <p id="preco">R$ ${produto.preco}</p>
                    </div>
                    <div class="size">
                        <p class="qtdP">Tamanho</p>
                        <select id="size">
                            <option value="38">38</option>
                            <option value="39">39</option>
                            <option value="40">40</option>
                            <option value="41">41</option>
                            <option value="42">42</option>
                        </select>
                    </div>
                    <div class="qtdP">
                        <p>Quantidade</p>
                        <select id="qtdP">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                        </select>
                    </div>
                    <div class="actions">
                        <button class="btn-comprar" type="submit" data-id="${produto.idProdutos}" data-descricao="${produto.descricao}" data-nome="${produto.nome_produtos}" data-preco="${produto.preco}" data-idusuario="${abacate}" data-imagem="${produto.imagemBase64}"
                                data-quantidade=1 id="comprar">
                            <i class="fa-solid fa-basket-shopping"></i>ADICIONAR ÀO CARRINHO</button>
                    </div>
                </div>
            </div>
        </c:forEach>
        <form id="form-comprar" action="enviarFormulario" method="post" enctype="multipart/form-data" style="display: none;">
            <input type="hidden" name="idProduto" id="idProduto">
            <input type="hidden" name="descricao" id="descricao">
            <input type="hidden" name="nome" id="nome">
            <input type="hidden" name="preco" id="preco">
            <input type="file" name="imagem" id="imagem">
            <input type="hider" name="quantidade" id="quantidade">
            <input type="hider" name="quantidade" id="tamanho">
        </form>
    </main>
</body>
</html>

<jsp:include page = "footer.jsp"></jsp:include>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="js/produtosVarios.js"></script>
<script src="js/carrinho.js"></script>
<script
    type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.0/mdb.umd.min.js"


    ></script>
</body>
</html>
