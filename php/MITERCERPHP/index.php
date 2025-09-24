<?php
declare(strict_types=1);

$nombre = "Estudiante";
$edad = 21;
$punt = "10";

// tipos y conversión
$sum = (int)$punt + 5;

// operador ternario y coalescing
$estado = ($edad >= 18) ? "mayor" : "menor";
$nick = $undefined ?? 'anon';

// función
function bienvenida(string $nom): string {
    return "Bienvenido, $nom!";
}

// array básico para foreach
$tareas = ["Aprender sintaxis", "Crear formulario", "Practicar Docker"];

?>
<!doctype html>
<html lang="es">
<head><meta charset="utf-8"><title>Sintaxis PHP</title></head>
<body>
    <h1><?= bienvenida($nombre) ?></h1>
    <p>Edad: <?= $edad ?> (<?= $estado ?>)</p>
    <p>Suma ejemplo: <?= $sum ?></p>
    <p>Nick: <?= $nick ?></p>

    <h2>Tareas</h2>
    <ul>
    <?php foreach ($tareas as $i => $t): ?>
        <li><?= ($i+1) ?>. <?= htmlspecialchars($t) ?></li>
    <?php endforeach; ?>
    </ul>

    <h2>Bucle for</h2>
    <?php for ($i=1; $i<=3; $i++): ?>
        <div>contador: <?= $i ?></div>
    <?php endfor; ?>
</body>
</html>