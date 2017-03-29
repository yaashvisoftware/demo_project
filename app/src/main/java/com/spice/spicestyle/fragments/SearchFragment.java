package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.spice.spicestyle.R;
import com.spice.spicestyle.adapters.SearchAdapter;
import com.spice.spicestyle.models.SearchModel;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    private RecyclerView rvLayout;
    private SearchAdapter searchAdapter;
    private ArrayList<SearchModel>  arrayList;
    private EditText etSearch;




    public SearchFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search,container, false);

        rvLayout = (RecyclerView) view.findViewById(R.id.rvLayout);
        arrayList = new ArrayList<>();
        etSearch = (EditText) view.findViewById(R.id.etSearch);

        arrayList.add(new SearchModel(R.mipmap.shoe, "Shoes", "", 15000));
        arrayList.add(new SearchModel(R.mipmap.laptop, "Laptop", "20000", 15000));
        arrayList.add(new SearchModel(R.mipmap.cam, "Mobile", "", 15000));
        arrayList.add(new SearchModel(R.mipmap.tab, "Tablet", "20000", 15000));
        arrayList.add(new SearchModel(R.mipmap.shoe, "Shoes", "", 15000));
        arrayList.add(new SearchModel(R.mipmap.laptop, "Laptop", "20000", 15000));
        arrayList.add(new SearchModel(R.mipmap.cam, "Mobile", "", 15000));
        arrayList.add(new SearchModel(R.mipmap.tab, "Tablet", "20000", 15000));

        searchAdapter = new SearchAdapter(getActivity(), arrayList);



            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
            rvLayout.setLayoutManager(mLayoutManager);
            rvLayout.setAdapter(searchAdapter);



        return view;
    }


    public void onButtonPressed(Uri uri) {

    }


}
