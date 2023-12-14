package logica_programacao;

import java.util.Scanner;

public class Exercicio103 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matriz = new int[3][3];

            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int menorValor = matriz[0][0];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] < menorValor) {
                        menorValor = matriz[i][j];
                    }
                }
            }

            System.out.println("Matriz 3x3 informada:");
            exibirMatriz(matriz);

            System.out.println("O menor valor na matriz é: " + menorValor);

            scanner.close();
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

