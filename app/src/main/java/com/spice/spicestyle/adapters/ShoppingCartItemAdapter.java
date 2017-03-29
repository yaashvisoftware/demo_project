package com.spice.spicestyle.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;

import java.util.ArrayList;

public class ShoppingCartItemAdapter extends RecyclerView.Adapter<ShoppingCartItemAdapter.ViewHolder>{

    private ArrayList alShoppingCartModel;
    private Context context;
    private final int TYPE_TOTAL_ITEMS = 0;
    private final int TYPE_CART_ITEMS = 2;
    private final int TYPE_TOTAL_PRICE_ITEMS = 1;

    public ShoppingCartItemAdapter(ArrayList alShoppingCartModel, Context context){
        this.alShoppingCartModel = alShoppingCartModel;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType){
            case TYPE_TOTAL_ITEMS: {
                itemView = inflater.inflate(R.layout.model_shopping_cart_number_of_items, parent, false);
                break;
            }

            case TYPE_TOTAL_PRICE_ITEMS: {
                itemView = inflater.inflate(R.layout.model_shopping_cart_sub_total, parent, false);
                break;
            }

            default: {
                itemView = inflater.inflate(R.layout.model_shopping_cart_item, parent, false);
                break;
            }
        }
        ViewHolder holder = new ViewHolder(itemView, viewType);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return alShoppingCartModel.size();
    }

    //Returns the view type of the item at position for the purposes of view recycling.
    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_TOTAL_ITEMS;
        } else if (position == alShoppingCartModel.size() - 1) {
            return TYPE_TOTAL_PRICE_ITEMS;
        } else {
            return TYPE_CART_ITEMS;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View view, int viewType){
            super(view);
            switch (viewType){
                case TYPE_TOTAL_ITEMS: {

                    break;
                }

                case TYPE_TOTAL_PRICE_ITEMS: {

                    break;
                }

                default: {

                    break;
                }
            }
        }
    }
}
