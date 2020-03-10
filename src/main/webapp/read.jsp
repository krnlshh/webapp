<%--
--%>
<%@ page language="java" %>
<%@ page import ="java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actor</title>
    </head>

    <body>
        <h2>This is Actor Class</h2>

        <table>
        <TR>
            <TD>Actor ID: </TD>
            <TD>${read.actor_id}</TD>
        </TR>

        <TR>
            <TD>Lastname: </TD>
            <TD>${read.lastname}</TD>
        </TR>
         <TR>
            <TD>Firstname: </TD>
            <TD>${read.firstname}</TD>
        </TR>
        </table>

    </body>
</html>