document.getElementById('form-checkout').addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent form from submitting the traditional way
    var formData = new FormData(this);
    fetch('enviarFor', {
        method: 'POST',
        body: formData
    }).then(response => {
        if (response.ok) {
            return response.text(); // or response.json() if your server returns JSON
        }

    }).then(data => {
        // Handle successful response
        Swal.fire({
            title: 'Success!',
            text: 'Compra realizado com sucesso ',
            icon: 'success',
            confirmButtonText: 'OK'
        }).then((result) => {
            if (result.isConfirmed || result.isDismissed) {
                window.location.href = "./Index";
            }
        });
    })
});