package com.example.masafa.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.masafa.data.ProductClient;
import com.example.masafa.model.Product;
import com.example.masafa.model.ProductFlushApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductVerticalViewModel extends ViewModel {
    public MutableLiveData<List<Product>> productNameMutableLiveData = new MutableLiveData<>();

    public void getVerticalProducts() {
        ProductClient.getINSTANCE().getVerticalProducts().enqueue(new Callback<ProductFlushApi>() {
            @Override
            public void onResponse(Call<ProductFlushApi> call, Response<ProductFlushApi> response) {
                productNameMutableLiveData.setValue(response.body().getOutput().getData().getProduct());

                System.out.println("response.body()");
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<ProductFlushApi> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
