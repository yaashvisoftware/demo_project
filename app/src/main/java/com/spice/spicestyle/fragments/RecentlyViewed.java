package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;
import com.spice.spicestyle.adapters.SearchAdapter;
import com.spice.spicestyle.models.SearchModel;

import java.util.ArrayList;


public class RecentlyViewed extends Fragment {

    private RecyclerView recyclerView;
    private SearchAdapter searchAdapter;
    private ArrayList<SearchModel>  arrayList;



    public RecentlyViewed() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recently_viewed, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();

        arrayList.add(new SearchModel(R.mipmap.shoe, "Shoes",  15000));
        arrayList.add(new SearchModel(R.mipmap.laptop, "Laptop",  15000));
        arrayList.add(new SearchModel(R.mipmap.cam, "Mobile", 15000));
        arrayList.add(new SearchModel(R.mipmap.tab, "Tablet",  15000));
        arrayList.add(new SearchModel(R.mipmap.shoe, "Shoes",  15000));
        arrayList.add(new SearchModel(R.mipmap.laptop, "Laptop", 15000));
        arrayList.add(new SearchModel(R.mipmap.cam, "Mobile",  15000));
        arrayList.add(new SearchModel(R.mipmap.tab, "Tablet", 15000));

        searchAdapter = new SearchAdapter(getActivity(), arrayList);



        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(searchAdapter);



        return view;
    }

    public void onButtonPressed(Uri uri) {

    }


}
