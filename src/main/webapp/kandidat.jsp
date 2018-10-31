<%-- 
    Document   : kandidat
    Created on : Oct 27, 2018, 8:03:46 PM
    Author     : Nande
--%>

<%@page import="org.springframework.http.HttpMethod"%>
<%@page import="org.springframework.http.MediaType"%>
<%@page import="java.util.Arrays"%>
<%@page import="org.springframework.http.HttpHeaders"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="org.springframework.http.ResponseEntity"%>
<%@page import="org.springframework.http.HttpEntity"%>
<%@page import="org.springframework.http.converter.xml.MarshallingHttpMessageConverter"%>
<%@page import="org.springframework.oxm.xstream.XStreamMarshaller"%>
<%@page import="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter"%>
<%@page import="org.springframework.http.converter.HttpMessageConverter"%>
<%@page import="org.springframework.web.client.RestTemplate"%>
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
        <% List<Kandidat> kandidats = new ArrayList<>();
            try {
            final String REST_SERVICE_URI = "http://localhost:8080/home/kandidats";
            RestTemplate restTemplate = new RestTemplate();
            List<HttpMessageConverter<?>> messageConverterList = restTemplate
                    .getMessageConverters();

            // Add MappingJackson2HttpMessageConverter and MarshallingHttpMessageConverter to the messageConverterList
            MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
            XStreamMarshaller marshaller = new XStreamMarshaller();
            MarshallingHttpMessageConverter marshallingConverter = new MarshallingHttpMessageConverter(marshaller);
            messageConverterList.add(jsonMessageConverter);
            messageConverterList.add(marshallingConverter);
            restTemplate.setMessageConverters(messageConverterList);

            // Prepare HTTPHeaders
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            // Prepare HttpEntity
            HttpEntity<String> entity = new HttpEntity<>(headers);

            // Invoke the REST service
            ResponseEntity<String> result = restTemplate.exchange(REST_SERVICE_URI,
                    HttpMethod.GET, entity, String.class, "Rajesh");

            ObjectMapper objectMapper = new ObjectMapper();
            kandidats = objectMapper.readValue(
                    result.getBody(),
                    objectMapper.getTypeFactory().constructParametricType(List.class, Kandidat.class)
            );
        } catch (Exception e) {
            String msg = e.getMessage();
            String err = msg;
        }
        %>
        
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
