<?php
$nombre = "Estudiante de php";
$hoy = date("d/m/Y H:i:s");

function saludar($nombre,$hoy){
    return "Hola $nombre, hoy es $hoy";
}

$frases = [
    "FRASE 1",
    "FRASE 2",
    "FRASE 3"
];

$frase = $frases[array_rand($frases)]; ?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <title>Mi primera app php</title>
</head>
<body>
    <h1> <?php echo saludar($nombre,$hoy); ?></h1>
    <p> <strong>frase del dia</strong> <?php echo $frase ?> </p>
</body>


</html>


echo "Hola, PHP desde docker";