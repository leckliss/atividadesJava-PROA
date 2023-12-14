package logica_programacao;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5]; // Vetor para armazenar os números
        int numerosPares = 0; // Variável para contar números pares

        System.out.println("Digite 5 números inteiros:");

        // Lê os números e armazena no vetor, verificando se são pares
        for (int i = 0; i < 5; i++) {
            numeros[i] = leitor.nextInt();
            if (numeros[i] % 2 == 0) {
                numerosPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);

        leitor.close();
    }
}
