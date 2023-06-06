package com.br.luis.estoque.controller;

public class Product {
    private String productName;
    private int productQuantity;
    private int id = 0;

    public Product() {
    }

    public Product(String productName, int productQuantity, int id) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "- - - - - - - - - - - - - -\nID: " + id + "\nNome do produto: " + productName
                + "\nQuantidade de produtos: " + productQuantity + "\n- - - - - - - - - - - - - -";
    }

}
