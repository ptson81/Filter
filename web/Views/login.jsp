<%-- 
    Document   : login
    Created on : Apr 17, 2024, 1:50:54 PM
    Author     : zzako
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <h1 style color='red'>${error}</h1>
        <form action="Login" method="post">
            ID:<input type="text" name="id" value=""><br/><!-- comment -->
            Pass:<input type="password" name="pass" value=""><br/>
            Roll:<input type="number" name="roll" min="0" value=""><br/>
            <input type="submit" value='Login'>
        </form>
    </body>
</html>
