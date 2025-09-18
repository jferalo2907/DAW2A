function textoEdad() {
   
    let edad = document.querySelector("#edad").value;
    let respuesta1 = document.querySelector("#respuesta1");
    let respuesta2 = document.querySelector("#respuesta2");
    let respuesta3 = document.querySelector("#respuesta3");
    if(edad <18) {
        respuesta1.textContent = "No puede beber"
        respuesta2.textContent = "No puede ir a la fiesta"
        respuesta3.textContent = "No tiene entrada gratis"
    }
    else if(edad>=18 && edad <20) {
          respuesta1.textContent = "Si puede beber"
        respuesta2.textContent = "Ni puede ir a la fiesta"
        respuesta3.textContent = "No tiene entrada gratis"
    }

    else if(edad>=20 && edad <=25) {
          respuesta1.textContent = "Si puede beber"
        respuesta2.textContent = "Si puede ir a la fiesta"
        respuesta3.textContent = "Si tiene entrada gratis"
    }
    else if(edad>25) {
          respuesta1.textContent = "Si puede beber"
        respuesta2.textContent = "Si puede ir a la fiesta"
        respuesta3.textContent = "No     tiene entrada gratis"
    }
}

