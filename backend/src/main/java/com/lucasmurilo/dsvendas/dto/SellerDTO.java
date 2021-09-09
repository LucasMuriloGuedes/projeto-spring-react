package com.lucasmurilo.dsvendas.dto;

import com.lucasmurilo.dsvendas.entities.Seller;

import java.io.Serializable;

public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO(){

    }
    public SellerDTO(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
