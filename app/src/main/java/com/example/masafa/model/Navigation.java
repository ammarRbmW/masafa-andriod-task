package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Navigation {
    @Expose
    @SerializedName("MAX_PAGES")
    private int maxPages;
    @Expose
    @SerializedName("PAGE")
    private int page;
    @Expose
    @SerializedName("COUNT")
    private int count;
    @Expose
    @SerializedName("TOTAL")
    private int total;

    public int getMaxPages() {
        return maxPages;
    }

    public void setMaxPages(int maxPages) {
        this.maxPages = maxPages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
