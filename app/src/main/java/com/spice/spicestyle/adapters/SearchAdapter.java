package com.spice.spicestyle.adapters;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.spice.spicestyle.R;
import com.spice.spicestyle.models.SearchModel;

import java.util.ArrayList;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<SearchModel> arrayList;
    private LayoutInflater layoutInflater;

    public SearchAdapter(Context context, ArrayList<SearchModel> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View convertView = layoutInflater.inflate(R.layout.search_adapter_layout, null);
        MyViewHolder viewHolder = new MyViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        SearchModel searchModel = arrayList.get(position);

        holder.ivImage.setImageResource(searchModel.getIc_launcher());
        holder.tvPrice.setText("Rs." +  searchModel.getProduct_price());
        holder.tvProductName.setText(searchModel.getProduct_name());

        holder.tvPriceOff.setVisibility(View.GONE);
        if(searchModel.getProduct_off_price().length() > 3){

            holder.tvPriceOff.setPaintFlags(holder.tvPriceOff.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            holder.tvPriceOff.setText(searchModel.getProduct_off_price());
            holder.tvPriceOff.setText(searchModel.getProduct_off_price());
            holder.tvPriceOff.setVisibility(View.VISIBLE);
            holder.tvPriceOff.setEnabled(false);
            holder.tvPrice.setGravity(Gravity.LEFT);
        }


    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivImage;
        private TextView tvPriceOff, tvPrice, tvProductName;

        public MyViewHolder(View view) {
            super(view);
            ivImage = (ImageView) view.findViewById(R.id.ivImage);
            tvPriceOff = (TextView) view.findViewById(R.id.tvPriceOff);
            tvPrice = (TextView) view.findViewById(R.id.tvPrice);
            tvProductName = (TextView) view.findViewById(R.id.tvProductName);
        }
    }
}
