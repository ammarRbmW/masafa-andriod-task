package com.example.masafa.ui.main;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.masafa.R;
import com.example.masafa.model.Product;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    ProductViewModel productViewModel;
    ProductVerticalViewModel productVerticalViewModel;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_2);

        productViewModel = new ViewModelProvider(this).get(ProductViewModel.class);
        productViewModel.getProducts();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        final ProductListAdapter adapter = new ProductListAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        productViewModel.productNameMutableLiveData.observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> productModels) {
                adapter.setList(productModels);
            }
        });

        productVerticalViewModel = new ViewModelProvider(this).get(ProductVerticalViewModel.class);
        productVerticalViewModel.getVerticalProducts();
        RecyclerView recyclerVerticalView = findViewById(R.id.recycler_vertical);
        final ProductVerticalListAdapter adapterVertical = new ProductVerticalListAdapter();
        recyclerVerticalView.setLayoutManager(new LinearLayoutManager(this));
        recyclerVerticalView.setAdapter(adapterVertical);
        productVerticalViewModel.productNameMutableLiveData.observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> productModels) {
                adapterVertical.setList(productModels);
            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
