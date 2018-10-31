package com.nande.restclient;

import com.google.gson.Gson;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nande
 */
public class postData {

    final static String REST_SERVICE_URI = "http://localhost:8080/home/kandidats";

    public static void main(String[] args) throws IOException, JSONException {
//        postKandidat();
        putKandidat();
    }
    private static String dateToString(Date date){
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        return formater.format(date);
    }
    public static void postKandidat() throws JSONException, IOException {
        JSONObject json = new JSONObject();
        json.put("nama", "coba aja");
        json.put("email", "adaaja@gmail.com");
        json.put("tglLahir", "2001-02-20");
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        try {
            HttpPost request = new HttpPost(REST_SERVICE_URI);
            StringEntity params = new StringEntity(json.toString());
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
// handle response here...
        } catch (Exception ex) {
            // handle exception here
        } finally {
            httpClient.close();
        }
    }
    
    public static void putKandidat() throws JSONException, IOException{
        JSONObject json = new JSONObject();
        json.put("nama", "coba update");
        json.put("email", "windingz@gmail.com");
        json.put("tglLahir", "1995-06-25");
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        try {
            HttpPut request = new HttpPut(REST_SERVICE_URI + "/4");
            StringEntity params = new StringEntity(json.toString());
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
// handle response here...
        } catch (Exception ex) {
            // handle exception here
        } finally {
            httpClient.close();
        }
    }
}
