package com.spice.spicestyle.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;

public class ShoppingCartFragment extends Fragment{

    private RecyclerView rvCartItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View shoppingCartView = inflater.inflate(R.layout.fragment_shopping_cart, container, false);

        findViewIds(shoppingCartView);
        setClickListeners();
        setData();

        return shoppingCartView;
    }
    //End of onCreateView()

    private void findViewIds(View view){
        rvCartItems = (RecyclerView) view.findViewById(R.id.rvCartItems);
    }
    //End of findViewIds()

    private void setClickListeners(){

    }
    //End of setClickListeners()

    private void setData(){

    }
    //End of setData()

}
