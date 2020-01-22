<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 3:18:48 AM
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
                <h1>Arithmetic Calculator</h1>
                <b>First: </b><input type="text" name="first" value="${firstValue}"/><br/>
                <b>Second: </b><input type="text" name="second" value="${secondValue}"/><br/>
                <input type="submit" name="add" value="+"/> <input type="submit" name="sub" value="-"/>
                <input type="submit" name="multi" value="*"/> <input type="submit" name="divide" value="/"/><br>
                <div><b>Result: </b>${calculation}</div><br>
                <a href="age"><b>Age Calculator </b></a>
            </form>
        </div>
    </body>
</html>
