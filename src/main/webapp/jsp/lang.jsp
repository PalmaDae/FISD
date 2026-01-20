<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Выбор языка</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/language" method="post">
    <label>
        <input type="radio" name="lang" value="ru"> Русский
    </label><br>

    <label>
        <input type="radio" name="lang" value="en"> English
    </label><br>

    <label>
        <input type="radio" name="lang" value="da"> Dansk
    </label><br><br>

    <button type="submit">Сохранить</button>
</form>

</body>
</html>