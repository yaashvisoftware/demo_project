package com.spice.spicestyle.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;

import java.util.ArrayList;

/**
 * Created by Yaashvi Software on 3/30/2017.
 */

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersAdapter.ViewHolder>{

    private ArrayList alMyOrders;

    public MyOrdersAdapter(ArrayList alMyOrders){
        this.alMyOrders = alMyOrders;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.model_my_orders_item, parent, false);
        ViewHolder holder = new ViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return alMyOrders.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View view){
            super(view);
        }
    }
}
