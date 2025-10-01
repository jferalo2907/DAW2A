<?php

function validar_campo($campo) {
    if (empty($_POST[$campo])) {
        return false; // campo vacío
    }
    return trim(htmlspecialchars($_POST[$campo]));
}

$nombre = validar_campo('nombre');
$email  = validar_campo('email');
$edad   = validar_campo('edad');

$errores = [];

if ($nombre === false) $errores[] = "Falta el nombre";
if ($email === false)  $errores[] = "Falta el email";
if ($edad === false)   $errores[] = "Falta la edad";


if (!empty($errores)) {
    foreach ($errores as $error) {
        echo "<h3>$error</h3>";
    }
    exit;
}
?>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Documento</title>
</head>

<?php    ?>

<body>

    <h1>ALUMNO</h1>
    <h2>Bienvenido, <?php echo $nombre; ?></h2>
    <h2>Correo electrónico: <?php echo $email; ?></h2>
    <h2>Edad: <?php echo $edad; ?></h2>

</body>

</html>
