package logica_programacao;

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5]; // Array para armazenar os números

        System.out.println("Digite 5 números inteiros:");

        // Lê os números e os armazena no array
        for (int i = 0; i < 5; i++) {
            numeros[i] = leitor.nextInt();
        }

        System.out.println("Números na ordem inversa:");

        // Exibe os números na ordem inversa que foram digitados
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        leitor.close();
    }
}
