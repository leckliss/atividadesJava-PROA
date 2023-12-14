package logica_programacao;

import java.util.Scanner;

public class Exercicio106 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matrizA = new int[2][2];
            int[][] matrizB = new int[2][2];

            System.out.println("Digite os elementos da primeira matriz 2x2:");
            lerMatriz(scanner, matrizA);

            System.out.println("Digite os elementos da segunda matriz 2x2:");
            lerMatriz(scanner, matrizB);

            boolean iguais = verificarMatrizesIguais(matrizA, matrizB);

            System.out.println("Matriz A:");
            exibirMatriz(matrizA);

            System.out.println("Matriz B:");
            exibirMatriz(matrizB);

            if (iguais) {
                System.out.println("As matrizes são iguais.");
            } else {
                System.out.println("As matrizes não são iguais.");
            }
        }

        private static void lerMatriz(Scanner scanner, int[][] matriz) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        private static boolean verificarMatrizesIguais(int[][] matrizA, int[][] matrizB) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (matrizA[i][j] != matrizB[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
