<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.bean.Categoria" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles/cadastroProdutos.css">
    <title>Cadastro de Produtos</title>
   
</head>
<body>
      <div class="nav-item">
          <a href="./indexAdm"><i class="fa-solid fa-right-from-bracket" style="color: black; font-size: 25px"></i></a>
        </div>
    <form action="produtos" class="sign-in-form" enctype="multipart/form-data" method="post">
        <h2>Cadastro de Produto</h2>
        <h2>Nome</h2>
        <input type="text" id="nome" name="nome" placeholder="nomedo Produto" required>
        
        <h2>Categoria</h2>
        <select id="categorias" name="categoria" required>
             <option value="">Escolha...</option>
            <c:forEach items="${categoria}" var="categorias">
                
                <option value="${categorias.idCategoria}">${categorias.nome}</option>
            </c:forEach>
        </select>
        <h2>Seçao</h2>
            <select class="secao" id="secao"  name="secao" required>
                 <option value="">Escolha...</option>
                <c:forEach items="${secao}" var="secoes">
                     
                    <option value="${secoes.idSecao}">${secoes.nomeSecao}</option>
                </c:forEach>
            </select>

        <h2>Preço</h2>
        <input type="number" id="preco" name="preco" placeholder="Preço" required>

        <h2>Descrição</h2>
        <input type="text" id="descricao" name="descricao" placeholder="Descrição" required>
        
        <h2>Quantidade Para o Etoque</h2>
        <input type="number" id="descricao" name="quantidade" placeholder="quantidade" required>

        <h2>Cor</h2>
        <input type="text" id="cor" name="cor" placeholder="Cor" required>

        <h2>Sobre</h2>
        <input type="text" id="sobre" name="sobre" placeholder="Sobre" required>

        <h2>Imagem Principal</h2>
        <input type="file" id="imagem" name="imagem" placeholder="Imagem" required>
        
         <h2>Imagem 1</h2>
        <input type="file" id="imagem" name="imagem1" placeholder="Imagem" required>
        
         <h2>Imagem 2</h2>
        <input type="file" id="imagem" name="imagem2" placeholder="Imagem" required>
        
         <h2>Imagem 3</h2>
        <input type="file" id="imagem" name="imagem3" placeholder="Imagem" required>
        
         <h2>Imagem 4</h2>
        <input type="file" id="imagem" name="imagem4" placeholder="Imagem" required>

        <button type="submit">Cadastrar</button>
    </form>
    <script src="js/cadastroProdutos.js"></script>
</body>
</html>
