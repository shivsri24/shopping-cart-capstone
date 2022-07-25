package com.octrix.shoppingcart;

public class Customer {
    private String customerName;
    private int customerUId;
    private String customerContactDetails;
    private Paywallet paywallet;
    private Cart cart;

    public Customer(String name, int id, String contactNo){
        this.customerName = name;
        this.customerUId = id;
        this.customerContactDetails = contactNo;
        this.paywallet = new Paywallet(500,this.customerUId);
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerUId() {
        return customerUId;
    }

    public void setCustomerUId(int customerUId) {
        this.customerUId = customerUId;
    }

    public Paywallet getPaywallet() {
        return paywallet;
    }

    public void setPaywallet(Paywallet paywallet) {
        this.paywallet = paywallet;
    }


}