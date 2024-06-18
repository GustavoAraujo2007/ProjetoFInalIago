<%-- 
    Document   : loginjsp
    Created on : 15/04/2024, 16:34:03
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/login.css">
        <title>Document</title>
        <script src="https://kit.fontawesome.com/b321e58993.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="box1">
                <div class="caixa">
                    <h2>Bem-vindo de Volta</h2> 
                    <div class="btn1">
                        <a href="./Cadastro"><button>Cadastrar</button></a>
                    </div>

                </div>
            </div>
            <div class="box">
                <form action="logar" class="sign-in-form" enctype="multipart/form-data" method="get" >
                    <div class="titulo">
                        <h1>Logar</h1>
                    </div>
                    <div class="input">
                        <i class="fa-regular fa-envelope" aria-hidden="true"></i>
                        <input type="email" id="gmail"  name="gmail" placeholder="Gmail" required>
                    </div>
                    <div class="input">
                        <i class="fa-solid fa-lock" aria-hidden="true"></i>
                        <input type="password" id="password"  pattern="[0-9a-zA-Z!@#$%&*]{1,10}" name="senha"  placeholder="Password" required>

                    </div>
                    <div class="btn">
                        <button type="submit">Confirmar</button>
                    </div>
                </form>
            </div>
        </div>
        <script type="text/javascript">
            function validarCampos() {
                var gmail = document.getElementById('gmail').value;
                var senha = document.getElementById('password').value;

                if (gmail.trim() === '' || senha.trim() === '') {
                    // Se algum dos campos estiver vazio, exibe um alerta usando o SweetAlert
                    Swal.fire({
                        title: "Erro!",
                        text: "Por favor, preencha todos os campos.",
                        icon: "error"
                    });
                    return false; // Impede o envio do formulário
                }
                return true; // Envie o formulário se os campos estiverem preenchidos
            }
        </script>
    </body>
</html>
