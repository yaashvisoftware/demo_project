package com.spice.spicestyle.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.ExpandableRecyclerAdapter;
import com.spice.spicestyle.R;
import com.spice.spicestyle.expandableview.ChildListViewHolder;
import com.spice.spicestyle.expandableview.ParentList;
import com.spice.spicestyle.expandableview.ParentListViewHolder;
import com.spice.spicestyle.models.ChildModel;

import java.util.List;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class ParentAdapter extends ExpandableRecyclerAdapter<ParentList,ChildModel, ParentListViewHolder, ChildListViewHolder>{

    private LayoutInflater mInflater;
    private Context context;
    private List<ParentList> parentList;

    public ParentAdapter(Context context , List<ParentList> parentList) {
        super(parentList);
        this.context = context;
        this.parentList = parentList;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ParentListViewHolder onCreateParentViewHolder(@NonNull ViewGroup parentViewGroup, int viewType) {
        View parentView = mInflater.inflate(R.layout.parent_list_view, parentViewGroup, false);
        return new ParentListViewHolder(parentView);
    }

    @NonNull
    @Override
    public ChildListViewHolder onCreateChildViewHolder(@NonNull ViewGroup childViewGroup, int viewType) {
        View childView = mInflater.inflate(R.layout.child_list_view, childViewGroup, false);
        return new ChildListViewHolder(childView);
    }

    @Override
    public void onBindParentViewHolder( ParentListViewHolder parentViewHolder, int parentPosition,  ParentList parent) {
        parentViewHolder.bind(parent);

    }

    @Override
    public void onBindChildViewHolder(ChildListViewHolder childListViewHolder, int parentPosition, int childPosition, ChildModel child) {

        childListViewHolder.bind(child);
    }

    @Override
    public int getItemCount() {
        return parentList.size();
    }

}
