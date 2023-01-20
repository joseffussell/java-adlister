<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <h1>Pick Color</h1>
    <form action="/pickcolor" method="post">
        <input type="color" name="color">
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</body>
</html>
