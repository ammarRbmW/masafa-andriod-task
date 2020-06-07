package com.example.masafa.data;

import com.example.masafa.model.ProductFlushApi;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductClient {
    private static final String BASE_URL = "https://ae.awok.com/api/";
    private ProductInterface productInterface;
    private static ProductClient INSTANCE;

    public ProductClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        productInterface = retrofit.create(ProductInterface.class);
    }

    public static ProductClient getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new ProductClient();
        }
        return INSTANCE;
    }

    public Call<ProductFlushApi> getProducts() {
        return productInterface.getFlashProducts();
    }
    public Call<ProductFlushApi> getVerticalProducts() {
        return productInterface.getVerticalProducts();
    }
}
