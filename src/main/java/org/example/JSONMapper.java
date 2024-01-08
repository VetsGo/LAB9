package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
public class JSONMapper {
    private Gson gson = new Gson();

    public List<Products> mapProducts(String json) {
        Type productListType = new TypeToken<List<Products>>() {}.getType();
        return gson.fromJson(json, productListType);
    }

    public List<Categories> mapCategories(String json) {
        Type categoryListType = new TypeToken<List<Categories>>() {}.getType();
        return gson.fromJson(json, categoryListType);
    }

    public List<Users> mapUsers(String json) {
        Type userListType = new TypeToken<List<Users>>() {}.getType();
        return gson.fromJson(json, userListType);
    }
}