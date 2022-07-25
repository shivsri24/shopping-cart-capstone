package com.octrix.shoppingcart;

public class SKU {

    private Constants.SKU skuName;
    private double skuPrice;
    private int skuId;
    private int quantity;

    public SKU(Constants.SKU skuName, double skuPrice, int skuId, int quantity){
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.skuId = skuId;
        this.quantity = quantity;
    }


    public Constants.SKU getSkuName() {
        return skuName;
    }

    public void setSkuName(Constants.SKU skuName) {
        this.skuName = skuName;
    }

    public double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}