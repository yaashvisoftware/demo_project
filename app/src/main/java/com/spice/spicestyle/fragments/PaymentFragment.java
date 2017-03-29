package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;

public class PaymentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View shoppingCartView = inflater.inflate(R.layout.fragment_payment_options, container, false);
        return shoppingCartView;
    }
    //End of onCreateView()

    private void findViewIds(View view){
    }
    //End of findViewIds()

    private void setClickListeners(){

    }
    //End of setClickListeners()

    private void setData(){

    }
    //End of setData()

}
