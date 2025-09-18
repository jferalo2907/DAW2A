function holaMundo() {
    alert("Hola Mundo");
}

function manipularDOM() {
    const nombre = prompt("Cual es tu nombre?");
    document.querySelector(".contenido").innerHTML = `probando la ${nombre}`;
   // document.querySelector("div").innerHTML = nombre;
}