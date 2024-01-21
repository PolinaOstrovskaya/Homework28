<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html >
<head>
    <title>Успешное сохранение заявки</title>
</head>
<body>
<h2>Заявка успешно сохранена</h2>
<p>Имя: <%= request.getParameter("name") %></p>
<p>Email: <%= request.getParameter("email") %></p>
</body>
</html>
