package logica_programacao;

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args){
//        69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.

        int soma = 0;

        Scanner number = new Scanner(System.in);

        for(int n = 0;n<5; n++){
            System.out.println("número " + (n + 1) + ": ");
            int numero = number.nextInt();

            soma += numero;
        }
        double media = (double) soma / 5;

        System.out.println(media);
    }
}
