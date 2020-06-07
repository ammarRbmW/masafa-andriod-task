package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductFlushApi {

    @Expose
    @SerializedName("API")
    private Api api;
    @Expose
    @SerializedName("OUTPUT")
    private Output output;
    @Expose
    @SerializedName("STATUS")
    private Status status;

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
