package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;

public class ChangePasswordFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View shoppingCartView = inflater.inflate(R.layout.fragment_registration, container, false);
        return shoppingCartView;
    }
    //End of onCreateView()
}
