package logica_programacao;

import java.util.Scanner;

public class Exercicio100 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definindo a matriz 3x3
            int[][] matriz = new int[3][3];

            // Lendo os elementos da matriz
            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Encontrando o maior valor na matriz
            int maiorValor = matriz[0][0];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] > maiorValor) {
                        maiorValor = matriz[i][j];
                    }
                }
            }

            // Exibindo a matriz e o maior valor
            System.out.println("Matriz 3x3 informada:");
            exibirMatriz(matriz);

            System.out.println("O maior valor na matriz é: " + maiorValor);

            scanner.close();
        }

        // Função para exibir os elementos de uma matriz 3x3
        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Nova linha para separar as linhas da matriz
            }
            System.out.println(); // Nova linha para melhor formatação
        }
}

