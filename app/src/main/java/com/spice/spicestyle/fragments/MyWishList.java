package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.spice.spicestyle.R;
import com.spice.spicestyle.adapters.MyWishListAdapter;
import com.spice.spicestyle.apputil.ShoppingCartItemDecorator;
import com.spice.spicestyle.models.WishListModel;

import java.util.ArrayList;


public class MyWishList extends Fragment {

    private RecyclerView rvLayout;
    private MyWishListAdapter wishListAdapter;
    private ArrayList<WishListModel> arrayList;
    private TextView tvTotalItems;


    public MyWishList() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my_wish_list,container, false);

        tvTotalItems = (TextView) view.findViewById(R.id.tvTotalItems);
        rvLayout = (RecyclerView) view.findViewById(R.id.recyclerView);

        arrayList = new ArrayList<>();
        arrayList.add(new WishListModel(R.mipmap.cam, "skjhkjshkldg", 1500, "lsjkdghklhs"));

        wishListAdapter = new MyWishListAdapter(getActivity(), arrayList);

        if(arrayList.size()> 0){

            tvTotalItems.setText(arrayList.size() +" items");
        }


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rvLayout.setLayoutManager(mLayoutManager);
        rvLayout.setItemAnimator(new DefaultItemAnimator());
        rvLayout.addItemDecoration(new ShoppingCartItemDecorator(getActivity(), LinearLayoutManager.VERTICAL));
        rvLayout.setAdapter(wishListAdapter);


        return view;
    }

    public void onButtonPressed(Uri uri) {

    }


}
