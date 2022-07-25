package com.octrix.shoppingcart;

public class Paywallet {

    private int customerUID;
    private double balance;

    public Paywallet(int balance, int customerUID){
        this.balance = balance;
        this.customerUID = customerUID;
    }
    //getters and setters
    public int getCustomerUID() {
        return customerUID;
    }

    public void setPayWalletUID(int customerUID) {
        this.customerUID = customerUID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}