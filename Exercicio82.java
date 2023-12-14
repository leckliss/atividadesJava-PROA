package logica_programacao;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10]; // Array para armazenar os números
        int soma = 0; // Variável para armazenar a soma dos números

        System.out.println("Digite 10 números inteiros:");

        // Lê os números e os armazena no array
        for (int i = 0; i < 10; i++) {
            numeros[i] = leitor.nextInt();
        }

        // Calcula a soma dos números no array
        for (int i = 0; i < 10; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos 10 números é: " + soma);

        leitor.close();;
    }
}
