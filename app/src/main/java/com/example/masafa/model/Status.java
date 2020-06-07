package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {
    @Expose
    @SerializedName("MSRV")
    private String msrv;
    @Expose
    @SerializedName("SRV")
    private String srv;
    @Expose
    @SerializedName("LCR")
    private int lcr;
    @Expose
    @SerializedName("KEY")
    private String key;
    @Expose
    @SerializedName("MESSAGE")
    private String message;
    @Expose
    @SerializedName("CODE")
    private int code;

    public String getMsrv() {
        return msrv;
    }

    public void setMsrv(String msrv) {
        this.msrv = msrv;
    }

    public String getSrv() {
        return srv;
    }

    public void setSrv(String srv) {
        this.srv = srv;
    }

    public int getLcr() {
        return lcr;
    }

    public void setLcr(int lcr) {
        this.lcr = lcr;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
