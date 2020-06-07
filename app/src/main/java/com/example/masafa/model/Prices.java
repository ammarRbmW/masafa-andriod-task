package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prices {
    @Expose
    @SerializedName("PERCENT")
    private String percent;
    @Expose
    @SerializedName("DISCOUNT")
    private String discount;
    @Expose
    @SerializedName("PRICE_OLD")
    private String priceOld;
    @Expose
    @SerializedName("PRICE_NEW")
    private String priceNew;

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }

    public String getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(String priceNew) {
        this.priceNew = priceNew;
    }
}
