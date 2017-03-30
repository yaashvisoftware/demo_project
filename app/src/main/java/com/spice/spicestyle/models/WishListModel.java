package com.spice.spicestyle.models;

/**
 * Created by yaashvi on 30-Mar-17.
 */

public class WishListModel {

    private int cam;
    private long price;
    private  String productName, productAdded;


    public WishListModel(int cam, String productName, long price, String productAdded) {

        this.cam =cam;
        this.price = price;
        this.productAdded = productAdded;
        this.productName = productName;
    }

    public int getCam() {
        return cam;
    }

    public long getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductAdded() {
        return productAdded;
    }
}
