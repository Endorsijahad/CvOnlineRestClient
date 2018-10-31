/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nande.restclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Kandidat1;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Nande
 */
public class getData {
    
    final static String REST_SERVICE_URI = "http://localhost:8080/home/kandidats";
    
    public static void main(String[] args) {
        getAll();
    }
    
    public static void getAll() {
        try {

            RestTemplate restTemplate = new RestTemplate();
//            List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI, List.class);

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
            /* headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML)); */

            // Prepare HttpEntity
            HttpEntity<String> entity = new HttpEntity<String>(headers);

            // Invoke the REST service
            ResponseEntity<String> result = restTemplate.exchange(REST_SERVICE_URI,
                    HttpMethod.GET, entity, String.class, "Rajesh");

//            System.out.println("\n\ndari normal \n"+ result.getBody() + "\n\n");
            ObjectMapper objectMapper = new ObjectMapper();
            List<Kandidat1> items = objectMapper.readValue(result.getBody(),
                    objectMapper.getTypeFactory().constructParametricType(List.class, Kandidat1.class)
            );
            List<Kandidat1> kandidats = new ArrayList<Kandidat1>();
//            System.out.println(items.size());
            for (Kandidat1 kandidat : items) {
                System.out.println("id : " + kandidat.getId());
                System.out.println("nama : " + kandidat.getNama());
                System.out.println("email : " + kandidat.getEmail());
                System.out.println("tanggal lahir : " + kandidat.getTglLahir());
                System.out.println("");
            }
        } catch (Exception e) {
            String msg = e.getMessage();
            String err = msg;
        }
    }
}

