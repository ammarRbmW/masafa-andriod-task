package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartData {
    @Expose
    @SerializedName("SSID")
    private String ssid;
    @Expose
    @SerializedName("UID")
    private String uid;
    @Expose
    @SerializedName("SKU")
    private String sku;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
