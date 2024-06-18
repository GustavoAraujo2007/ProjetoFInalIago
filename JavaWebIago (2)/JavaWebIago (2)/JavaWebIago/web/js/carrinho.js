document.addEventListener("DOMContentLoaded", function () {
    const carrinho = document.getElementById("carrinho");
    const btnAbrir = document.getElementById("btn-abrir-carrinho");
    const btnFechar = document.getElementById("fechar-carrinho");
    const totalPrecoElement = document.getElementById("totalPreco"); // Elemento que contém o valor total do preço
    const abacateElement = document.getElementById("abacate"); // Elemento que contém o valor do abacate

    btnAbrir.addEventListener("click", function () {
        const abacateValue = abacateElement.textContent.trim(); // Obtém o valor do elemento abacate
        if (abacateValue === 'null' || abacateValue === '') {
            Swal.fire({
                icon: "warning",
                title: "Login ",
                text: "Entre em sua conta para comprar",
                footer: '<a href="./Login">Fazer Login?</a>'
            });

            return; // ACABA A FUNCAO AQUI
        }

        const totalPrecoString = totalPrecoElement.textContent.trim(); // Obtém o texto do elemento totalPreco
        if (totalPrecoString === 'R$null' || parseFloat(totalPrecoString.replace('R$', '').trim()) === 0) {
            const Toast = Swal.mixin({
                toast: true,
                position: "top-end",
                showConfirmButton: false,
                timer: 1200,
                timerProgressBar: true,
                didOpen: (toast) => {
                    toast.onmouseenter = Swal.stopTimer;
                    toast.onmouseleave = Swal.resumeTimer;
                }
            });
            Toast.fire({
                icon: "warning",
                title: "Adicione Itens no carrinho"
            });

            return; // ACABA A FUNCAO AQUI
        }
        carrinho.classList.add("ativo");
    });

    btnFechar.addEventListener("click", function () {
        carrinho.classList.remove("ativo");
    });
});

document.addEventListener("DOMContentLoaded", function () {
    const btn = document.getElementById("checkout");
     btn.addEventListener("click", function () {
         window.location.href = "./Checkout";
     });
});

// Array para armazenar os IDs dos produtos no carrinho
var produtosNoCarrinho = [];

document.querySelectorAll('.btn-comprar').forEach(btn => {
    btn.addEventListener('click', function () {
        var idProduto = this.getAttribute('data-id');
        var idUsuario = this.getAttribute('data-idusuario');
        var descricao = this.getAttribute('data-descricao');
        var nome = this.getAttribute('data-nome');
        var preco = this.getAttribute('data-preco');
        var imagens = this.getAttribute('data-imagem');

        if (idUsuario === null || idUsuario === '') {
            Swal.fire({
                icon: "warning",
                title: "Login",
                text: "Entre em sua conta para comprar",
                footer: '<a href="./Login">Fazer Login?</a>'
            });
            return; // Saia da função para evitar o envio do formulário
        }

        // Verifica se o produto já está no carrinho
        

        // Adiciona o ID do produto ao array de produtos no carrinho
        produtosNoCarrinho.push(idProduto);

        var selectQuantidade = document.getElementById('qtdP');
        var quantidade = selectQuantidade ? selectQuantidade.value : 1; // valor padrão 1 se o select não for encontrado

        var selectTamanho = document.getElementById('size');
        var tamanho = selectTamanho ? selectTamanho.value : 39; // valor padrão 39 se o select não for encontrado

        var formData = new FormData();

        formData.append('idProduto', idProduto);
        formData.append('idUsuario', idUsuario);
        formData.append('descricao', descricao);
        formData.append('nome', nome);
        formData.append('preco', preco);
        formData.append('quantidade', quantidade);
        formData.append('tamanho', tamanho);

        // Crie um Blob a partir do base64 da imagem
        var byteCharacters = atob(imagens);
        var byteNumbers = new Array(byteCharacters.length);
        for (var i = 0; i < byteCharacters.length; i++) {
            byteNumbers[i] = byteCharacters.charCodeAt(i);
        }
        var byteArray = new Uint8Array(byteNumbers);
        var blob = new Blob([byteArray], { type: 'image/png' });

        // Adicione a imagem ao FormData
        formData.append('imagem', blob, 'imagem.png');

        // Envie o FormData
        fetch('enviarFormulario', {
            method: 'POST',
            body: formData
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Ocorreu um erro ao enviar o formulário.');
            }

            const Toast = Swal.mixin({
                toast: true,
                position: "top-end",
                showConfirmButton: false,
                timer: 1200,
                timerProgressBar: true,
                didOpen: (toast) => {
                    toast.onmouseenter = Swal.stopTimer;
                    toast.onmouseleave = Swal.resumeTimer;
                }
            });
            Toast.fire({
                icon: "success",
                title: "Item adicionado no carrinho"
            });
        })
        .catch(error => {
            console.error('Erro:', error);
        });
    });
});
