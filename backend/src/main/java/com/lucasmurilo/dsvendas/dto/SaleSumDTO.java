package com.lucasmurilo.dsvendas.dto;

import com.lucasmurilo.dsvendas.entities.Seller;

public class SaleSumDTO {

    private String sellerName;
    private double sum;

    public SaleSumDTO(){

    }

    public SaleSumDTO(Seller seller, double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
