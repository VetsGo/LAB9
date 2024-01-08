package org.example;

import java.util.List;

public class Products {
    private int id;
    private String title;
    private int price;
    private String description;
    private Categories category;
    private List<String> images;

    public Products(int id, String title, int price, String description, Categories category, List<String> images) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.images = images;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public Categories getCategory() {
        return this.category;
    }

    public List<String> getImages() {
        return this.images;
    }
}