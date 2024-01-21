<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Форма для ввода заявки</title>
</head>
<body>
<h2>Заявка</h2>
<form action="process-request" method="post">
    <label for="name">Имя:</label><br>
    <input type="text" id="name" name="name"><br>
    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email"><br>
    <input type="submit" value="Отправить">
</form>
</body>
</html>