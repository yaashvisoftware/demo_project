package com.spice.spicestyle.fragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spice.spicestyle.R;
import com.spice.spicestyle.adapters.AccountAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAccountFragment extends Fragment {

    private RecyclerView recyclerView;

    private String[] header = new String[]{"ORDERS", "SPICESTYLE", "PROFILE"};

    private Map<String, ArrayList<String>> mapData = new HashMap<>();
    ArrayList<String> subItem;

    public MyAccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);

        subItem = new ArrayList<>();
        subItem.add("My Orders");
        subItem.add("Returns");

        mapData.put(header[0], subItem);
        subItem = new ArrayList<>();

        subItem.add("My Wishlist");
        subItem.add("Recently Viewed");
        subItem.add("My Review");

        mapData.put(header[1], subItem);

        subItem = new ArrayList<>();
        subItem.add("My Profile");
        subItem.add("Change Password");
        subItem.add("Logout");

        mapData.put(header[2], subItem);


        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        List<AccountAdapter.Item> data = new ArrayList<>();


        for (int i = 0; i < header.length; i++) {
            AccountAdapter.Item places = new AccountAdapter.Item(AccountAdapter.HEADER, header[i]);
            places.invisibleChildren = new ArrayList<>();
            for (int j = 0; j < mapData.get(header[i]).size(); j++) {
                places.invisibleChildren.add(new AccountAdapter.Item(AccountAdapter.CHILD, mapData.get(header[i]).get(j)));
            }
            data.add(places);


        }


        recyclerView.setAdapter(new AccountAdapter(getActivity(), data));


        return view;
    }

    public void onButtonPressed(Uri uri) {

    }


}
