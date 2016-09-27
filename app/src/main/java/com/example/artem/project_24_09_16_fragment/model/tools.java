package com.example.artem.project_24_09_16_fragment.model;

/**
 * Created by Artem on 24.09.2016.
 */
public class tools {
    private int id;
    private String brand;
    private String model;
    private String imageUrl;
    private String type;
    private double price;
    private int quantity;

    public tools(int id, String brand, String model, String imageUrl, String type, double price, int quantity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.imageUrl = imageUrl;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public tools() {

    }

    public int getId() {
        return id;
    }

    public tools setId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public tools setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public tools setModel(String model) {
        this.model = model;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public tools setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public tools setType(String type) {
        this.type = type;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public tools setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public tools setQuantity(int quantity) {
        this.quantity = quantity;

        return this;
    }
}
