 // Selecionar todas as miniaturas
        const thumbnails = document.querySelectorAll('.thumbnail');
        // Selecionar a imagem principal
        const mainImage = document.getElementById('mainImage');

        // Adicionar um evento de clique para cada miniatura
        thumbnails.forEach(thumbnail => {
            thumbnail.addEventListener('click', () => {
                // Atualizar o src da imagem principal com o src da miniatura clicada
                mainImage.src = thumbnail.src;
            });
        });
