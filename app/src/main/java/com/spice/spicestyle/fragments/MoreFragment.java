package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;
import com.spice.spicestyle.adapters.ParentAdapter;
import com.spice.spicestyle.expandableview.ParentList;
import com.spice.spicestyle.models.ChildModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MoreFragment extends Fragment {
    private RecyclerView recyclerView;


    public MoreFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        ChildModel about = new ChildModel("About Us", R.mipmap.about_us);
        ChildModel spice = new ChildModel("Spice Story", R.mipmap.spice_story);
        ChildModel careers = new ChildModel("Careers", R.mipmap.careers);
        ChildModel press = new ChildModel("Press Releases", R.mipmap.press_releases);
        ChildModel customer = new ChildModel("Customer Support", R.mipmap.customer_support);
        ChildModel blog = new ChildModel("Our Blog", R.mipmap.our_blog);
        ChildModel contact = new ChildModel("Contact Us", R.mipmap.contact);

        ParentList about_Spicestore = new ParentList("kjshg",Arrays.asList(about, spice, careers, press, customer, blog, contact));
        ParentList second = new ParentList("dss",Arrays.asList(press, blog));
        List<ParentList> parentList = new ArrayList<>();
        parentList.add(about_Spicestore);
        parentList.add(second);


        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        ParentAdapter adapter = new ParentAdapter(getActivity(), parentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }




}
