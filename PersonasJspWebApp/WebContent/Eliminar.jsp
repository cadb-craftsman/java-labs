<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar persona</title>
</head>
<body>
<form action="controllerServlet" method="post">
	<input type="hidden" name="navigation" value="consultar_eliminar">
		<table>
			<thead>
				<tr>
					<th colspan="3">Eliminar Persona</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><label>Id Persona:</label></td>
					<td><input id="id" name="id" type="text" /></td>					
					<td><input type="submit" value="Eliminar" /></td>
				</tr>					
			</tbody>
		</table>
	</form>
	<a href="Index.html">Regreso a Inicio</a>
</body>
</html>