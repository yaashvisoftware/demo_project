package com.spice.spicestyle.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;


public class MyReviewFragment extends Fragment {

    public MyReviewFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_review, container, false);


        // Inflate the layout for this fragment
        return view;
    }

    public void onButtonPressed(Uri uri) {

    }




}
