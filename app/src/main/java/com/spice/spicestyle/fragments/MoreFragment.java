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
import com.spice.spicestyle.adapters.ParentAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MoreFragment extends Fragment {
    private RecyclerView recyclerView;

    private String[] header = new  String[]{"ABOUT SPICESTORE", "POLICIES", "TERMS AND CONDITION"};

    private Map<String, ArrayList<String>> mapData = new HashMap<>();
    ArrayList<String> subItem;



    public MoreFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        subItem = new ArrayList<>();
        subItem.add("ABOUT US");
        subItem.add("SPICE STORY");
        subItem.add("CAREERS");
        subItem.add("PRESS RELEASES");
        subItem.add("24x7 CUSTOMER CARE");
        subItem.add("OUR BLOG");

        mapData.put(header[0],subItem);
        subItem = new ArrayList<>();

        subItem.add("PAYMENT OPTION");
        subItem.add("SHIPPING POLICIES");
        subItem.add("RETURN & REFUND POLICY");
        subItem.add("COOKIES POLICY");

        mapData.put(header[1],subItem);

        subItem = new ArrayList<>();
        subItem.add("TERMS & CONDITIONS");
        subItem.add("PRIVACY POLICY");

        mapData.put(header[2], subItem);
        /*ChildModel about = new ChildModel("About Us", R.mipmap.about_us);
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
        parentList.add(second);*/



        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager =  new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        List<ParentAdapter.Item> data = new ArrayList<>();

       /* data.add(new ParentAdapter.Item(ParentAdapter.HEADER, "Fruits"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Apple"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Orange"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Banana"));
        data.add(new ParentAdapter.Item(ParentAdapter.HEADER, "Cars"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Audi"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Aston Martin"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "BMW"));
        data.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Cadillac"));*/



        //ParentAdapter.Item places = new ParentAdapter.Item(ParentAdapter.HEADER, "Places");
       /*
       places.invisibleChildren = new ArrayList<>();
        places.invisibleChildren.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Kerala"));
        places.invisibleChildren.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Tamil Nadu"));
        places.invisibleChildren.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Karnataka"));
        places.invisibleChildren.add(new ParentAdapter.Item(ParentAdapter.CHILD, "Maharashtra"));*/

        for(int i = 0; i < header.length; i++){
            ParentAdapter.Item places = new ParentAdapter.Item(ParentAdapter.HEADER, header[i]);
            places.invisibleChildren = new ArrayList<>();
            for(int j = 0; j < mapData.get(header[i]).size(); j ++){
                places.invisibleChildren.add(new ParentAdapter.Item(ParentAdapter.CHILD, mapData.get(header[i]).get(j)));
            }
            data.add(places);


        }


        //data.add(places);

        recyclerView.setAdapter( new ParentAdapter(getActivity(), data));


       /* recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        ParentAdapter adapter = new ParentAdapter(getActivity(), parentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);*/


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }




}
