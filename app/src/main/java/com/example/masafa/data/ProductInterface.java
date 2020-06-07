package com.example.masafa.data;

import com.example.masafa.model.ProductFlushApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductInterface {
    @GET("flash/")
    Call<ProductFlushApi> getFlashProducts();

    @GET("home/")
    Call<ProductFlushApi> getVerticalProducts();
}
