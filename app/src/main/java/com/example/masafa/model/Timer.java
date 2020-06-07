package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timer {
    @Expose
    @SerializedName("S")
    private String s;
    @Expose
    @SerializedName("I")
    private String i;
    @Expose
    @SerializedName("H")
    private String h;
    @Expose
    @SerializedName("D")
    private String d;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
