<%-- 
    Document   : suporte
    Created on : 03/06/2024, 17:02:42
    Author     : Senai
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
        <link rel="stylesheet" href="styles/footer.css"> 
        <link rel="stylesheet" href="styles/suporte.css"> 
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css"> 

        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>

            <main class="main-content">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 order-md-2 mb-4 " >
                            <ul class="list-group carrinho-list">
                            <c:forEach items="${carrinho}" var="carrinhos">
                                <li class="list-group-item d-flex justify-content-between lh-condensed">
                                    <div id="${carrinhos.idProdutos}" class="carrinhoProdutos">
                                        <h6 class="my-0">Second ${carrinhos.nomeCarrinho}</h6>
                                        <img src="data:image/png;base64,${carrinhos.imagemBase64}" alt="${carrinhos.nomeCarrinho}" class="produto-imagem">
                                        <small class="text-muted">Tamanho[${carrinhos.tamanhoCarrinho}]</small>
                                        <small class="text-muted">uni ${carrinhos.quantidadeCarrinho}</small>
                                    </div>
                                    <span class="text-muted preco-carrinho">R$ ${carrinhos.precoCarrinho}</span>
                                </li>
                            </c:forEach>
                            <li class="list-group-item d-flex justify-content-between">
                                <span>Total (RS)</span>
                                <strong>R$<c:out value="${totalPreco}" ></c:out></strong>

                                </li>
                            </ul>


                        </div>
                        <div class="col-md-8 order-md-1">

                            <form id="form-checkout" action="enviarFor" method="post" enctype="multipart/form-data">
                                <div class="row">
                                    <div class="col-md-6 mb-3">
                                        <label for="firstName">Nome </label>
                                        <input required type="text" class="form-control" id="firstName" name="nome" placeholder="" value="">

                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="lastName">Sobrenome</label>
                                        <input required type="text" class="form-control" id="lastName" name="sobrenome" placeholder="" value="" >

                                    </div>
                                </div>

                                <div class="mb-3">
                                    <label for="username">Email</label>
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">@</span>
                                        </div>
                                        <input type="email" class="form-control" id="email" name="email" placeholder="Email" required>

                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-5 mb-3">
                                        <label for="country">Pais</label>
                                        <select class="custom-select d-block w-100" name="pais" id="country" required>  
                                            <option value="">Escolha...</option>
                                            <option>Brasil</option>
                                        </select>

                                    </div>

                                    <div class="col-md-4 mb-3">
                                        <label for="state">Estado</label>
                                        <select  class="custom-select d-block w-100" name="estado" id="state" required>
                                            <option value="">Escolha...</option>
                                            <option value="Acre">Acre</option>
                                            <option value="Alagoas">Alagoas</option>
                                            <option value="Amapá">Amapá</option>
                                            <option value="Amazonas">Amazonas</option>
                                            <option value="Bahia">Bahia</option>
                                            <option value="Ceará">Ceará</option>
                                            <option value="Distrito Federal">Distrito Federal</option>
                                            <option value="Espírito Santo">Espírito Santo</option>
                                            <option value="Goiás">Goiás</option>
                                            <option value="Maranhão">Maranhão</option>
                                            <option value="Mato Grosso">Mato Grosso</option>
                                            <option value="Mato Grosso do Sul">Mato Grosso do Sul</option>
                                            <option value="Minas Gerais">Minas Gerais</option>
                                            <option value="Pará">Pará</option>
                                            <option value="Paraíba">Paraíba</option>
                                            <option value="Paraná">Paraná</option>
                                            <option value="Pernambuco">Pernambuco</option>
                                            <option value="Piauí">Piauí</option>
                                            <option value="Rio de Janeiro">Rio de Janeiro</option>
                                            <option value="Rio Grande do Norte">Rio Grande do Norte</option>
                                            <option value="Rio Grande do Sul">Rio Grande do Sul</option>
                                            <option value="Rondônia">Rondônia</option>
                                            <option value="Roraima">Roraima</option>
                                            <option value="Santa Catarina">Santa Catarina</option>
                                            <option value="São Paulo">São Paulo</option>
                                            <option value="Sergipe">Sergipe</option>
                                            <option value="Tocantins">Tocantins</option>


                                        </select>

                                    </div>
                                    <div class="mb-3">
                                        <input type="hidden" name="idUsuario" id="idUsuario" value="${abacate}">

                                    <label for="address">Cidade</label>
                                    <input type="text" class="form-control" name="cidade" id="city" placeholder="" pattern="[A-Za-z]+" title="Por favor, insira apenas letras" maxlength="50" required>


                                </div>

                            </div>

                            <div class="mb-3">
                                <label for="address">Bairro</label>
                                <input type="text" class="form-control" id="address" name="bairro"  placeholder=""  pattern="[A-Za-z0-9]+" title="Por favor, insira apenas letras e numeros" maxlength="50" required>

                            </div>
                            <div class="mb-3">
                                <label for="address">Rua</label>
                                <input type="text" class="form-control" id="street" name="rua" placeholder=""  pattern="[A-Za-z0-9]+" title="Por favor, insira apenas letras e numeros" maxlength="100" required>

                            </div>
                            <div class="mb-3">
                                <label for="address">Numero</label>
                                <input type="number" class="form-control" id="number" name="numero" placeholder=""  pattern="[A-Za-z0-9]+" title="Por favor, apenas numeros" min="1"max="9999"maxlength="4"required>

                            </div> 

                            <div class="d-block my-3">
                                <div class="custom-control custom-radio">
                                    <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked required>
                                    <label class="custom-control-label" for="credit">Cartao de Credito</label>
                                </div>
                                <div class="custom-control custom-radio">
                                    <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required>
                                    <label class="custom-control-label" for="debit">Cartao de Debito </label>
                                </div>
                                <div class="custom-control custom-radio">
                                    <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input" required>
                                    <label class="custom-control-label" for="paypal">PayPal</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="cc-name">Nome do Cartão</label>
                                    <input type="text" class="form-control" id="cc-name" placeholder="" pattern="[A-Za-z]+" title="Por favor, insira apenas letras" required>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <label for="cc-number">Número do Cartão</label>
                                    <input type="text" class="form-control" id="cc-number" placeholder="" minlength="16" maxlength="16" required>


                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3 mb-3">
                                    <label for="cc-expiration">Expiração (MM/AA)</label>
                                    <input type="text" class="form-control" id="cc-expiration" placeholder="MM/AA" maxlength="5" required pattern="^(0[1-9]|1[0-2])\/(2[4-9]|[3-9][0-9])$">
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="cc-cvv">CVV</label>
                                    <input type="text" class="form-control" id="cc-cvv" placeholder="" maxlength="3" title="Por favor, apenas numeros" required pattern="[0-9]{3,4}">
                                </div>
                            </div>


                            <button class="btn btn-primary btn-lg btn-block" id="btn_finalizar" type="submit"style="background-color: blue" >Finalizar Compra</button>
                        </form>
                        <script>
                        </script>

                    </div>
                </div>

            </div>



        </main>
         <script src="js/validacao.js"></script>
        <jsp:include page = "footer.jsp"></jsp:include>

        <!-- MDB -->

        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.0/mdb.umd.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

        <script src="js/checkout.js"></script> 
    </body>
</html>
