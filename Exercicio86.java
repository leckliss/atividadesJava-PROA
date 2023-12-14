package logica_programacao;

import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10]; // Vetor para armazenar os números

        System.out.println("Digite 10 números inteiros:");

        // Lê os números e armazena no vetor
        for (int i = 0; i < 10; i++) {
            numeros[i] = leitor.nextInt();
        }

        // Ordena os números em ordem crescente manualmente (usando bubble sort)
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem crescente:");

        // Exibe os números em ordem crescente
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        leitor.close();
    }
}
