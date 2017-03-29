package com.spice.spicestyle.expandableview;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;
import com.spice.spicestyle.R;
import com.spice.spicestyle.models.ChildModel;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class ChildListViewHolder extends ChildViewHolder {
    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     *
     */

    private TextView tvChildListView;
    private ImageView itemImage;

    public ChildListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvChildListView = (TextView) itemView.findViewById(R.id.tvChildListView);
        tvChildListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("xx", "ChildClicked");
            }
        });
       // itemImage = itemView.findViewById(R.id.child_imageview);
    }
    public void bind(ChildModel childModel) {
        childModel.getTitle();
        tvChildListView.setText(childModel.getTitle());
       // itemImage.setImageResource(Integer.parseInt(childModel.getImagesrc()));
    }

}
