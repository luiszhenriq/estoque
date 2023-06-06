package com.br.luis.estoque.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stock {

    List<Product> products = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Digite o nome do item:");
        String name = sc.next();
        System.out.println("Digite a quantidade de itens");
        int itemQuantity = sc.nextInt();

        Product product = new Product();
        product.setProductName(name);
        product.setProductQuantity(itemQuantity);
        product.setId(products.size() + 1);
        products.add(product);
        System.out.println("- - - - - - - - - - - - - - - - - -");
        System.out.println("Produto foi cadastrado com sucesso!");
        System.out.println("- - - - - - - - - - - - - - - - - -");
    }

    public void listProduct() {
        if (products.size() > 0) {
            System.out.println("Lista de produtos: \n");

            for (Product item : products) {
                System.out.println(item);
            }
        } else {
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Nenhum produto cadastrado");
            System.out.println("- - - - - - - - - - - - - ");

        }
    }

    public void removeProduct() {
        System.out.println("Digite o ID do produto que deseja remover:");
        int removeId = sc.nextInt();
        Product findedProduct = products.stream().filter(product -> removeId == (product.getId()))
                .findFirst().orElse(null);
        if (findedProduct == null) {
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Nenhum produto encontrado");
            System.out.println("- - - - - - - - - - - - -");
        } else {
            int index = products.indexOf(findedProduct);
            products.remove(index);
            System.out.println("- - - - - - - - - - - - - - -");
            System.out.println("Produto removido com sucesso");
            System.out.println("- - - - - - - - - - - - - - -");
        }

    }

    public void updateProduct() {
        System.out.println("Digite o ID do produto que deseja atualizar:");
        int updateId = sc.nextInt();
        Product updatedProduct = products.stream().filter(product -> updateId == (product.getId()))
                .findFirst().orElse(null);
        int index = products.indexOf(updatedProduct);
        if (updatedProduct == null) {
            System.out.println("- - - - - - - - - - - - -");
            System.out.println("Nenhum produto encontrado");
            System.out.println("- - - - - - - - - - - - -");
        } else {
            System.out.println("Selecione o que deseja alterar:");
            System.out.println("1 - Nome do item");
            System.out.println("2 - Quantidade de itens");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite o novo nome do item");
                    String newNameProduct = sc.next();
                    updatedProduct.setProductName(newNameProduct);
                    System.out.println(
                            "- - - - - - - - - - - - - -\nNome do produto atualizado\n- - - - - - - - - - - -");
                    break;

                case 2:
                    System.out.println("Digite a nova quantidade de itens");
                    int newQuantityProduct = sc.nextInt();
                    updatedProduct.setProductQuantity(newQuantityProduct);
                    System.out.println(
                            " - - - - - - - - - - - - - - - -\nQuantidade de produto atualizado\n- - - - - - - - - - - - - - - -");
                    break;

            }
            products.set(index, updatedProduct);
        }
    }
}
