package com.octrix.shoppingcart;

import java.util.ArrayList;
import java.util.Random;

public class Transaction {

    public void tranasact(Customer customer){
        double cartTotal = 0;
        int  milkQuantity = 0;

        //Initiating the Cart and Sellables
        Cart cart = new Cart();
        ArrayList<SKU> sellableSKU = new ArrayList<>();

        //Assigning Cart Data
        cart = customer.getCart();
        sellableSKU = cart.getSKU();

        //Discount and offers
        for(SKU sku: sellableSKU){
            cartTotal += sku.getSkuPrice() * sku.getQuantity();
            if(sku.getSkuName() == Constants.SKU.MILK){
                milkQuantity = sku.getQuantity();
                if(milkQuantity >= 2){
                    milkQuantity+=1;
                    sku.setQuantity(milkQuantity);
                }
            }
        }

        if(customer.getPaywallet().getBalance() >= cartTotal && cartTotal >= 100){
            double discount = 0.05 * cartTotal;
            cartTotal = cartTotal - discount;
        }

        System.out.println("Total amount payable: "+cartTotal);
        double remainingWalletBal = customer.getPaywallet().getBalance() - cartTotal;
        customer.getPaywallet().setBalance(remainingWalletBal);
        System.out.println("Remaining payWallet Balance after your recent transaction is :" + (customer.getPaywallet().getBalance()));

    }

    public static void main(String[] args) {
            Transaction trxn = new Transaction();
            Random random = new Random();

            //Setting up the data and SKUs
            Customer customer = new Customer("Test Customer", random.nextInt(10000), "9276732789");
            ArrayList<SKU> sellableList= new ArrayList<>();
            sellableList.add(new SKU(Constants.SKU.MILK,25,84583,2));
            sellableList.add(new SKU(Constants.SKU.APPLE,180,92382,5));
            sellableList.add(new SKU(Constants.SKU.NEWSPAPER,10,13847,10));

            //Setting the Cart
            Cart cart = new Cart();
            cart.setItems(sellableList);
            customer.setCart(cart);

            //Initiating the transaction
            trxn.tranasact(customer);
        }
    }
