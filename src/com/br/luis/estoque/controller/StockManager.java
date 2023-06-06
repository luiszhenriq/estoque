package com.br.luis.estoque.controller;

import java.util.Scanner;

public class StockManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock estoque = new Stock();
        int option;
        System.out.println("- - - - - - - - Bem vindo ao Estoque - - - - - - - -");
        do {
            System.out.println();
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    estoque.addProduct();
                    break;
                case 2:
                    estoque.removeProduct();
                    break;
                case 3:
                    estoque.listProduct();
                    break;
                case 4:
                    estoque.updateProduct();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (option != 5);
    }
}
