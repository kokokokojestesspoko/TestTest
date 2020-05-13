package com.example.TestTest.model;

public class Overview {
    private String adress;
    private int customerNol;
    private int numberOfOrders;

    public Overview(String adress, int customerNol, int numberOfOrders) {
        this.adress = adress;
        this.customerNol = customerNol;
        this.numberOfOrders = numberOfOrders;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCustomerNol() {
        return customerNol;
    }

    public void setCustomerNol(int customerNol) {
        this.customerNol = customerNol;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
}
