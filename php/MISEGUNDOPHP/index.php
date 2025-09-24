<?php
// Definimos algunas variables
$nombre = "Estudiante de PHP";
$hoy = date("d/m/Y H:i:s");

// Creamos una función para dar formato a un mensaje
function saludar($persona, $momento) {
    return "Hola, $persona 👋. Hoy es $momento";
}

function mayorOMenor($numero1,$numero2) {
    if ($numero1>$numero2){return "El mayor numero es, $numero1";}
    if ($numero2>$numero1){return "El mayor numero es, $numero2";}
}

function imprime($miArray) {
    $resultado = "";
    $i = 0;
    while ($i<5) {
        $resultado = $resultado.$miArray[$i];
        $resultado = $resultado. " ";
        $i++;
    }
    return $resultado; 
}


// Un array con frases motivacionales
$frases = [
    "Aprender un lenguaje nuevo siempre abre puertas 🚪",
    "PHP es el motor detrás de gran parte de la web 🌐",
    "Practicar cada día te hará mejorar 💪"
];

$nombret = "Luis";
function damePeso($miDiccionario, $nombret) {
 return "El peso de ".$nombret." es " .$miDiccionario[$nombret];   
}


// Elegimos una frase aleatoria
$frase = $frases[array_rand($frases)];

$numero1 = 20;
$numero2 = 21;

$miArray = [2,4,6, 8, 10];

$miDiccionario = array(
"Pepe"=>23,
"Juan"=> 45,
"Eva"=> 60,
"Luis"=> 70,
"Fede"=> 90,
);

function mostrarDiccionario($diccionario) {
    foreach ($diccionario as $nombre => $Peso) {
        echo "$nombre - Peso: $Peso<br>";
    }
}

?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Mi primera app PHP</title>
</head>
<body>
    <h1><?php echo saludar($nombre, $hoy); ?></h1>
    <p><strong>Frase del día:</strong> <?php echo $frase; ?></p>
    <h1><?php echo mayorOMenor($numero1,$numero2) ?></h1>

    <p>
        <?php foreach($miArray as $numero) {echo  "$numero <br>";} ?>
    </p>
    <p> <?php echo imprime($miArray) ?> </p>
    <p>
        <?php echo damePeso($miDiccionario, $nombret)?>
    </p>
    <p>
        <?php echo mostrarDiccionario($miDiccionario)?>
    </p>

</body>
</html>