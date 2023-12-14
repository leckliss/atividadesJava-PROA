package logica_programacao;

import java.util.Scanner;

public class Exercicio108 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matriz = new int[4][4];

            System.out.println("Digite os elementos da matriz 4x4:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int[] maioresValoresPorLinha = new int[4];
            for (int i = 0; i < 4; i++) {
                int maiorValorLinha = matriz[i][0];
                for (int j = 1; j < 4; j++) {
                    if (matriz[i][j] > maiorValorLinha) {
                        maiorValorLinha = matriz[i][j];
                    }
                }
                maioresValoresPorLinha[i] = maiorValorLinha;
            }

            System.out.println("Matriz 4x4 informada:");
            exibirMatriz(matriz);

            for (int i = 0; i < 4; i++) {
                System.out.println("O maior valor na linha " + (i + 1) + " é: " + maioresValoresPorLinha[i]);
            }

            scanner.close();
        }

        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}
