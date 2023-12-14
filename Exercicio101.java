package logica_programacao;

import java.util.Scanner;

public class Exercicio101 {

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

            int soma = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    soma += matriz[i][j];
                }
            }

            double media = (double) soma / (4 * 4);


            System.out.println("Matriz 4x4 informada:");
            exibirMatriz(matriz);

            System.out.println("A média dos elementos da matriz é: " + media);

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

