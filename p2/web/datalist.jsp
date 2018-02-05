<%@page import="java.util.List"%>
<%@page import="javax.naming.InitialContext"%>
<% session.MyEntity1Facade f1; 
  f1=(session.MyEntity1Facade)new InitialContext().lookup("java:module/MyEntity1Facade");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%=3+2%><br />
        <% for(int i=0; i<5; i++){ %>
             Result: <%= i*i %> <br />
        <% } %>
        <%= f1.count() %>
        <table>
            <tr><th>id</th><th>x</th><th>y</th><th>result</th><th>count</th></tr>
        <%
        List<entity.MyEntity1> recordList=f1.findAll();
        for(entity.MyEntity1 record: recordList){
           out.println(record.tableLine());
        } 
        %>
        </table>
    </body>
</html>
