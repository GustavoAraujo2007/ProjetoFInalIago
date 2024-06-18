<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/cadastro.css">
    <title>Document</title>
    <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <div class="box1">
            <div class="caixa">
                <h2>Bem-vindo de Volta</h2> 
                <div class="btn1">
                    <a href="./Login"><button>Logar</button></a>
                </div>
                
            </div>
        </div>
        <div class="box">
            <form action="cadastrar" class="sign-in-form" enctype="multipart/form-data" method="post" >
            <div class="titulo">
                <h1>Cadastrar</h1>
            </div>
            <div class="input">
                <i class="fa-regular fa-envelope" aria-hidden="true"></i>
                <input type="text" id="nome" name="nome" patern="[a-zA-Z]+" placeholder="Nome" required>
            </div>
            <div class="input">
                <i class="fa-solid fa-phone" aria-hidden="true"></i>
                <input type="tel" id="telefone" name="telefone" placeholder="Telefone" required>
            </div>
            
            <div class="input">
                <i class="fa-regular fa-id-card" aria-hidden="true"></i>
                <input type="text" id="cpf" name="cpf" placeholder="Cpf" required>
            </div>
            <div class="input">
                <i class="fa-regular fa-envelope" aria-hidden="true"></i>
                <input type="email" id="gmail" name="gmail" placeholder="Gmail" pattern="[0-9a-zA-Z@]{1,10}" required>
            </div>
             <div class="input">
                 <i class="fa-solid fa-lock" aria-hidden="true"></i>
                 <input type="password" id="senha"name="senha" pattern="[0-9a-zA-Z!@#$%&*]{1,10}" placeholder="Password" required>
             </div>
            <div class="btn">
                <button type="submit">Confirmar</button>
            </div>
        </form>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.js"></script>
    <script src="js/validacao.js"></script>
</body>
</html>