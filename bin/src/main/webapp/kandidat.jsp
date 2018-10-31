<%-- 
    Document   : kandidat
    Created on : Oct 27, 2018, 8:03:46 PM
    Author     : Nande
--%>

<%@page import="model.Kandidat"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Springboot REST Client</title>
    </head>
    <body>
        <% List<Kandidat> kandidats = (List<Kandidat>)session.getAttribute("dataKandidat"); %>
        <table border="0">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nama</th>
                    <th>Email</th>
                    <th>Tanggal Lahir</th>
                </tr>
            </thead>
            <tbody>
                <% for (Kandidat kandidat : kandidats) {
                %>
                <tr>
                    <td><%= kandidat.getId() %></td>
                    <td><%= kandidat.getNama() %></td>
                    <td><%= kandidat.getEmail() %></td>
                    <td><%= kandidat.getTglLahir() %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>
