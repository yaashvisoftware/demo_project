package com.spice.spicestyle.expandableview;

import com.bignerdranch.expandablerecyclerview.model.Parent;
import com.spice.spicestyle.models.ChildModel;

import java.util.List;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class ParentList implements Parent<ChildModel> {

    private List<ChildModel> items;
    private String name;

    public ParentList(String name, List<ChildModel> items){

        this.items = items;
        this.name = name;

    }

   /* public ParentList(List<ChildModel> items) {
        this.items = items;
    }*/

    @Override
    public List<ChildModel> getChildList() {
        return items;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    public String getName() {
        return name;
    }
}
