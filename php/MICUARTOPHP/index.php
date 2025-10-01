<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Registro</title>
</head>
<body>
    <h2>Registro de Usuario</h2>
    <form action="procesar.php" method="POST">
        <label>Nombre:</label><br>
        <input type="text" name="nombre"><br><br>

        <label>Correo electrónico:</label><br>
        <input type="email" name="email"><br><br>

        <label>Edad:</label><br>
        <input type="number" name="edad"><br><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
