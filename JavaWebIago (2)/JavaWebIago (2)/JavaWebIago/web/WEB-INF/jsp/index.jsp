<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>
         <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
        <link rel="stylesheet" href="styles/header.css">
        <link rel="stylesheet" href="styles/index.css"> 
        <link rel="stylesheet" href="styles/footer.css"> 
        
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
            <main>
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100" src="assets/2_1.png" alt="First slide">
                        </div>

                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div> 
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
                <div class="container1">
                    <c:forEach items="${produtos2}" var="produto2">
                        <div id="${produto2.idProdutos2}" class="produto">
                            <h2>${produto2.nome_produtos}</h2>
                            <img src="data:image/png;base64,${produto2.imagemBase64}" alt="${produto2.nome_produtos}" id="imgPrt">
                            <p>R$ ${produto2.preco}</p>
                            <button class="confirmar">
                                <a href="./Produto?id=${produto2.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
                            </button>

                        </div>
                    </c:forEach>
                </div>
                <div class="container1">
                <c:forEach items="${produtos3}" var="produto3">
                    <div id="${produto3.idProdutos}" class="produto">
                        <h2>${produto3.nome_produtos}</h2>
                        <img src="data:image/png;base64,${produto3.imagemBase64}" alt="${produto3.nome_produtos}" id="imgPrt">
                        <p>R$ ${produto3.preco}</p>
                        <button class="confirmar">
                            <a href="./Produto?id=${produto3.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
                        </button>

                    </div>
                </c:forEach>
            </div>
                <div class="container1">
            <c:forEach items="${produtos4}" var="produto4">
                <div id="${produto4.idProdutos}" class="produto">
                    <h2>${produto4.nome_produtos}</h2>
                    <img src="data:image/png;base64,${produto4.imagemBase64}" alt="${produto4.nome_produtos}" id="imgPrt">
                    <p>R$ ${produto4.preco}</p>
                    <button class="confirmar">
                        <a href="./Produto?id=${produto4.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
                    </button>

                </div>
            </c:forEach>
        </div>
        <div class="container1">
        <c:forEach items="${produtos5}" var="produto5">
            <div id="${produto5.idProdutos}" class="produto">
                <h2>${produto5.nome_produtos}</h2>
                <img src="data:image/png;base64,${produto5.imagemBase64}" alt="${produto5.nome_produtos}" id="imgPrt">
                <p>R$ ${produto5.preco}</p>
                <button class="confirmar">
                    <a href="./Produto?id=${produto5.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
                </button>

            </div>
        </c:forEach>
    </div>
                <div class="container1">
    <c:forEach items="${produtos6}" var="produto6">
        <div id="${produto6.idProdutos}" class="produto">
            <h2>${produto6.nome_produtos}</h2>
            <img src="data:image/png;base64,${produto6.imagemBase64}" alt="${produto6.nome_produtos}" id="imgPrt">
            <p>R$ ${produto6.preco}</p>
            <button class="confirmar">
                <a href="./Produto?id=${produto6.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
            </button>

        </div>
    </c:forEach>
</div>
                <div class="container1">
<c:forEach items="${produtos7}" var="produto7">
    <div id="${produto7.idProdutos}" class="produto">
        <h2>${produto7.nome_produtos}</h2>
        <img src="data:image/png;base64,${produto7.imagemBase64}" alt="${produto7.nome_produtos}" id="imgPrt">
        <p>R$ ${produto7.preco}</p>
        <button class="confirmar">
            <a href="./Produto?id=${produto7.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
        </button>

    </div>
</c:forEach>
</div>
                <div class="container1">
<c:forEach items="${produtos8}" var="produto8">
    <div id="${produto8.idProdutos}" class="produto">
        <h2>${produto8.nome_produtos}</h2>
        <img src="data:image/png;base64,${produto8.imagemBase64}" alt="${produto8.nome_produtos}" id="imgPrt">
        <p>R$ ${produto8.preco}</p>
        <button class="confirmar">
            <a href="./Produto?id=${produto8.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
        </button>

    </div>
</c:forEach>
</div>
                <div class="container1">
<c:forEach items="${produtos9}" var="produto9">
    <div id="${produto9.idProdutos}" class="produto">
        <h2>${produto9.nome_produtos}</h2>
        <img src="data:image/png;base64,${produto9.imagemBase64}" alt="${produto9.nome_produtos}" id="imgPrt">
        <p>R$ ${produto9.preco}</p>
        <button class="confirmar">
            <a href="./Produto?id=${produto9.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
        </button>

    </div>
</c:forEach>
</div>
                <div class="container1">
<c:forEach items="${produtos10}" var="produto10">
    <div id="${produto10.idProdutos}" class="produto">
        <h2>${produto10.nome_produtos}</h2>
        <img src="data:image/png;base64,${produto10.imagemBase64}" alt="${produto10.nome_produtos}" id="imgPrt">
        <p>R$ ${produto10.preco}</p>
        <button class="confirmar">
            <a href="./Produto?id=${produto10.idProdutos}"><i class="fa-solid fa-basket-shopping"></i><input class="Unico" type="submit" value="Comprar"></a> 
        </button>

    </div>
</c:forEach>
</div>
</div>
<span> ${abacate}</span>;
</main>
<jsp:include page = "footer.jsp"></jsp:include>

<script src="js/boostrap.js"></script>
<script src="js/slideProdutos.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</body>
</html>
