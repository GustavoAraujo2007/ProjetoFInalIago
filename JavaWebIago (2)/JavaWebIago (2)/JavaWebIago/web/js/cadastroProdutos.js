 // Função para aplicar .trim() nos campos de texto
        function trimInputs() {
            var nomeInput = document.getElementById('nome');
            var descricaoInput = document.getElementById('descricao');

            // Aplicando .trim() nos valores dos campos de texto
            nomeInput.value = nomeInput.value.trim();
            descricaoInput.value = descricaoInput.value.trim();
        }

        // Adicionando um ouvinte de evento para chamar a função trimInputs() quando o formulário for enviado
        document.querySelector('form').addEventListener('submit', trimInputs);