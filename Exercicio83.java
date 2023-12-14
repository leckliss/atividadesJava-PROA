package logica_programacao;

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[7]; // Vetor para armazenar os números
        int soma = 0;

        System.out.println("Digite 7 números inteiros:");

        // Lê os números e armazena no vetor
        for (int i = 0; i < 7; i++) {
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }

        double media = (double) soma / 7; // Calcula a média

        System.out.println("A média dos 7 números é: " + media);

        leitor.close();
    }
}
