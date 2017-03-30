package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.spice.spicestyle.R;


public class MyProfileFragment extends Fragment {

    private Button btEditProfile;


    public MyProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my_profile, container, false);

        btEditProfile = (Button) view.findViewById(R.id.btEditProfile);

        btEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(new MyEditProfileFragment());
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    public void onButtonPressed(Uri uri) {

    }

    private void replaceFragment(Fragment fragment){

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.llFragmentChange, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


}
