<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="../../css/restaurante.css" rel="stylesheet" >
    <title>Restaurante</title>
</head>
<body>
    <header>
        <h1>Registrar Restaurante</h1>
    </header>
    <main>
        <form action="#" onsubmit="return validar()" name="form">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre">
            <label for="especialidad">Especialidad: </label>
            <input type="text" id="especialidad" name="especialidad">
            <label for="direccion">Direccion: </label>
            <input type="text" id="direccion" name="direccion">
            <button id="ir-a-menu">Ir a Menu</button>
            <div class="condiciones">
                <label for="condiciones">Acepto Términos y Condiciones:</label>
                <input type="checkbox" name="condiciones" id="condiciones">
            </div>
            <input type="submit" value="Enviar">
            <div id="mensaje" class="error">

            </div>
        </form>
    </main>
</body>
</html>
