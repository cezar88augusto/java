package com.example.java;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor - se for 0, a aplicação é terminada.");

        int soma = 0;

        int x = sc.nextInt();

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        sc.close();
        System.out.println("A soma é: " + soma);
    }

}
