document.addEventListener("DOMContentLoaded", function() {
    const perfil = document.getElementById("perfil");
    const btnAbrir = document.getElementById("btn-abrir-perfil");
    const btnFechar = document.getElementById("perfil-fechar");
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
        perfil.classList.add("ativo");
    });

    btnFechar.addEventListener("click", function() {
        perfil.classList.remove("ativo");
    })
    
});