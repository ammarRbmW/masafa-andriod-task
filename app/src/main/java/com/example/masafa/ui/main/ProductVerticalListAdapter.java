package com.example.masafa.ui.main;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

public class ProductVerticalListAdapter extends RecyclerView.Adapter<ProductVerticalListAdapter.ProductViewHolder> {
    private List<Product> productsList = new ArrayList<>();
    private static AdapterView.OnItemClickListener onItemClickListener;
    private Context context;


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productNameTV.setText(productsList.get(position).getName());
        holder.newPriceTV.setText(productsList.get(position).getPrices().getPriceNew());
        holder.oldPriceTV.setText(productsList.get(position).getPrices().getPriceOld());
        holder.oldPriceTV.setPaintFlags(holder.oldPriceTV.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.addToCartVertical.setOnClickListener(new View.OnClickListener() {
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
        Button addToCartVertical;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productNameTV = itemView.findViewById(R.id.verticalProductNameTv);
            newPriceTV = itemView.findViewById(R.id.verticalProductNewPriceTv);
            oldPriceTV = itemView.findViewById(R.id.verticalProductOldPriceTv);
            productImageIv = itemView.findViewById(R.id.verticalProductImage);
            addToCartVertical = itemView.findViewById(R.id.addToCartVertical);


        }
    }


}
