package com.spice.spicestyle.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;
import com.spice.spicestyle.models.ShoppingCartModel;

import java.util.ArrayList;

public class ShoppingCartItemAdapter extends RecyclerView.Adapter<ShoppingCartItemAdapter.ViewHolder>{

    ArrayList<ShoppingCartModel> alShoppingCartModel;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_shopping_cart_item, parent, false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view){
            super(view);
        }
    }
}
