<?php
$nombre = "Estudiante de php";
$hoy = date("d/m/Y H:i:s");

function saludar($nombre, $hoy) {
    return "Hola $nombre, hoy es $hoy";
}

$frases = [
    "FRASE 1",
    "FRASE 2",
    "FRASE 3"
];

$frase = $frases[array_rand($frases)];

$mostrarContenido = false;

if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['mostrar'])) {
    $mostrarContenido = true;
}
?>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <title>Mi primera app php</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #89f7fe 0%, #66a6ff 100%);
            color: #333;
            text-align: center;
            padding: 50px;
        }

        button {
            background-color: #ff6f61;
            border: none;
            color: white;
            padding: 15px 30px;
            font-size: 1.2em;
            border-radius: 8px;
            cursor: pointer;
            box-shadow: 0 4px 10px rgba(255, 111, 97, 0.5);
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #ff3b2e;
        }

        h1 {
            color: #fff;
            text-shadow: 2px 2px 6px rgba(0, 0, 0, 0.3);
        }

        p {
            font-size: 1.3em;
            background: rgba(255, 255, 255, 0.8);
            display: inline-block;
            padding: 15px 25px;
            border-radius: 12px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            margin-top: 20px;
            color: #333;
            font-weight: 600;
        }
    </style>
</head>

<body>
    <form method="post">
        <button type="submit" name="mostrar">Sorpresa</button>
    </form>

    <?php if ($mostrarContenido): ?>
        <h1><?php echo saludar($nombre, $hoy); ?></h1>
        <p><strong>Frase del día:</strong> <?php echo $frase ?></p>
    <?php endif; ?>
</body>

</html>
