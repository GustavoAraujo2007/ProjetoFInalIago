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
        <header>
            <span id="abacate" style="display: none">${abacate}</span>
            <nav class="navbar navbar-expand-lg navbar-light bg-dark navbar-dark">
                <img src="assets/STARLI-removebg-preview (1).png" alt="Logo">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <i class="fa-solid fa-house"></i>
                            <a class="nav-link text-white" href="./Index">Home</a>
                        </li>
                        <li class="nav-item">
                            <i class="fa-solid fa-dollar-sign"></i>
                            <a class="nav-link text-white" href="./CategoriaProdutosController?id=6">Promoções</a>
                        </li>
                        <li class="nav-item">
                            <i class="fa-solid fa-person-dress"></i>
                            <a class="nav-link text-white" href="./CategoriaProdutosController?id=7">Feminino</a>
                        </li>
                        <li class="nav-item">
                            <i class="fa-solid fa-person"></i>
                            <a class="nav-link text-white" href="./CategoriaProdutosController?id=6">Masculino</a>
                        </li>
                        <li class="nav-item">
                            <i class="fa-solid fa-person-walking"></i>
                            <a class="nav-link text-white" href="./Categoria">Esportivo</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="material-symbols-outlined">
                                    steps
                                </span>
                                Marcas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="z-index:5">
                                <a class="dropdown-item" href="./CategoriaProdutosController?id=1">Puma</a>
                                <a class="dropdown-item" href="./CategoriaProdutosController?id=2">Nike</a>
                                <a class="dropdown-item" href="./CategoriaProdutosController?id=3">Adidas</a>
                                <a class="dropdown-item" href="./CategoriaProdutosController?id=4">Mizuno</a>
                            </div>
                        </li>
                    </ul>
                    <div class="car">
                        <i class="fa-solid fa-cart-shopping" id="btn-abrir-carrinho"></i>
                    </div>
                    <div class="user">                                                         
                        <i class="fa-solid fa-user" id="btn-abrir-perfil"></i> 
                    </div>
                    <form class="form-inline my-2 my-lg-0" action="pesquisar" enctype="multipart/form-data" method="post">
                        <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar" name="pesquisa">
                        <button class="btn" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
            </nav>
        </header>
        <div id="carrinho">
            <div id="carrinho-container">
                <div class="container">
                    <i id="fechar-carrinho" class="fa-solid fa-xmark"></i>
                    <p class="suasCompras">Suas Compras</p>
                    <c:forEach items="${carrinho}" var="carrinhos">
                        <div id="${carrinhos.idProdutos}" class="carrinhoProdutos">
                            <h2>${carrinhos.nomeCarrinho}</h2>
                            <img src="data:image/png;base64,${carrinhos.imagemBase64}" alt="${carrinhos.nomeCarrinho}">
                            <p id="p1" class="preco">R$ ${carrinhos.precoCarrinho}</p>
                            <p id="p1" class="preco">Tamanho[${carrinhos.tamanhoCarrinho}]</p>
                            <p id="p1" class="preco">uni ${carrinhos.quantidadeCarrinho}</p>
                            <button type="button" class="lixo" onclick="deleteCarrinho(${idCarrinho})">
                                <i class="fa-solid fa-trash"></i> Excluir Carrinho
                            </button>

                        </div>
                    </c:forEach>
                </div> 
                <div class="totalPreco">
                    <p>Total</p>
                    <p id="totalPreco">R$<c:out value="${totalPreco}" /></p>
                </div>
                <button class="checkout" id="checkout">
                    <i class="fa-solid fa-check"></i> Checkout
                </button>
            </div>
        </div>
        <div id="perfil">
            <div id="perfil-container">
                <i id="perfil-fechar" class="fa-solid fa-xmark"></i>
                <h3>Acesso Rapido</h3>
                <a class="a" href="./MinhaConta">Minha Conta</a>
                <a class="a" href="./HistoricoPedidios">Historico de Pedidos</a>
                <a href="./Login"><i class="fa-solid fa-door-open"></i></a>
            </div>
        </div>
        <script src="./js/carrinho.js"></script>
        <script src="./js/perfil.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    </body>
</html>
