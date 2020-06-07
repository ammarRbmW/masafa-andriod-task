package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @Expose
    @SerializedName("TITLE")
    private String title;
    @Expose
    @SerializedName("ITEMS")
    private List<Product> items;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProduct() {
        return items;
    }

    public void setProduct(List<Product> items) {
        this.items = items;
    }
}
