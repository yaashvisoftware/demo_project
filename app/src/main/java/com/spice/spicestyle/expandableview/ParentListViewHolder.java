package com.spice.spicestyle.expandableview;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ParentViewHolder;
import com.spice.spicestyle.R;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class ParentListViewHolder extends ParentViewHolder {

    private TextView tvParentListItems;
    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     */
    public ParentListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvParentListItems = (TextView) itemView.findViewById(R.id.tvParentListItems);

        tvParentListItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Log.d("xx", "clicked");
                if (isExpanded()) {
                    collapseView();
                } else {
                    expandView();
                }
            }
        });
    }

    @Override
    public boolean shouldItemViewClickToggleExpansion() {
        return false;
    }


    public void bind(ParentList list) {
        tvParentListItems.setText(list.getName());
    }
}
