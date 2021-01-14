<%-- 
    Document   : uploadfile
    Created on : 26 Jul, 2017, 12:16:11 PM
    Author     : S7
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
        <form name="f1" method="post" action="upload" enctype="multipart/form-data">
        <table>
            <tr>
                <td>choose your file</td>
                <td><input type="file" name="fl" id="fl" required="" ></td>
            </tr>
             <tr>
                <td></td>
                <td><input type="submit" value="upload"></td>
            </tr>
            
             
        </table>
        <%
            String a;
         %>
            
        <%
            try{
            connect cc1=new connect();
            
        cc1.read("select * from result where pt_id='1'");
        while(cc1.rs.next())
        {
        %>
        <input type="text" name="textresult" value="<%=cc1.rs.getString("description")%>" />
        <%
            
          }
          }
catch(Exception e){}
%>
          
        </form>
        
    </body>
</html>
