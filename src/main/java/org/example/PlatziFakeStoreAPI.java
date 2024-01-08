package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class PlatziFakeStoreAPI {
    private static String URL = "https://api.escuelajs.co/api/v1/";
    private HttpClient httpClient;
    private JSONMapper map;

    public PlatziFakeStoreAPI() {
        this.httpClient = HttpClient.newHttpClient();
        this.map = new JSONMapper();
    }
    public String getResponse(String api) throws Exception {
        URI requestUrl = new URI(api);
        HttpRequest request = HttpRequest.newBuilder().uri(requestUrl).GET().build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("HTTP response code: " + response.statusCode());
        }
    }

    public List<Products> getProducts() {
        try {
            return map.mapProducts(getResponse(URL + "products"));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public List<Categories> getCategories() {
        try {
            return map.mapCategories(getResponse(URL + "categories"));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public List<Users> getUsers() {
        try {
            return map.mapUsers(getResponse(URL + "users"));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}