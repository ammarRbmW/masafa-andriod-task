package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api {
    @Expose
    @SerializedName("URI")
    private Uri uri;
    @Expose
    @SerializedName("CURRENCY_SYM")
    private String currencySym;
    @Expose
    @SerializedName("CURRENCY")
    private String currency;
    @Expose
    @SerializedName("LANG")
    private String lang;
    @Expose
    @SerializedName("FORMAT")
    private String format;
    @Expose
    @SerializedName("VERSION")
    private double version;
    @Expose
    @SerializedName("MIN_APP_VERSION")
    private int minAppVersion;
    @Expose
    @SerializedName("MIN_APP_VER")
    private int minAppVer;

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getCurrencySym() {
        return currencySym;
    }

    public void setCurrencySym(String currencySym) {
        this.currencySym = currencySym;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getMinAppVersion() {
        return minAppVersion;
    }

    public void setMinAppVersion(int minAppVersion) {
        this.minAppVersion = minAppVersion;
    }

    public int getMinAppVer() {
        return minAppVer;
    }

    public void setMinAppVer(int minAppVer) {
        this.minAppVer = minAppVer;
    }
}
