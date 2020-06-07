package com.example.masafa.ui.main;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.masafa.R;
import com.example.masafa.model.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder> {
    private List<Product> productsList = new ArrayList<>();
    private Context context;

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productNameTV.setText(productsList.get(position).getName());
        holder.newPriceTV.setText(productsList.get(position).getPrices().getPriceNew());
        holder.oldPriceTV.setText(productsList.get(position).getPrices().getPriceOld());
        holder.oldPriceTV.setPaintFlags(holder.oldPriceTV.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,productsList.get(position).getName(), Toast.LENGTH_LONG).show();
            }
        });
        Picasso.get()
                .load(productsList.get(position).getImage().getSrc())
                .into(holder.productImageIv);


    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public void setList(List<Product> productsList) {
        this.productsList = productsList;
        notifyDataSetChanged();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView productNameTV;
        TextView newPriceTV;
        TextView oldPriceTV;
        ImageView productImageIv;
        Button addToCart;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productNameTV = itemView.findViewById(R.id.productNameTv);
            newPriceTV = itemView.findViewById(R.id.new_price_tv);
            oldPriceTV = itemView.findViewById(R.id.old_price_tv);
            productImageIv = itemView.findViewById(R.id.productImageIv);
            addToCart = itemView.findViewById(R.id.addToCart);

        }
    }


}
