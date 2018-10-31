<%-- 
    Document   : postkandidat
    Created on : Oct 28, 2018, 10:10:04 AM
    Author     : Nande
--%>

<%@page import="org.apache.http.HttpResponse"%>
<%@page import="org.apache.http.entity.StringEntity"%>
<%@page import="org.apache.http.client.methods.HttpPost"%>
<%@page import="org.apache.http.impl.client.HttpClientBuilder"%>
<%@page import="org.apache.http.impl.client.CloseableHttpClient"%>
<%@page import="org.json.JSONObject"%>
<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.Request"%>
<%@page import="javax.ws.rs.core.Response"%>
<%@page import="org.springframework.web.bind.annotation.RequestBody"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            JSONObject json = new JSONObject();
        json.put("nama", request.getAttribute("nama"));
        json.put("email", request.getAttribute("email"));
        json.put("tglLahir", request.getAttribute("tglLahir"));
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        try {
            HttpPost httpPost = new HttpPost("http://localhost:8080/home/kandidats");
            StringEntity params = new StringEntity(json.toString());
            httpPost.addHeader("content-type", "application/json");
            httpPost.setEntity(params);
            HttpResponse httpResponse = httpClient.execute(httpPost);
// handle response here...
        } catch (Exception ex) {
            // handle exception here
        } finally {
            httpClient.close();
        }
        %>
    </body>
</html>
