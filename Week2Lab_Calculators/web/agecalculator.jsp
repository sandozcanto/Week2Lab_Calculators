<%-- 
    Document   : agecalculator
    Created on : Jan 20, 2020, 1:25:42 PM
    Author     : 779137
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <form>
        <h1>Age Calculator</h1>
            <b>Enter your age: </b><input type="text" name="age"/><br/>
            <input type="submit" value="Age next birthday"/><br>
            <div>${message}</div><br>
            <a href="arithmetic"><b>Arithmetic Calculator </b></a>
        </form>
        </div>
    </body>
</html>
