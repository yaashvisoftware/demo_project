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
import com.spice.spicestyle.adapters.ShoppingCartItemAdapter;
import com.spice.spicestyle.apputil.ShoppingCartItemDecorator;
import com.spice.spicestyle.models.ShoppingCartModel;

import java.util.ArrayList;

public class ShoppingCartFragment extends Fragment {

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
        ArrayList alShoppingCartItems = new ArrayList();
        /*String itemName, String itemImageUrl, String itemSkuCode, String itemColorCode, String itemDiscountCoupon,
        int itemQuantity, float itemPrice, float itemDiscountAmount, boolean isDiscountApplied*/
        alShoppingCartItems.add(0);                     //Items Count
        alShoppingCartItems.add(new ShoppingCartModel(
                "Vajero Blue Denim Patch Work Unisex Backpack",
                "image_url",
                "8907622002950",
                "#FF0000",
                "",
                1,
                3800,
                0,
                false));
        alShoppingCartItems.add(new ShoppingCartModel(
                "Spice 4Sound Blue Pocket Earphones with Case",
                "image_url",
                "8907622002189",
                "0000FF",
                "",
                1,
                400,
                0,
                false));
        alShoppingCartItems.add(1);         //For total Amount and checkout

        ShoppingCartItemAdapter adapter = new ShoppingCartItemAdapter(alShoppingCartItems, getActivity());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rvCartItems.setLayoutManager(mLayoutManager);
        rvCartItems.setItemAnimator(new DefaultItemAnimator());
        rvCartItems.addItemDecoration(new ShoppingCartItemDecorator(getActivity(), LinearLayoutManager.VERTICAL));

        rvCartItems.setAdapter(adapter);
    }
    //End of setData()

}
