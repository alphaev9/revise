<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="book/onSale" method="post">
    <input name="title">
    <input name="author">
    <input name="press">
    <input name="pubDate" type="date">
    <button type="submit">onSale</button>
</form>
<form action="book/statistic" method="get">
    <input name="author">
    <button type="submit">statistic</button>
</form>

<a href="book/off/3">off</a>


</body>
</html>
