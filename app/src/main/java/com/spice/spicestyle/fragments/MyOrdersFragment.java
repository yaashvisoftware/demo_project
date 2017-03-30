package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;
import com.spice.spicestyle.adapters.MyOrdersAdapter;
import com.spice.spicestyle.apputil.ShoppingCartItemDecorator;

import java.util.ArrayList;

/**
 * Created by Yaashvi Software on 3/30/2017.
 */

public class MyOrdersFragment extends Fragment{
    private RecyclerView rvOrderedItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View shoppingCartView = inflater.inflate(R.layout.fragment_my_orders, container, false);

        findViewIds(shoppingCartView);
        setClickListeners();
        setData();

        return shoppingCartView;
    }
    //End of onCreateView()

    private void findViewIds(View view){
        rvOrderedItems = (RecyclerView) view.findViewById(R.id.rvOrderedItems);
    }
    //End of findViewIds()

    private void setClickListeners(){

    }
    //End of setClickListeners()

    private void setData(){
        ArrayList alMyOrders = new ArrayList();
        alMyOrders.add(0);
        alMyOrders.add(1);
        alMyOrders.add(2);
        MyOrdersAdapter adapter = new MyOrdersAdapter(alMyOrders);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rvOrderedItems.setLayoutManager(mLayoutManager);
        rvOrderedItems.setItemAnimator(new DefaultItemAnimator());
        rvOrderedItems.addItemDecoration(new ShoppingCartItemDecorator(getActivity(), LinearLayoutManager.VERTICAL));

        rvOrderedItems.setAdapter(adapter);
    }
    //End of setData()
}
