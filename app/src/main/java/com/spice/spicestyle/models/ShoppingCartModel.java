package com.spice.spicestyle.models;

public class ShoppingCartModel {
    private String itemName, itemImageUrl, itemSkuCode, itemColorCode, itemDiscountCoupon;
    private int itemQuantity;
    private float itemPrice, itemDiscountAmount;
    private boolean isDiscountApplied;

    public ShoppingCartModel(){

    }
    public ShoppingCartModel(String itemName, String itemImageUrl, String itemSkuCode, String itemColorCode, String itemDiscountCoupon,
                             int itemQuantity, float itemPrice, float itemDiscountAmount, boolean isDiscountApplied) {
        this.itemName = itemName;
        this.itemImageUrl = itemImageUrl;
        this.itemSkuCode = itemSkuCode;
        this.itemColorCode = itemColorCode;
        this.itemDiscountCoupon = itemDiscountCoupon;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.itemDiscountAmount = itemDiscountAmount;
        this.isDiscountApplied = isDiscountApplied;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemImageUrl(String itemImageUrl) {
        this.itemImageUrl = itemImageUrl;
    }

    public void setItemSkuCode(String itemSkuCode) {
        this.itemSkuCode = itemSkuCode;
    }

    public void setItemColorCode(String itemColorCode) {
        this.itemColorCode = itemColorCode;
    }

    public void setItemDiscountCoupon(String itemDiscountCoupon) {
        this.itemDiscountCoupon = itemDiscountCoupon;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDiscountAmount(float itemDiscountAmount) {
        this.itemDiscountAmount = itemDiscountAmount;
    }

    public void setDiscountApplied(boolean discountApplied) {
        isDiscountApplied = discountApplied;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemImageUrl() {
        return itemImageUrl;
    }

    public String getItemSkuCode() {
        return itemSkuCode;
    }

    public String getItemColorCode() {
        return itemColorCode;
    }

    public String getItemDiscountCoupon() {
        return itemDiscountCoupon;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public float getItemDiscountAmount() {
        return itemDiscountAmount;
    }

    public boolean isDiscountApplied() {
        return isDiscountApplied;
    }
}
