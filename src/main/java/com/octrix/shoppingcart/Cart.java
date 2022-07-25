package com.octrix.shoppingcart;

import java.util.ArrayList;

public class Cart {
    private String customerUID;
    private ArrayList<SKU> items = new ArrayList<>();

    public String getCustomerUID() {
        return customerUID;
    }

    public void setUserName(String id) {
        this.customerUID = id;
    }

    public ArrayList<SKU> getSKU() {
        return items;
    }

    public void setItems(ArrayList<SKU> items) {
        this.items = items;
    }
}