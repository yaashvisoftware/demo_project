package com.spice.spicestyle.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.spice.spicestyle.R;
import com.spice.spicestyle.models.WishListModel;

import java.util.ArrayList;

/**
 * Created by yaashvi on 30-Mar-17.
 */

public class MyWishListAdapter extends RecyclerView.Adapter<MyWishListAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<WishListModel> arrayList;
    private LayoutInflater layoutInflater;

    public MyWishListAdapter(Context context, ArrayList<WishListModel> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View convertView = layoutInflater.inflate(R.layout.wish_list_adapter_layout, null);
        MyViewHolder viewHolder = new MyViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        WishListModel wishListModel = arrayList.get(position);

        holder.ivProductImage.setImageResource(wishListModel.getCam());
        holder.tvProductPrice.setText(holder.tvProductPrice.getText() +" " +  wishListModel.getPrice());
        holder.TvProductName.setText(wishListModel.getProductName());
        holder.tvProductAdded.setText(wishListModel.getProductAdded());




    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivProductImage;
        private TextView TvProductName, tvProductPrice, tvProductAdded, tvRemove;
        private Button btAddtoBag;

        public MyViewHolder(View view) {
            super(view);
            ivProductImage = (ImageView) view.findViewById(R.id.ivProductImage);
            tvProductAdded = (TextView) view.findViewById(R.id.tvProductAdded);
            tvProductPrice = (TextView) view.findViewById(R.id.tvProductPrice);
            TvProductName = (TextView) view.findViewById(R.id.tvProductName);
            tvRemove = (TextView) view.findViewById(R.id.tvRemove);
            btAddtoBag = (Button) view.findViewById(R.id.btAddtoBag);

        }
    }
}
