package logica_programacao;

import java.util.Scanner;

public class Exercicio110 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int linhas = 2;
            int colunas = 2;

            int[][] matrizA = new int[linhas][colunas];
            int[][] matrizB = new int[linhas][colunas];
            int[][] resultado = new int[linhas][colunas];

            System.out.println("Digite os elementos da matriz A:");
            lerMatriz(scanner, matrizA);

            System.out.println("Digite os elementos da matriz B:");
            lerMatriz(scanner, matrizB);

            subtrairMatrizes(matrizA, matrizB, resultado);

            System.out.println("Resultado da subtração das matrizes:");
            exibirMatriz(resultado);
        }

        private static void lerMatriz(Scanner scanner, int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        private static void subtrairMatrizes(int[][] matrizA, int[][] matrizB, int[][] resultado) {
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }
        }

        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

}
