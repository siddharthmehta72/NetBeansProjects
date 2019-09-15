<%-- 
    Document   : newjsp
    Created on : 14-Sep-2019, 16:03:59
    Author     : Siddharth
--%>

<%@page import="java.sql.Connection"%>
<%@page import="com.mycompany.mavenproject1.DBManagement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>   
        <%    
            DBManagement db = new DBManagement();
            Connection conn = db.getConnection();
            if (conn ==null)
            {
                out.print ("Connection failed");
            }
            else 
                out.print("Connection succeed");
        %>
    </body>
</html>
