package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Output {
    @Expose
    @SerializedName("NAVIGATION")
    private Navigation navigation;
    @Expose
    @SerializedName("DATA")
    private Data data;

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
