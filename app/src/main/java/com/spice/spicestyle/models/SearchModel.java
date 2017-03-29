package com.spice.spicestyle.models;

/**
 * Created by yaashvi on 29-Mar-17.
 */

public class SearchModel {

    private String product_name, product_off_price, image_url;
    private long product_price;
    private int ic_launcher;

    public SearchModel(int ic_launcher, String product_name, String product_off_price, long product_price) {
        this.ic_launcher = ic_launcher;
        this.product_name = product_name;
        this.product_off_price = product_off_price;
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_off_price() {
        return "Rs."+product_off_price;
    }

    public long getProduct_price() {
        return product_price;
    }

    public String getImage_url() {
        return image_url;
    }

    public int getIc_launcher() {
        return ic_launcher;
    }
}
