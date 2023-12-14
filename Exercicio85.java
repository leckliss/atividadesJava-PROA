package logica_programacao;

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5]; // Vetor para armazenar os números
        int maior = Integer.MIN_VALUE; // Inicializa a variável de maior valor com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializa a variável de menor valor com o maior valor possível

        System.out.println("Digite 5 números inteiros:");

        // Lê os números e armazena no vetor, verificando o maior e o menor
        for (int i = 0; i < 5; i++) {
            numeros[i] = leitor.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);

        leitor.close();
    }
}
