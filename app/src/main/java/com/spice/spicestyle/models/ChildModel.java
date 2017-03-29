package com.spice.spicestyle.models;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class ChildModel {

    private String title;
    private int imagesrc;


    public ChildModel(String title, int imagesrc ) {
        this.title = title;
        this.imagesrc = imagesrc;

    }

    public String getTitle() {
        return title;
    }

    public int getImagesrc() {
        return imagesrc;
    }
}
