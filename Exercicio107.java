package logica_programacao;

import java.util.Scanner;

public class Exercicio107 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definindo a matriz 3x3
            int[][] matriz = new int[3][3];


            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int produtoDiagonalSecundaria = 1;
            for (int i = 0; i < 3; i++) {
                produtoDiagonalSecundaria *= matriz[i][2 - i];
            }

            System.out.println("Matriz 3x3 informada:");
            exibirMatriz(matriz);

            System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonalSecundaria);

        }

        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
