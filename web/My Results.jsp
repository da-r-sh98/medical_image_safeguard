<%-- 
    Document   : MyResults
    Created on : 13 Jan, 2021, 11:45:05 AM
    Author     : Darshana P
--%>
<%@page import="doctorsearch.connect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>YOUR RESULTS ARE HERE</h1><br>
        <form name="result">
              <%
            try{
            connect cc1=new connect();
            
        cc1.read("select * from result where pt_id='1'");
        while(cc1.rs.next())
        {
        %>
        <%=cc1.rs.getString("description")%>
        <%
            
          }
          }
catch(Exception e){}
%>
        </form>
    </body>
</html>
